package com.edu.uptc.prgII.Taller2.model;

import java.io.File;

/**
 * 
 * @author Andres barrera, javier lopez y Diego Patiño
 *
 */
public class FileSupport {
	private File fileIn;

	/**
	 * 
	 * @param fileIn
	 */
	public FileSupport(File fileIn) {
		super();
		this.fileIn = fileIn;
	}

	/**
	 * 
	 * @return
	 */
	public File getFileIn() {
		return fileIn;
	}

	/**
	 * 
	 * @param fileIn
	 */
	public void setFileIn(File fileIn) {
		this.fileIn = fileIn;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "FileSupport [fileIn=" + fileIn + "]";
	}

}