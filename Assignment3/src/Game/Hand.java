package Game;

import java.util.*;

public class Hand {

	private static Card[] cardArray;
	
	private Random rand = new Random();

	public Hand (int size) {
		cardArray = new Card[size];
		
		for (int i = 0; i < size; i++) {
			cardArray[i] = new Card();
		}
	}
	
	public void deal () {
		for (int i =0; i < cardArray.length; i++) {
			cardArray[i].random();
		}
	}
	
	//returns boolean if one card has been randomely replaced or not
	public boolean replace (int index) {
		boolean returnVal = false;
		cardArray[index].random();
		for (int i = 0; i < cardArray.length; i++) {
			if (rand.nextInt(5) == 0) {
				cardArray[i].incrementCard();
				returnVal = true;
			}
		}
		return returnVal;
	}
	
	public String getCards() {
		String handString = "";
		for (int i = 0; i < cardArray.length; i++) {
			handString += cardArray[i].getChar() + " ";
		}
		return handString;
	}
	
	public boolean gameOver() {
		boolean returnValue = true;
		
		for (int i = 1; i < cardArray.length; i++) {
			if (cardArray[i-1].getChar() != cardArray[i].getChar()) {
				returnValue = false;
			}
		}
		
		return returnValue;
	}
}
