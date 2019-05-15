package org.test;

public class Sample extends Hello{

	public Sample() {
	//	super(20);
	
		System.out.println("default constructor ");
	}
	
	
	public Sample(int id) {
	
		System.out.println("int para constructor "+id);
	}
	
	
	
	public static void main(String[] args) {
		Sample s=new Sample();
		Sample s1=new Sample(10);
	}
}
