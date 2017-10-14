package com.abc;

import java.util.Scanner;
class Salary
{
	int sal=2000;
	
	
}
class Bonus extends Salary
{
	 int bonus=20; 

}


	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
    id=sc.nextInt();
   
    System.out.println("enter name:");
    Scanner sc1=new Scanner(System.in);
    name=sc1.nextLine();
    Bonus b=new Bonus();
    int x=b.sal;
    int y=b.bonus;
    
   int totsal;
   totsal=(x*y);
   System.out.println("salary is:" +totsal);
}
	

}
