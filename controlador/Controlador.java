package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaPrincipal;

public class Controlador implements ActionListener{

    public Controlador(VentanaPrincipal vp){

        this.vP = vP;

        @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String event = e.getActionCommand();


        if(event == "salir")
        {
            System.exit(0);
        }  
    }
}