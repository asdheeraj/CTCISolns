package Hard;

import java.util.*;

/*
 * 
 * Write a method to randomly generate a set of m integers from an array of size n. Each
 * element must have equal probability of being chosen.
 * 
 */

public class Pb3_RandomSet {

	//Given random generator
		private int rand(int lower, int higher){
			return lower+(int)(Math.random()*(higher-lower+1));
		}
		
	public int[] pickMIteratively(int[] array,int m){
		int[] subset = new int[m];
		for(int i=0;i<m;i++){
			subset[i] = array[i];
		}
		
		for(int i=m;i<array.length;i++){
			int k = rand(0,i);
			if(k<m){
				subset[k] = array[i];
			}
		}
		
		return subset;
	}
	
	public static void main(String[] args) {
		Pb3_RandomSet random = new Pb3_RandomSet();
		int[] answer = random.pickMIteratively(new int[]{1,2,3,4,5,6,7,8},4);
		System.out.println("After Modification : " +Arrays.toString(answer));
	}
}
