package vista;

import javax.swing.JFrame;
import java.awt.Color;

public class VentanaPrincipal extends JFrame
{
    
    public PanelVentanaPrincipal mPanelVentanaPrincipal;

    public VentanaPrincipal()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        
        mPanelVentanaPrincipal = new PanelVentanaPrincipal();
        mPanelVentanaPrincipal.setBounds(0, 0, 785, 660);
        add(mPanelVentanaPrincipal);

        //Caracteristicas de la ventana
        setTitle("contras jijiji");
        setSize(800,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }
}