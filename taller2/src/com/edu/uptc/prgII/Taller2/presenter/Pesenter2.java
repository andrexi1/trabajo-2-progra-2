package com.edu.uptc.prgII.activityNo2.presenter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.edu.uptc.ActivityNo2.model.Vehicle;
import com.edu.uptc.prgII.activityNo2.view.ViewFile;
import com.edu.uptc.prgII.activityNo2.view.ViewScanner;

/**
 * 
 * @author Andres barrera, javier lopez y Diego Patiño
 *
 */
public class Pesenter2 {
	private static ViewFile Fileworker = new ViewFile();
	private static ViewScanner Scanner = new ViewScanner();
	private static ArrayList<Vehicle> setVehicle = new ArrayList<Vehicle>();

	/**
	 * 
	 * @throws IOException
	 */
	public static void MENU() throws IOException {
		String options = "1. Añadir vehiculo. \n2. Imprimir lista. \n3. Buscar. \n4. Salir.";
		int OptionSelection = 0;

		while (OptionSelection != 4) {
			OptionSelection = Integer.parseInt(Scanner.readString(options));
			switch (OptionSelection) {
			case 1:
				String aux1 = Scanner.readString("ingrese marca");
				String aux2 = Scanner.readString("ingrese modelo");
				int aux3 = Integer.parseInt(Scanner.readString("ingrese año"));
				String aux4 = Scanner.readString("ingrese placa");
				String aux5 = Scanner.readString("ingrese Color");
				String aux6 = Scanner.readString("ingrese el tipo de archivo. "); 
				addVehicle(aux1, aux2, aux3, aux4, aux5, aux6);
				MENU();
				break;
			case 2:
				Scanner.showMessage("La lista es: ");
				getList();
				MENU();
				break;
			case 3:
				String aux7 = Scanner.readString("Ingrese nombre del archivo");
				SearchVehicle(aux7);
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
	 * 
	 * @param brand
	 * @param model
	 * @param year
	 * @param plate
	 * @param color
	 * @throws IOException
	 */
	public static void addVehicle(String brand, String model, int year, String plate, String color, String type) throws IOException {
		Vehicle vehicle = new Vehicle(brand, model, year, plate, color);
		setVehicle.add(vehicle);
		Fileworker.writeFile("src/Vehicles/Vehicle" + (vehicle.getId() + 1) + type, vehicle.toString());
	}

	/**
	 * 
	 * @param path
	 */
	public static void getList() {
		String path = "src/Vehicles/";
		File files = new File(path);
		File[] folderfiles = files.listFiles();
		for (int i = 0; i < folderfiles.length; i++) {
			Scanner.showMessage((i+1)+ ". "+folderfiles[i].getName());
		}
	}

	/**
	 * 
	 * @param name
	 * @throws IOException 
	 */
	public static void SearchVehicle(String name) throws IOException {
		String path = "src/Vehicles/";
		File files = new File(path);
		File[] folderfiles = files.listFiles();
		for (int i = 0; i < folderfiles.length; i++) {
			if (folderfiles[i].getName().equals(name)) {
				Scanner.showMessage("Vehiculo encontrado: ");
			}else {
				Scanner.showMessage("Vehiculo no encontrado.");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		MENU();
	}
}
