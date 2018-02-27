package Game;

import java.util.*;

public class GameApp {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hand player1 = new Hand(3);
		Scanner s = new Scanner(System.in);
		
		while (!player1.gameOver()) {
			System.out.println("Here is your hand: " + player1.getCards());
			System.out.println("Input a card index to replace: (0, 1, 2)");
			int input = s.nextInt();
			if (player1.replace(input)) {
				System.out.println("A random card has been replaced!");
			}
		}
		System.out.println("All cards match, you win!");
	}

}
