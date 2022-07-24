package com.switchcase;

import java.util.Scanner;

public class Alphabate {
	static Alphabate alpha=new Alphabate();
	Scanner sc=new Scanner(System.in);
	
	char ch;
	
	void getinput() {
		System.out.println("Enter chARACTER");
		ch=sc.next().charAt(ch);
	}
	
	void vowel() {
		switch (ch) {
		case 'a':
		case 'e':	
		case 'i':
		case 'o':
		case 'u':	
		case 'A':	
		case 'E':	
		case 'I':
		case 'O':	
		case 'U':	
			System.out.println("Entered character is Vowel");
		
		break;
		default:
			System.out.println("Entered character is Consonant");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alpha.getinput();
		alpha.vowel();
		
		
	}

}
