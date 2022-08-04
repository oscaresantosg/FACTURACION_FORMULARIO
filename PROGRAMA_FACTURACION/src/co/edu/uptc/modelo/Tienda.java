package co.edu.uptc.modelo;

import java.util.ArrayList;

public class Tienda {

	private String nombre;
	
	private ArrayList<Cliente> clientes;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the clientes
	 */
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * @param clientes the clientes to set
	 */
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + "\n, clientes=\n" + clientes + "]\n";
	}
	
	
}
