package vista;

import javax.swing.JFrame;
import java.awt.Color;

public class VentanaPrincipal extends JFrame
{
    public VentanaAgregar miVentanaAgregar;
    public PanelVentanaPrincipal miPanelVentanaPrincipal;

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

    public void crearVentanaAgregar()
    {
        miVentanaAgregar = new VentanaAgregar();
        miVentanaAgregar.setVisible(true);
    }
}