package Hard;

import java.util.*;

/*
 * Write a method to shuffle a deck of cards. It must be a perfect shuffle-In other 
 * words, each of the 52! permutations of the deck has to be equally likely.Assume that you
 * are given a random number generator which is perfect.
 * 
 */

public class Pb2_Shuffle {
	
	
	//Given random generator
	private int rand(int lower, int higher){
		return lower+(int)(Math.random()*(higher-lower+1));
	}
	
	public int[] shuffleArrayIteratively(int[] cards){
		for(int i=0;i<cards.length;i++){
			int k = rand(0,i);
			int temp = cards[k];
			cards[k] = cards[i];
			cards[i] = temp;
		}
		return cards;
	}
	
	public static void main(String[] args) {
		Pb2_Shuffle shuffler = new Pb2_Shuffle();
		int[] cards = {1,2,3,4,5,6,7,8,9,0};
		System.out.println("Array before shuffle: "+Arrays.toString(cards));
		System.out.println("Array after shuffle: "+Arrays.toString(shuffler.shuffleArrayIteratively(cards)));
	}
	
}
