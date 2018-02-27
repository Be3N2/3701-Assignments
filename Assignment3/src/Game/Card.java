package Game;

import java.util.*;

public class Card {

	private static char[] names = new char[]{'C', 'D', 'H', 'S'};
	private char suit;
	
	private Random rand = new Random();
	
	public Card () {
		random();
	}
	
	
	//Random move to next suit in order
	public void incrementCard() {
		switch (suit) {
			case 'C':
				suit = 'D';
				break;
			case 'D':
				suit = 'H';
				break;
			case 'H':
				suit = 'S';
				break;
			case 'S':
				suit = 'C';
				break;
		}
	}
	
	public void random() {
		suit = names[rand.nextInt(4)];
	}
	
	public char getChar() {
		return suit;
	}
}
