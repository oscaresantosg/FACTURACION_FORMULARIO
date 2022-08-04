package co.edu.uptc.modelo;

import java.util.ArrayList;

public class Cliente {

	

	private long numDocumento;
	
	private TipoDoc tipoDocumento;
	
	private ArrayList<Factura> facturas;

	/**
	 * @return the numDocumento
	 */
	public long getNumDocumento() {
		return numDocumento;
	}

	/**
	 * @param numDocumento the numDocumento to set
	 */
	public void setNumDocumento(long numDocumento) {
		this.numDocumento = numDocumento;
	}

	/**
	 * @return the tipoDocumento
	 */
	public TipoDoc getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(TipoDoc tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the facturas
	 */
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	/**
	 * @param facturas the facturas to set
	 */
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	
	@Override
	public String toString() {
		return "Cliente [numDocumento=" + numDocumento + ", tipoDocumento=" + tipoDocumento + "\n, facturas=" + facturas
				+ "]\n";
	}
	
}
