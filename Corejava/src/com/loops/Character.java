package com.loops;

public class Character {
	
	static Character charactr=new Character();
	
	char ch='A';
	char ch1='Z';
	
	

	void iteration() {
		while(ch<='Z') {
			System.out.print(" "+ch );
			ch++;
			
		}
		
	}
	void iteration1() {
		while(ch>='A') {
			System.out.print(" "+ch );
			ch--;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charactr.iteration();
		System.out.println();
		charactr.iteration1();
		
	}

}
