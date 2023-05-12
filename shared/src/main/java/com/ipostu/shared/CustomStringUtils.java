package com.ipostu.shared;

public class CustomStringUtils {

	public static String reverse(String value) {
		return new StringBuilder(value).reverse().toString();
	}

}
