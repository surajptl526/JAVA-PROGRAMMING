package com.loops;

import java.util.Scanner;

public class AlphaDigitSpecChar {
	
	static AlphaDigitSpecChar cha=new AlphaDigitSpecChar();
	Scanner sc=new Scanner(System.in);
	char ch;
	
	void getInput() {
		System.out.println("Enter character");
		ch=sc.next().charAt(0);
		
	}
	void alphaDigitSpecChar() {
		if((ch>='A' && ch<='Z') ||(ch>='a' &&ch<='z')){
			System.out.println("Entered character is Alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("Entered character is Digit");
		}
		
		else {
			System.out.println("Entered character is Special Character");
			
		}
	}
	void upperLowerCase() {
		if(ch>='A' && ch<='Z') {
			System.out.println("Entered character is Upper Case");
		}
		else if(ch>='a' &&ch<='z') {
			System.out.println("Entered character is Lower Case");
		}
		else {
			System.out.println("Entered character is not Alphabet");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			cha.getInput();
			cha.alphaDigitSpecChar();
			cha.upperLowerCase();
	}
	

}
