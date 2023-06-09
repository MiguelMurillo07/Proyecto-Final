package vista;

import javax.swing.JFrame;
import java.awt.Color;

public class VentanaPrincipal extends JFrame
{
    public VentanaAgregar miVentanaAgregar;
    public PanelVentanaPrincipal miPanelVentanaPrincipal;
    public PanelVentanaOpciones miPanelVentanaOpciones = null;
    public PanelVentanaAgregar miPanelVentanaAgregar = null;
    public PanelVentanaModificar miPanelVentanaModificar = null;
    public PanelVentanaBorrar miPanelVentanaBorrar = null;
    public PanelVentanaVer miPanelVentanaVer = null;

    public VentanaPrincipal()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        
        miPanelVentanaPrincipal = new PanelVentanaPrincipal();
        miPanelVentanaPrincipal.setBounds(0, 0, 785, 660);
        add(miPanelVentanaPrincipal);

        //Caracteristicas de la ventana
        setTitle("Always Safe");
        setSize(800,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public void crearVentanaOpciones()
    {
        miPanelVentanaOpciones = new PanelVentanaOpciones();
    }

    public void crearVentanaAgregar()
    {
        miPanelVentanaAgregar= new PanelVentanaAgregar();
    }

    public void crearVentanaModificar()
    {
        miPanelVentanaModificar= new PanelVentanaModificar();
    }

    public void crearVentanaBorrar()
    {
        miPanelVentanaBorrar= new PanelVentanaBorrar();
    }

    public void crearVentanaVer()
    {
        miPanelVentanaVer = new PanelVentanaVer();
    }
}