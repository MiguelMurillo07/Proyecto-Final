package vista;


import javax.swing.JFrame;
import java.awt.Color;

public class VentanaModificar extends JFrame
{

    public PanelVentanaModificar mPanelVentanaModificar;

    public VentanaModificar()
    {

        setLayout(null);
        setBackground(Color.GREEN);

        mPanelVentanaModificar = new PanelVentanaModificar();
        mPanelVentanaModificar.setBounds(0, 0, 785, 660);
        add(mPanelVentanaModificar);

        //Caracteristicas de la ventana
        setTitle("Ventana Modificar");
        setSize(800,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}