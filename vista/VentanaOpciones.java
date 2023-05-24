package vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaOpciones extends JFrame
{
    
    public PanelVentanaOpciones miPanelVentanaOpciones;
    public VentanaAgregar miVentanaAgregar = null;
    public VentanaModificar miVentanaModificar = null;
    public VentanaBorrar miVentanaBorrar = null;
    public VentanaVer miVentanaVer = null;

    public VentanaOpciones()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        miPanelVentanaOpciones = new PanelVentanaOpciones();
        miPanelVentanaOpciones.setBounds(0, 0, 785, 660);
        add(miPanelVentanaOpciones);

        //Caracteristicas de la ventana
        setTitle("Opciones Disponibles");
        setSize(800,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(false);

    }

    public void crearVentanaAgregar()
    {
        VentanaAgregar miVentanaAgregar = new VentanaAgregar();
        miVentanaAgregar.setVisible(true);
    }

    public void crearVentanaModificar()
    {
        VentanaModificar miVentanaModificar = new VentanaModificar();
        miVentanaModificar.setVisible(true);
    }

    public void crearVentanaBorrar()
    {
        VentanaBorrar miVentanaBorrar = new VentanaBorrar();
        miVentanaBorrar.setVisible(true);
    }

    public void crearVentanaVer()
    {
        VentanaVer miVentanaVer = new VentanaVer();
        miVentanaVer.setVisible(true);
    }
}