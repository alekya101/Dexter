package com.abc;

class Test1
{
	void display()
	{
		System.out.println("hii");
	}
}
 class Test2 extends Test1
{
	void  show()
	{
		System.out.println("hello");
	}
}
class Test3 extends Test2
{
	void print()
	{
		System.out.println("welcome");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		Test3 t=new Test3();
		t.print();
	     t.show();
	     t.display();
		

	}

}
