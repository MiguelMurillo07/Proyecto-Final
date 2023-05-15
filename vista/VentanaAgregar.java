package vista;

import javax.swing.JFrame;

public class VentanaAgregar extends JFrame
{

    public PanelVentanaAgregar miPanelVentanaAgregar;
    public VentanaAgregar()
    {
        setLayout(null);
        setSize(800,700);
        setTitle("Agregar Datos");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}