//Import predefined package for dialog/input boxes

import java.util.Scanner;

public class MadLib 
{
//Begin class	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//Create strings for user input
		System.out.println("What's your name? ");
		String name = in.nextLine();
		System.out.println("Write a verb + ing: ");
		String averb = in.nextLine();
		System.out.println("Write another verb + ing: ");
		String bverb = in.nextLine();
		System.out.println("Write a location: ");
		String location = in.nextLine();
		System.out.println("Give a number > ");
		int nm = in.nextInt();
		
		madlib(name, averb, bverb, location, nm);
	}
	public static void madlib(String name, String averb, String bverb, String location, int nm)
	{
		System.out.println("Hi, my name is " + name + "!");
		System.out.println("Let me tell you a story. One night, I was " + averb + " for a long period of time, ");
		System.out.println("until my little sister called me. She said that her car was " + bverb + ".");
		System.out.println("She asked me if I could pick her up from the " + location + ".");
		System.out.println("So, I drove for " + nm + " miles to pick up my sister and the next day, we brought her car back home.");
		
	}//end main
	
}//end class

