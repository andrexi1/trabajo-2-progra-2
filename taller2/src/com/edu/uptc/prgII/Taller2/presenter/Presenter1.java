package com.edu.uptc.prgII.Taller2.presenter;

import java.io.File;
import java.io.IOException;

import com.edu.uptc.prgII.Taller2.view.ViewFile;
import com.edu.uptc.prgII.Taller2.view.ViewScanner;

/**
 * 
 * @author Andres barrera, javier lopez y Diego Patiño
 *
 */
public class Presenter1 {
	private static ViewFile reader = new ViewFile();
	private static ViewScanner Scanner = new ViewScanner();

	/**
	 * Este es el menu de la clase.
	 * 
	 * @throws IOException
	 */
	public static void MENU() throws IOException {
		String options = "1. Introducir texto. \n2. Guardar Texto. \n3. Borrar archivo. \n4. Salir.";
		int OptionSelection = 0;

		while (OptionSelection != 4) {
			OptionSelection = Integer.parseInt(Scanner.readString(options));
			switch (OptionSelection) {
			case 1:
				String aux1 = Scanner.readString("ingrese direccion de archivo");
				FileReader(aux1);
				MENU();
				break;
			case 2:
				String aux2 = Scanner.readString("ingrese direccion de origen del archivo");
				String aux3 = Scanner.readString("ingrese direccion de destino del archivo");
				String aux4 = Scanner.readString("ingrese el tipo de archivo bin o txt");
				FileWriter(aux2, aux3 + aux4);
				MENU();
				break;
			case 3:
				String aux5 = Scanner.readString("ingrese direccion de origen del archivo");
				String aux6 = Scanner.readString("ingrese nombre del archivo");
				DeletFile(aux5, aux6);
				MENU();
			case 4:
				Scanner.showMessage("Saliendo..");
				Scanner.breaker();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + OptionSelection);
			}
		}
	}

	/**
	 * Este nos permite leer un archivo y lo imprime eliminandole los espacios en
	 * blanco. Con una interfaz se puede editar el metodo y eliminaria lo que la
	 * interfaz le ordene.
	 * 
	 * @param path
	 * @throws IOException
	 */
	public static void FileReader(String path) throws IOException {
		String[] delet = reader.ReadFle(path).split("\\s+");
		for (int i = 0; i < delet.length; i++) {
			Scanner.showMessage(delet[i]);
		}
	}

	/**
	 * este metodo nos pertite almacenar el archivo en otro lugar.
	 * 
	 * @param initialPath
	 * @param FinalPath
	 * @throws IOException
	 */
	public static void FileWriter(String initialPath, String FinalPath) throws IOException {
		String[] text = reader.ReadFle(initialPath).split("\\s+");
		String aux = " ";

		for (int i = 0; i < text.length; i++) {
			aux += text[i];
			reader.writeFile(FinalPath, aux);
		}
		Scanner.showMessage("Finalizado...");
	}

	/**
	 * este metodo elimina algun archivo almacenado.
	 * 
	 * @param Path
	 * @param nameFile
	 * @throws IOException
	 */
	public static void DeletFile(String Path, String nameFile) throws IOException {
		File folderFiles = new File(Path);
		File[] files = folderFiles.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].getName().equals(nameFile)) {
				files[i].delete();
				Scanner.showMessage("Eliminado...");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		MENU();
	}
}