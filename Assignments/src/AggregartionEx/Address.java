package AggregartionEx;

public class Address {
	
	String stdAddress;
	Student s;
	public Address(String address, Student objs) {
		this.stdAddress = address;	
		this.s = objs;
	}
	
	public void print() {
		System.out.println("Name=" + s.stdName); 
		System.out.println("RollNo=" + s.stdRollNo);
		System.out.println("Address=" + stdAddress);
	}
	public static void main(String[] args) {
		Student objStd= new Student("Shreya", 32);
		Address objAdd= new Address("Block2, House No.92, Mayapuri, New Delhi",objStd);
		objAdd.print();
		
	}

}
