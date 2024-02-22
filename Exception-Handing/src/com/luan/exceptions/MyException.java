/*
 * Tên file: MyException.java
 * Tác giả: Luan NT
 * Ngày tạo: Feb 22, 2024
 */
package com.luan.exceptions;

public class MyException extends Exception {

	private static final long serialVersionUID = 4664456874499611218L;

	private String errorCode = "Unknown_Exception";

	public MyException(String message, String errorCode) {
		super(message);
		this.errorCode=errorCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
}
