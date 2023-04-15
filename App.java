package assignmentweek6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// enter name of players
		System.out.println("Enter name of player one:");
		Scanner sc = new Scanner(System.in);
		String playerOnesc = sc.nextLine();
		
		System.out.println("Enter name of player two:");
		Scanner sc2 = new Scanner(System.in);
		String playerTwosc = sc.nextLine();
		sc.close();
		sc2.close();
		// creates new players
		Player playerOne = new Player(playerOnesc);
		Player playerTwo = new Player(playerTwosc);
		System.out.println("Our players are: "+ playerOne.playerName + " and " + playerTwo.playerName);
		// creates deck and shuffles
		Deck deck = new Deck();
		deck.shuffle();
		// splits the deck between the players
		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		// shows players hands
		System.out.println();
		System.out.println(playerOne.playerName + "s Deck:");
			playerOne.describe();
			System.out.println("***************");
		System.out.println(playerTwo.playerName + "s Deck:");	
			playerTwo.describe();
			System.out.println("***************");
		// start of game
		System.out.println();
		System.out.println("Start of game!!");
		System.out.println("*************************");
		System.out.println();
		for (int i = 1; i <= 26; i++) {
			// each player shows a card and highest value gets a point
			System.out.println("Round " + i + ":");
			Card playerOneCard = playerOne.flip();
			System.out.println(playerOne.playerName + "'s card is: ");
			playerOneCard.describe();
			System.out.println();
			Card playerTwoCard = playerTwo.flip();
			System.out.println(playerTwo.playerName + "'s card is: ");
			playerTwoCard.describe();
			System.out.println();
			if (playerOneCard.value > playerTwoCard.value) {
				playerOne.incrementScore();
				System.out.println(playerOne.playerName + " wins this round");
				System.out.println("The score is - " + playerOne.playerName + ": " + playerOne.score + " "
						+ playerTwo.playerName + ": " + playerTwo.score);
				System.out.println();
			} else if (playerTwoCard.value > playerOneCard.value) {
				playerTwo.incrementScore();
				System.out.println(playerTwo.playerName + " " + "wins this round");
				System.out.println("The score is - " + playerOne.playerName + ": " + playerOne.score + " "
						+ playerTwo.playerName + ": " + playerTwo.score);
				System.out.println();
			} else {
				System.out.println("It's a draw");
				System.out.println("The score is - " + playerOne.playerName + ": " + playerOne.score + " " +playerTwo.playerName + ": " + playerTwo.score);
				System.out.println();
			}
		}
		// end of game, shows score and winner or if draw
		System.out.println(playerOne.playerName +"s "+"final score is: " + playerOne.score);
		System.out.println(playerTwo.playerName +"s "+"final score is: " +playerTwo.score);
		if (playerOne.score > playerTwo.score) {
			System.out.println(playerOne.playerName + " Wins!");
		} else if (playerOne.score < playerTwo.score) {
			System.out.println(playerTwo.playerName + " Wins!");
		} else {
			System.out.println("It's a draw!");
		}
	}

}
