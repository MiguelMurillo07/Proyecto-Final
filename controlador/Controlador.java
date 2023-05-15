package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaPrincipal;
import vista.VentanaModificar;

public class Controlador implements ActionListener{

    private VentanaPrincipal vP;

    public Controlador(VentanaPrincipal vp)
    {

        this.vP = vp;
        this.vP.mPanelVentanaPrincipal.agregarOyentes(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String event = ae.getActionCommand();


        if(event.equals("salir"))
        {
            System.exit(0);
        }  
    }
}