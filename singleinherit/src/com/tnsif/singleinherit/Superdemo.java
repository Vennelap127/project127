package com.tnsif.singleinherit;

public class Superdemo {
	int var=50;
	void display() {
		System.out.println("the child value is "+var);
		System.out.println("the childl value is" +super.var);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superdemo ob=new Superdemo();
		ob.display();

	}

}
