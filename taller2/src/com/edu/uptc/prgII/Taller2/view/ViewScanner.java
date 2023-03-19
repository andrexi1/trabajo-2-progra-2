package com.edu.uptc.prgII.activityNo2.view;

import java.util.Scanner;

/**
 * 
 * @author Andres barrera, javier lopez y Diego Patiño
 *
 */
public class ViewScanner {
	private Scanner console;

	/**
	 * 
	 */
	public ViewScanner() {
		console = new Scanner(System.in);

	}

	/**
	 * 
	 * @param message
	 * @return
	 */
	public String readString(String message) {
		showMessage(message);
		return console.nextLine();

	}

	/**
	 * 
	 * @param message
	 */
	public void showMessage(String message) {
		System.out.println(message);
	}
	
	public void breaker() {
		console.close();
	}
}
