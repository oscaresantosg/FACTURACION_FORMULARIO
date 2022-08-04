package co.edu.uptc.negocio;

import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

import co.edu.uptc.modelo.Cliente;
import co.edu.uptc.modelo.Factura;
import co.edu.uptc.modelo.ImpuestoEnum;
import co.edu.uptc.modelo.Producto;
import co.edu.uptc.modelo.Tienda;

public class TiendaBean {

	private Tienda tienda;

	public TiendaBean() {
		tienda = new Tienda();
	}

	public void separarCadenas(String cadena) {
		// Implementar la logica para separar la cadena
		String[] parts = cadena.split("\\n");
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		for (int i = 0; i < parts.length; i++) {
			String temporal[] = parts[i].split("\\|");
			Cliente cliente = new Cliente();
			// desarrollar logica para tipo de documento
			// cliente.setTipoDocumento(temporal[0].trim()); hay que cambiar el tipo de doc
			cliente.setNumDocumento(Long.parseLong(temporal[1].trim()));
			ArrayList<Factura> facturas = new ArrayList<Factura>();
			// desarrollo de logica para multiples productos
			Factura nuevaFactura = new Factura();
			ArrayList<Producto> productos = new ArrayList<Producto>();
			Producto producto = new Producto();
			producto.setCodigo(temporal[2].trim());
			producto.setDescripcion(temporal[3].trim());
			producto.setCantidad(Double.parseDouble(temporal[4].trim()));
			producto.setPrecioBase(Double.parseDouble(temporal[5].trim()));
			double precioVenta = calcularPrecioVenta(producto.getPrecioBase(), producto.getCantidad());
			//double precioConIva = precioConIva+((precioVenta * producto.getImpuesto())/100;
			//producto.setPrecioIVAincluido(precioVenta);
			//producto.setPrecioIVAincluido(precioVenta(temporal[6].trim()));
			
			
			// sacar el IVA y demas calculos solcitados
			productos.add(producto);
			nuevaFactura.setProductos(productos);
			facturas.add(nuevaFactura);
			
			cliente.setFacturas(facturas);
			clientes.add(cliente);
			System.out.println("venta agregada");
			System.out.println("este es el precio de los productos de esa compra: $ "+ precioVenta);
			System.out.println("estas son las facturas" + facturas);
			System.out.println("estos son los clientes: " + cliente);
			//System.out.println("este es el valor del iva de la compra"+ precioVenta * producto.getImpuesto());
		}
		cargarTienda(clientes);

	}

	private double precioVenta(String trim) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void cargarTienda(ArrayList<Cliente> clientes) {
		tienda.setNombre("TIENDITA DE BARRIO");
		tienda.setClientes(clientes);
		// System.out.println(tienda);
	}

	public ArrayList<Producto> buscarPersona(long numero) {

		try {

			ArrayList<Cliente> temporal = tienda.getClientes();
			for (Cliente cliente : temporal) {
				if (cliente.getNumDocumento() == numero) {

					JOptionPane.showMessageDialog(null, "cliente encontrado! NUmero doc: " + numero);
					System.out.println("persona buscada! NUmero doc: " + numero);
					return cliente.getFacturas().get(0).getProductos();

				}
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerException thrown!");
			JOptionPane.showMessageDialog(null, "ingrese un valor valido");
		}
		return null;

		// else {JOptionPane.showMessageDialog(null, "ingrese un valor valido");
		// break;

	}
	
	public double calcularPrecioVenta(double precioBase, double cantidad ) {
		double precioVentatot;
		precioVentatot = precioBase * cantidad;
		return precioVentatot;
	
	/**
	 * @param numero2
	 * @return
	
	public Producto calcularIva(Producto numero2) {
		
		ArrayList<Cliente> temporal = tienda.getClientes();
		for (Cliente cliente : temporal) {
			if (cliente.getTipoDocumento().equals(numero2))
				System.out.println("persona buscada! NUmero doc: " + numero2);
			return cliente.getFacturas().get(0).getProductos().get(5);	
	}
		
		System.out.println(numero2);
		return numero2;
		}
		 */

}
}
