package com.edu.uptc.prgII.Taller2.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ViewFile {
	/**
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public String ReadFle(String path) throws IOException {
		File fileInput = new File(path);
		FileInputStream input = new FileInputStream(fileInput);
		byte[] containt = new byte[(int) fileInput.length()];
		input.read(containt);
		input.close();
		return new String(containt);
	}

	/**
	 * 
	 * @param finalPath
	 * @param contain
	 * @return
	 * @throws IOException
	 */
	public boolean writeFile(String finalPath, String contain) throws IOException {
		File fileInput = new File(finalPath);
		FileOutputStream Output = new FileOutputStream(fileInput);
		Output.write(contain.getBytes());
		Output.close();
		return true;
	}
}