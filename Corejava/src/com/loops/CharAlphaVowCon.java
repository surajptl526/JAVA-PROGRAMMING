package com.loops;

import java.util.Scanner;

public class CharAlphaVowCon {
	
	static CharAlphaVowCon chr=new CharAlphaVowCon();
	Scanner sc=new Scanner(System.in);
	char ch;
	
	void getinput() {
		System.out.println("Enter character");
		ch=sc.next().charAt(0);
			
	}
	
	void alphabet() {
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
		System.out.println("Entered character is Alphabet");
		}
		
		else {
			System.out.println("Entered character is not Alphabet");
			
		}
	}
	void vowCon() {
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("Entered character is Vowel");	
		}
		else {
			System.out.println("Entered character is Consonant");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chr.getinput();
		chr.alphabet();
		chr.vowCon();
		
	}

}
