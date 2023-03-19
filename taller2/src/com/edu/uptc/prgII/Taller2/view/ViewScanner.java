package com.edu.uptc.prgII.Taller2.view;

import java.util.Scanner;

<<<<<<< HEAD
=======
/**
 * 
 * @author Andres barrera, javier lopez y Diego Patiño
 *
 */
>>>>>>> ae790d8a1eea55aff176d827275df6f5baa7dc2e
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
<<<<<<< HEAD
}
=======
}
>>>>>>> ae790d8a1eea55aff176d827275df6f5baa7dc2e
