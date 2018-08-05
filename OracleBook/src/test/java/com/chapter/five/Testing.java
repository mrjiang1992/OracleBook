package com.chapter.five;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;


class Testing {

	@Test
	void Test() {
		int[] costOfCards = {1,2,3,1,2,3,1,2,3,1,2,3,1,2,2,1,2,3,1,2,3,1,2,3};
		int[] dmgOfCards = {1,1,1,2,2,2,3,4,5,2,5,7,2,8,8,9,10,1,2,3,6,7,7,20};
		
		System.out.println(CanYouLethal(costOfCards,dmgOfCards,3,20));
	}

	private Boolean CanYouLethal(int[] costOfCards, int[] dmgOfCards, int cardCap, int dmgNeeded) {
		int[] isCardUsed = new int[costOfCards.length];
		LinkedList<Integer> cardsUsed = new LinkedList<>();
		while(true) {
			if(cardCap > 0) {
				int positionOfCard = addCard(costOfCards,dmgOfCards,isCardUsed);
				cardsUsed.add(positionOfCard);
				
			}
		}
	}

	private int addCard(int[] costOfCards, int[] dmgOfCards, int[] isCardUsed) {
		// TODO Auto-generated method stub
		return 0;
	}



}
