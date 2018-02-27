package cards;

import java.util.*;

public class Cards {
	
	//3701 Assignment 1 by Ben Wakefield

	static String[] names = new String[]{"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		System.out.print("Guess a card in my hand:");
		
		//get input from the user named input
		Scanner s = new Scanner(System.in) ;
		String input = s.nextLine();
		
		//new hand of size 5
		String[] hand = new String[5];
		
		//fill it with random cards
		hand = generateHand(hand);
		
		//compare input to each card in hand
		if (compareHand(input, hand)) {
			//if true print found
			System.out.println("I did have at least one of those.");
		} else {
			System.out.println("Sorry, I did not have any of those");
		}
		
		//print every card in the hand
		outputHand(hand);
	}
	
	
	
	//fills whatever array is passed with random cards and returns it
	public static String[] generateHand(String[] empty) {
		for (int i = 0; i < empty.length; i++) {
			//rand.nextInt gets values 0-12 (same as array indexes)
			empty[i] = names[rand.nextInt(13)];
		}
		return empty;
	}
	
	//loops through cards comparing input to each, if it finds a match it stops and returns true
	public static boolean compareHand(String input, String[] cards) {
		for (int i = 0; i < cards.length; i++) {
			if(input.equalsIgnoreCase(cards[i])) return true;
		}
		return false;
	}
	
	//loops through the array passed to it printing out each String
	public static void outputHand(String[] cards) {
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + "  ");
		}
	}
}