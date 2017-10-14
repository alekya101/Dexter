package com.inheritance;

public class Test {
	public static void main(String[] args)
	{
		Person t=new Manager();
		t.printname();
		Person t1=new Junior();
		Person t2=new Supervisor();
		System.out.println("Role is " +t2.getRole());
		
		
		
	}

}
