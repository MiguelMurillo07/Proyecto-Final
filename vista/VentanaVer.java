package vista;

import java.awt.Color;

import javax.swing.JFrame;

import controlador.Controlador;

public class VentanaVer extends JFrame
{
    public PanelVentanaVer miPanelVentanaVer;
    public VentanaVer()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        miPanelVentanaVer = new PanelVentanaVer();
        miPanelVentanaVer.setBounds(0, 0, 785, 660);
        add(miPanelVentanaVer);

        //Caracteristicas de la ventana
        setTitle("Ventana Ver");
        setSize(800,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);


    }
    public void agregarOyentesBoton(Controlador controlador) {
    }
}
