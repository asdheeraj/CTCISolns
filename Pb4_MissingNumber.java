package Hard;

import java.util.*;
import java.math.*;
import Hard.BitInteger;

public class Pb4_MissingNumber {
	
	int findMissing(ArrayList<BitInteger> array){
		return findMissing(array,0);
	}
	
	int findMissing(ArrayList<BitInteger> input, int column){
		if(column>=BitInteger.INTEGER_SIZE){
			return 0;
		}
		
		ArrayList<BitInteger> oneBits = new ArrayList<>(input.size()/2);
		ArrayList<BitInteger> zeroBits = new ArrayList<>(input.size()/2);
		
		for(BitInteger t:input){
			if(t.fetch(column)==0){
				zeroBits.add(t);
			}else {
				oneBits.add(t);
			}
		}
		
		if(zeroBits.size()<=oneBits.size()){
			int v = findMissing(zeroBits, column+1);
			return (v<<1)|0;
		} else {
			int v = findMissing(oneBits, column+1);
			return (v<<1)|1;
		}
	}

}
