package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaOpciones;
import vista.VentanaPrincipal;
import modelo.Cuenta;

public class Controlador implements ActionListener{

    private VentanaPrincipal vP;
    private Cuenta acC;

    public Controlador(VentanaPrincipal vp, Cuenta acc)
    {

        this.vP = vp;
        this.acC = acc;
        this.vP.miPanelVentanaPrincipal.agregarOyentes(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String event = ae.getActionCommand();

        if (event.equals("ingresar")) {
            // Crea una nueva instancia de la ventana secundaria y la hace visible
            VentanaOpciones ventanaSecundaria = new VentanaOpciones();
            ventanaSecundaria.setVisible(true);
        }

        if(event.equals("salir"))
        {
            System.exit(0);
        }
        
        if(event.equals("borrar"))
        {
            vP.miPanelVentanaPrincipal.borrar();
        }
    }
}