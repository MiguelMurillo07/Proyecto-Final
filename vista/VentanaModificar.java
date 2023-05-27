package vista;


import javax.swing.JFrame;

import controlador.Controlador;

import java.awt.Color;

public class VentanaModificar extends JFrame
{

    public PanelVentanaModificar miPanelVentanaModificar;

    public VentanaModificar()
    {

        setLayout(null);
        setBackground(Color.GREEN);

        miPanelVentanaModificar = new PanelVentanaModificar();
        miPanelVentanaModificar.setBounds(0, 0, 785, 660);
        add(miPanelVentanaModificar);

        //Caracteristicas de la ventana
        setTitle("Ventana Modificar");
        setSize(800,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void agregarOyentesBoton(Controlador controlador) 
    {
        
    }
}