import java.util.*;

public class ESPGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 				//Declaring scanner	

		
		String studentName,									//Declaring String student inputs
			   studentDescription,
			   studentGuess,
			   dueDate;
		
															//boolean to return tue if the input is correct
		int incorrectRounds = 0,
			correctRounds = 0;									//Instantiating Due date and round variable
		
		
		
		System.out.print("Enter your name:");			//Beginning prompt
		studentName = scan.nextLine();
		System.out.println("Describe yourself: ");
		studentDescription = scan.nextLine();
		System.out.println("Due Date: ");
		dueDate = scan.nextLine();
		System.out.println("CMSC203 Assignment1: Test your ESP Skills\n");
		
		
		
		Random r = new Random();						
		
	for(int round = 1; round <= 10; round++) 		//beginning loop to simulate 10 rounds
	{

	
		
		int randInt = r.nextInt(5)+1;					//function to generate random color
		String randColor = "";
		switch (randInt)
		{
			case 1:
				randColor = "red";
				break;
			case 2:
				randColor = "green";
				break;
			case 3: 
				randColor = "blue";
				break;
			case 4:
				randColor = "orange";
				break;
			case 5:
				randColor = "yellow";
				break;
			
		}

		System.out.println(randColor);
					//beginning prompt for student input
		System.out.println("Round " + round );
		System.out.println("\n\nI am thinking of a color.\n"+
						   "Is it Red, Green, Blue, Orange, or Yellow?\n"
						  +"Enter Your Guess: "	);
		studentGuess = scan.next();
	
		int numberofGuesses = 0 ;							//number of incorrect guesses a user can make
															//before the round moves on
							if (studentGuess.equalsIgnoreCase(randColor))
						{
							correctRounds++;
						}
		while(!studentGuess.equalsIgnoreCase(randColor) && numberofGuesses < 3)
			{			
						System.out.println("You entered the incorrect color, Is it Red, Green, Blue, Orange, or Yellow?\n"
						+ "Enter your guess: ");
						studentGuess = scan.next();
						numberofGuesses++;
	
			}

		if (numberofGuesses > 1)
		{
			incorrectRounds++;
		}
		

			numberofGuesses = 0;
			System.out.println("I was thinking of " + randColor +"\n\n");
			
	}		
		System.out.println("Game Over\n"
							+ "You guessed " + correctRounds 
							+ " out of 10 colors correctly");
		
		System.out.println("User Name:" + studentName 
							+ "\nUser Description: " +studentDescription
							+ "\nDue Date: " + dueDate);
			
	}
}

/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Esp class for running esp game to guess randomly generated colors
 * Due: 09/12/2023
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: __Hendrick Nguyen____
*/