package by.academy.homework2;

import java.util.Scanner;

public class Deal {
	public static void main(String[] args) {
		String[] suits = { "clubs", "diamonds", "hearts", "spades" };
		String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		String[] deck = new String[suits.length * ranks.length];
		int k = 0, n;
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[k++] = ranks[i] + " " + suits[j];
			}
		}
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter right number of players");
			while (!sc.hasNextInt()) {
				System.out.println("That's not right number");
				sc.next();
			}
			n = sc.nextInt();
		} while (n <= 0 || n * 5 > deck.length);
		for (int i = 0; i < deck.length; i++) {
			int x = (int) (Math.random() * (deck.length - 1));
			String temp = deck[x];
			deck[x] = deck[i];
			deck[i] = temp;
		}
		for (int i = 0; i < n * 5; i++) {
			System.out.print(deck[i] + "  ");
			if ((i + 1) % 5 == 0) {
				System.out.println('\n');
			}
		}
		sc.close();
	}
}
