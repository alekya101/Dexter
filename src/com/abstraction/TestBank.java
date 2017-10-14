package com.abstraction;

import java.util.Scanner;

public class TestBank {
	  float calculate(int amt,int mnth)
	{ 
		return(amt*mnth);
	}
	public static void main(String[] args)
	{
		TestBank t=new TestBank();
		
		
		System.out.println("enter the deposited amount");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		System.out.println("enter total no of  months");
		Scanner sc1=new Scanner(System.in);
		int mnth=sc1.nextInt();
		
		
		Bank b=new Bofa();
		float y=(t.calculate(amt, mnth))*(b.interest());
		System.out.println(mnth+ " months after in Bofa is:" +y);
		   b= new chase();
		float p=(t.calculate(amt, mnth))*(b.interest());
		System.out.println(mnth+" months after in chase is:" +p);
	     b= new CitiBank();
		float q=(t.calculate(amt, mnth))*(b.interest());
		System.out.println(mnth+" months after in CitiBank is:" +q);
		
		
	}
	
}
