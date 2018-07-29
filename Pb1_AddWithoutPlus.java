package Hard;

/*
 * 1. Write a Function that adds two numbers. You should not use the +
 * or any arithmetic operators
 */

public class Pb1_AddWithoutPlus {
	
	public int addRecursive(int a, int b){
	if(b==0) return a;
	int sum = a^b;
	int carry = (a&b)<<1;
	return(addRecursive(sum, carry));
	}
	
	public static void main(String[] args) {
		Pb1_AddWithoutPlus adder = new Pb1_AddWithoutPlus();
		System.out.println(adder.addRecursive(23,33));
	}
}
