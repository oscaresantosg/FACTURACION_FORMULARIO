package co.edu.uptc.modelo;

import java.util.ArrayList;

public class Factura {

	private String numFactura;
	
	private double subtotal;

	private double baseGravable;

	private double total;

	private ArrayList<Producto> productos;
	
	private ArrayList<ResumenImpuestos> listaResumenImpuesto;

	/**
	 * @return the numFactura
	 */
	public String getNumFactura() {
		return numFactura;
	}

	/**
	 * @param numFactura the numFactura to set
	 */
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return the baseGravable
	 */
	public double getBaseGravable() {
		return baseGravable;
	}

	/**
	 * @param baseGravable the baseGravable to set
	 */
	public void setBaseGravable(double baseGravable) {
		this.baseGravable = baseGravable;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the productos
	 */
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	/**
	 * @return the listaResumenImpuesto
	 */
	public ArrayList<ResumenImpuestos> getListaResumenImpuesto() {
		return listaResumenImpuesto;
	}

	/**
	 * @param listaResumenImpuesto the listaResumenImpuesto to set
	 */
	public void setListaResumenImpuesto(ArrayList<ResumenImpuestos> listaResumenImpuesto) {
		this.listaResumenImpuesto = listaResumenImpuesto;
	}

	@Override
	public String toString() {
		return "Factura [numFactura=" + numFactura + ", subtotal=" + subtotal + ", baseGravable=" + baseGravable
				+ ", total=" + total + "\n, productos=" + productos + "\n, listaResumenImpuesto=" + listaResumenImpuesto
				+ "]";
	}
	
	
}
