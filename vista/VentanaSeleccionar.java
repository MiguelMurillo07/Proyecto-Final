package vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaSeleccionar extends JFrame
{
    public PanelVentanaSeleccionar miPanelVentanaSeleccionar;

    public VentanaSeleccionar() 
    {
        setLayout(null);
        setBackground(Color.GREEN);

        miPanelVentanaSeleccionar = new PanelVentanaSeleccionar();
        miPanelVentanaSeleccionar.setBounds(0, 0, 785, 660);
        add(miPanelVentanaSeleccionar);

        // Caracteristicas de la ventana
        setTitle("Ventana Consultar");
        setSize(800, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(false);
        
        
    }

}
