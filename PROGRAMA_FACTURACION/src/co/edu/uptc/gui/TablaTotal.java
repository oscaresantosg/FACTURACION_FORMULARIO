package co.edu.uptc.gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaTotal extends JPanel{
	public TablaTotal() {
		Object Descripcion = null;
		Object Cantidad = null;
		
		//crear la table
		Object[][] data = {
		 {"Subtotal", Descripcion, Cantidad },
		 {"Total Imuestos", Descripcion, Cantidad},
		 {"Total", Descripcion, Cantidad},
		 };
		 String[] columnNames = {"", "", ""};
		
		 final JTable table = new JTable(data, columnNames);
		 table.setPreferredScrollableViewportSize(new Dimension(30, 10));
		
		 JScrollPane scrollPane = new JScrollPane(table);
	      add(table);
	

			 }
			
			 


	}






