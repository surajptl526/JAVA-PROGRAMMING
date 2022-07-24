package com.loops;

import java.util.Scanner;

public class Triangle {
       static Triangle trngl=new Triangle();
       Scanner sc=new Scanner(System.in);
       
       int ang1,ang2,ang3;
       int length1,length2,length3;
       
       void getinput() {
    	   System.out.println("Enter traingles first,second & third angle");
    	   ang1=sc.nextInt();
    	   ang2=sc.nextInt();
    	   ang3=sc.nextInt();
    		System.out.println("Enter three sides of Triangles");
    		length1=sc.nextInt();
    		length2=sc.nextInt();
    		length3=sc.nextInt();
    		
       }
       void validTraingleAngle() {
    	   if (ang1+ang2+ang3==180) {
    		   System.out.println("Traingle is Valid traingle");
    		   
    	   }
    	   else {
    		   System.out.println("Traingle is not valiod traingle");
    	   }
       }
       void validTrangleSide() {
    	   if (length1+length2>length3 ||length1+length3>length2 ||length2+length3>length1) {
    		   System.out.println("Traingle is Valid");
    	   }
       }
       
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		trngl.getinput();
		trngl.validTraingleAngle();
		trngl.validTrangleSide();
		

	}

}
