package com.edu.uptc.prgII.Taller2.model;

/**
 * 
 * @author Andres barrera, javier lopez y Diego Patiño
 *
 */
public class Vehicle {
	private String brand;
	private String model;
	private int year;
	private String plate;
	private String Color;
	private int id = (int) Math.abs(Math.random() * 1000);

	/**
	 * Este es el metodo constructor de la clase.
	 * 
	 * @param brand
	 * @param model
	 * @param year
	 * @param plate
	 * @param color
	 * @param id
	 */
	public Vehicle(String brand, String model, int year, String plate, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.plate = plate;
		Color = color;
	}

	/**
	 * Este es un constructor vacio que nos ayuda como auxiliar.
	 */
	public Vehicle() {
		super();
	}

	/**
	 * Metodo get brand nos devuelve la marca del vehiculo.
	 * 
	 * @return retorna brand marca.
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Metodo get model nos devuelve el modelo del vehiculo.
	 * 
	 * @returnretorna model modelo.
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Metodo get year nos devuelve el a�o del vehiculo.
	 * 
	 * @return retorna year a�o de fabricacion del vehiculo.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Metodo get Plate nos devuelve la placa del vehiculo.
	 * 
	 * @return retorna plate la placa del vehiculo.
	 */
	public String getPlate() {
		return plate;
	}

	/**
	 * Metodo get color nos devuelve el color del vehiculo.
	 * 
	 * @return retorna color que denota el color del vehiculo.
	 */
	public String getColor() {
		return Color;
	}

	/**
	 * Metodo get id nos devuelve el id del vehiculo. esta id se aute genera.
	 * 
	 * @return retorna el id del vehiculo.
	 */
	public int getId() {
		return id;
	}
	/**
	 * Este metodo nos vuelet el Vehiculo en un String para poder guardarlo o imprimirlo. 
	 */
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + ", plate=" + plate + ", Color="
				+ Color + ", id=" + id + "]";
	}
}