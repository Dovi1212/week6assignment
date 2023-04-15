package assignmentweek6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<>();

	Deck() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] numbers = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace", };

		for (String suit : suits) {
			int value = 2;
			for (String number : numbers) {
				Card card = new Card(number, suit, value);
				this.deck.add(card);
				value++;
			}
		}
	}

	public List<Card> getCards() {
		return deck;
	}

	public void setCards(List<Card> cards) {
		this.deck = cards;
	}

	public void describe() {
		for (Card card : this.deck) {
			card.describe();
		}
	}
	public void shuffle() {
		Collections.shuffle(this.deck);
	}
	
	public Card draw() {
		Card card = this.deck.remove(0);
		return card;
		
	}
}
