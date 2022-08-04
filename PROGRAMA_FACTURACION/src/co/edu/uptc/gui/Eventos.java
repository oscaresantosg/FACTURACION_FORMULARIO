package co.edu.uptc.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.uptc.modelo.Tienda;
import co.edu.uptc.negocio.TiendaBean;

public class Eventos implements ActionListener {

	public static final String BUSCAR="BUSCAR";
	
	public static final String CARGAR="Cargar";
	
	
	private VentanaPrincipal main;
	
	public Eventos(VentanaPrincipal ventanaPrincipal) {
		this.main= ventanaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String evento= e.getActionCommand();
		if(evento.equals(CARGAR)) {
			main.cargarInfo();
			
		}else if(evento.equals(BUSCAR)) {
			main.buscar();
		
			System.out.println("Click en boton buscar");
		}
			
		
	}

}
