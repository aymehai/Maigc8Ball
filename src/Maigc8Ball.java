import java.util.Random;
import java.util.Scanner;

public class Maigc8Ball {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] MagicBall = new String[20];
		Random randomNumber = new Random();
		String repeat = "y";

		MagicBall[0] = "It is certain";
		MagicBall[1] = "It is decidedly so";
		MagicBall[2] = "Without a doubt";
		MagicBall[3] = "Yes definitely";
		MagicBall[4] = "You may rely on it";
		MagicBall[5] = "As I see it, yes";
		MagicBall[6] = "Most likely";
		MagicBall[7] = "Outlook good";
		MagicBall[8] = "Yes";
		MagicBall[9] = "Signs point to yes";
		MagicBall[10] = "Reply hazy try again";
		MagicBall[11] = "Ask again later";
		MagicBall[12] = "Better not tell you now";
		MagicBall[13] = "Cannot predict now";
		MagicBall[14] = "Concentrate and ask again";
		MagicBall[15] = "Don't count on it";
		MagicBall[16] = "My reply is no";
		MagicBall[17] = "My sources say no";
		MagicBall[18] = "Outlook not so good";
		MagicBall[19] = "Very doubtful";

		do {
			int randomMagicBallNumber = randomNumber.nextInt(20);
			System.out.println("What will you like to ask?");
			keyboard.nextLine();

			System.out.println("Magic 8-Ball Says: " + MagicBall[randomMagicBallNumber]);

			System.out.println(" ");
			System.out.println("Do you have another question for the Magic 8-Ball? y/n");
			repeat = keyboard.nextLine();
		} while (repeat.equals("y"));

		System.out.println("Thank you for using Magic 8-Ball");
	}
}
