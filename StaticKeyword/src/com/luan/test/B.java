package com.luan.test;
import static com.luan.test.A.MAX;
import static com.luan.test.A.foo;

public class B {

	public static void main(String args[]){
		System.out.println(MAX); //normally A.MAX
		foo(); // normally A.foo()
	}
}