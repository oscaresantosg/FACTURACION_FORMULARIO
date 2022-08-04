package co.edu.uptc.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelAcciones extends JPanel {
	private JTextField txtnumdoc;
	private JTextField txtnumFactura;
	private VentanaPrincipal main;
	
	
	public PanelAcciones(Eventos evento) {
		setBorder(new TitledBorder("Buscar cliente:"));
		 JLabel lbdocumento=new JLabel ("Documento de identidad:");
		txtnumdoc=new JTextField("");
		
		txtnumFactura=new JTextField("");
		JButton accion2= new JButton(Eventos.BUSCAR);
		accion2.addActionListener(evento);
		accion2.setActionCommand(Eventos.BUSCAR);
		accion2.setText("buscar");
		 accion2.setBackground(new java.awt.Color(102, 255, 255));
	        
		
		 setLayout(new GridLayout(2,2));
		 add(lbdocumento);
		 add(txtnumdoc);
		 add(accion2);
		// add(txtnumFactura);
		 //add(lbfactura);
		
		
	}
	public String getTnumDoc() {
		return txtnumdoc.getText();
	}

	}





