package com.ibm;

import com.A;

public class B extends A {
	public int age = 20;		//shadowing
	void m2(){
		System.out.println(age);
	}

}
