/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorlecuger;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author RetailAdmin
 */
public class GeneradorLecuger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
        double semillax = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla en x"));
        double semillay = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla en y"));
        int periodo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el periodo"));

        String[][] semillas = new String[periodo][4];

        for (int i = 0; i < periodo; i++) {

            Utilidades utilidades = new Utilidades();
            semillax = utilidades.calculaX(semillax);
            semillay = utilidades.calculaY(semillay);
            double semillaZ = utilidades.calculaZ(semillax, semillay);
            double u = utilidades.calculaU(semillaZ);
            semillas[i][0] = "" + semillax;
            semillas[i][1] = "" + semillay;
            semillas[i][2] = "" + semillaZ;
            semillas[i][3] = "" + u;
        }

        String[] columnas = {"semilla X", "semilla Y", "semilla Z", "U"};
        JTable table = new JTable(semillas, columnas);
        table.setVisible(true);

        JFrame frame = new JFrame("JTable Test Display");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JScrollPane tableContainer = new JScrollPane(table);

        panel.add(tableContainer, BorderLayout.CENTER);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
        }catch(Exception ex){
            System.out.println("Solo se pueden ingresar numeros");
        }

    }

}
