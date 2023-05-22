package vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaAgregar extends JFrame
{

    public PanelVentanaAgregar miPanelVentanaAgregar;
    
    public VentanaAgregar()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        miPanelVentanaAgregar = new PanelVentanaAgregar();
        miPanelVentanaAgregar.setBounds(0, 0, 785, 660);
        this.add(miPanelVentanaAgregar);

        setLayout(null);
        setSize(800,700);
        setTitle("Agregar Datos");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}