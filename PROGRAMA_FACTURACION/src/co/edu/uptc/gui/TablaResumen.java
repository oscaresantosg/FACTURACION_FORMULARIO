package co.edu.uptc.gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaResumen extends JPanel{
	
	 public TablaResumen() {

			//variables de la tabla 
			Object codigo = null;
			Object Descripcion = null;
			Object Cantidad = null;
			Object PrecioBase = null;
			Object IVA = null;
			Object TotalIva = null;
			//crear la table
			Object[][] data = {
			 {codigo, Descripcion, Cantidad },
			 {codigo, Descripcion, Cantidad},
			 {codigo, Descripcion, Cantidad}
			 };
			 String[] columnNames = {"Impuesto", "Base Gravable", "Total",
			 };
			
			 final JTable table = new JTable(data, columnNames);
			 table.setPreferredScrollableViewportSize(new Dimension(300, 47));
			
			 JScrollPane scrollPane = new JScrollPane(table);
			
		       add(scrollPane);

				 }
				
			
				 }
				

			 


