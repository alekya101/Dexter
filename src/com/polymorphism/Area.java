package com.polymorphism;

public class Area {
	
	void calculate(int s)
	{
		System.out.println("Area of Square is:" );
		System.out.println(s*s);
	}
	void calculate(int l,int b )
	{
		System.out.println("Area of Rectangle is:" );
		System.out.println(l*b);
	}
	public static void main(String[] args)
	{
		Area a=new Area();
		a.calculate(2);
		a.calculate(2,3);
 	}

}
