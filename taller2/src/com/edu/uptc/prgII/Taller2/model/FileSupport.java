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
	 * Metodo constructor de la clase. 
	 * @param fileIn
	 */
	public FileSupport(File fileIn) {
		super();
		this.fileIn = fileIn;
	}

	/**
	 * Metodo get file. 
	 * @return
	 */
	public File getFileIn() {
		return fileIn;
	}

	/**
	 * metodo set file. 
	 * @param fileIn
	 */
	public void setFileIn(File fileIn) {
		this.fileIn = fileIn;
	}

	/**
	 * Este metodo nos convierte el file en un String para poder imprimirlo o guardarlo en otros archivo. 
	 */
	@Override
	public String toString() {
		return "FileSupport [fileIn=" + fileIn + "]";
	}

}