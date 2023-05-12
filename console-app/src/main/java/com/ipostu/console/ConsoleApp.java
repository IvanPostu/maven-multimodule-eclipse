package com.ipostu.console;

import java.util.Scanner;

import com.ipostu.shared.CustomStringUtils;

public class ConsoleApp {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in);){
			System.out.print("Ented data: ");
			String input = scanner.nextLine();
			
			System.out.println(CustomStringUtils.reverse(input));
			
		}
	}
	
}
