package com.luan.util;
import com.luan.access.TestB;

public class TestE extends TestB {

	public static void main(String[] args) {
		new TestB().methodPublic();
		new TestB().methodProtected(); // compile time error

		// works, accessing super class protected method using subclass
		new TestE().methodProtected();

	}

}
