package co.edu.uptc.modelo;

public class ResumenImpuestos {

	@Override
	public String toString() {
		return "ResumenImpuestos [tipoImpuesto=" + tipoImpuesto + ", baseGravable=" + baseGravable + ", total=" + total
				+ "]";
	}

	private String tipoImpuesto;

	private double baseGravable;

	private double total;

	/**
	 * @return the tipoImpuesto
	 */
	public String getTipoImpuesto() {
		return tipoImpuesto;
	}

	/**
	 * @param tipoImpuesto the tipoImpuesto to set
	 */
	public void setTipoImpuesto(String tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
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
	
	
}
