package vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaOpciones extends JFrame
{
    
    public PanelVentanaOpciones miPanelVentanaOpciones;

    public VentanaOpciones()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        miPanelVentanaOpciones = new PanelVentanaOpciones();
        miPanelVentanaOpciones.setBounds(0, 0, 785, 660);
        add(miPanelVentanaOpciones);

        //Caracteristicas de la ventana
        setTitle("Opciones Disponibles");
        setSize(700,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }
}