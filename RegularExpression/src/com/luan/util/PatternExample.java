/*
 * Tên file: PatternExample.java
 * Tác giả: Luan NT
 * Ngày tạo: Feb 22, 2024
 */
package com.luan.util;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String str = "bbb";
		System.out.println("Using String matches method: "+str.matches(".bb"));
		System.out.println("Using Pattern matches method: "+Pattern.matches(".bb", str));
	}
}
