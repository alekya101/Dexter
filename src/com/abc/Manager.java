package com.abc;

public class Manager extends Person1 {
	
	public static void main(String[] args)
	{
		 Manager m=new Manager();
		 m.setName("Alekhya");
		 System.out.println("name is:" +m.getName());
		 m.setId(101);
		 System.out.println("Id is:" +m.getId());
		 m.setAddress("Hyderabad");
		 System.out.println("Address is:" +m.getAddress());
		 m.setDOB("18-05");
		 System.out.println("DOB is:" +m.getDOB());
		 m.setAge(22);
		 System.out.println("Age is:" +m.getAge());
		 m.setPhonenumber(8122);
		 System.out.println("phone number is:" +m.getPhonenumber());
		 m.setOrganization("Dexter");
		 System.out.println("organization is:" +m.getOrganization());
		 m.setRole("abc");
		 System.out.println("role is:" +m.getRole());
		 
		 
	}

}
