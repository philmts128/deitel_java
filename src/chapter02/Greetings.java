/*
 Programa em java que lê nome e dá boas vindas!
 Author: Philippe Matias
*/

import java.util.Scanner;

public class Greetings
{
	public static void main(String[] args)
	{
		var scan = new Scanner(System.in);

		System.out.print("| enter your name: ");
		var name = scan.nextLine();

		System.out.println("| hello and welcome, " + name + "!");
	}
}