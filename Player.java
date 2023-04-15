package assignmentweek6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<>();

	int score;

	String playerName;

	public Player(String playerName) {
		this.playerName = playerName;
	}

	
	public void describe() {
		System.out.println("\tPlayer Name:" + playerName);
		for (Card card : this.hand) {
			card.describe();
			System.out.println();
		}
	}
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
		
	}
	public void incrementScore() {
		this.score += 1;
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
}
