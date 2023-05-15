package vista;

import javax.swing.JFrame;

public class VentanaVer extends JFrame
{
    public PanelVentanaVer miPanelVentanaVer;
    public VentanaVer()
    {
        miPanelVentanaVer = new PanelVentanaVer();
        
        this.setTitle("Ver Datos");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
