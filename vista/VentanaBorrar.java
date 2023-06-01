package vista;

import javax.swing.JFrame;

import controlador.Controlador;

public class VentanaBorrar extends JFrame
{

    public PanelVentanaBorrar miPanelVentanaBorrar;

    public VentanaBorrar()
    {
        miPanelVentanaBorrar = new PanelVentanaBorrar();
        miPanelVentanaBorrar.setBounds(0, 0, 785, 660);
        this.add(miPanelVentanaBorrar);
        
        setLayout(null);
        setSize(800,700);
        setTitle("Borrar Datos");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    
}