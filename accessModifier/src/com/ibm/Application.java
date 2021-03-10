package com.ibm;

import com.A;

public class Application {
	public static void main(String[] args) {
		//B b = new A();
		//B b = new B();
		//A a = new A();
		A b = new B();
		((B)b).m2();		//downcasting
		System.out.println(b.age);
		b.m1();
	}

}
