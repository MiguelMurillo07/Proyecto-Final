package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaAgregar;
import vista.VentanaOpciones;
import vista.VentanaPrincipal;
import modelo.Cuenta;

public class Controlador implements ActionListener{

    private VentanaPrincipal vP;
    private VentanaAgregar vA;
    private VentanaOpciones vO;
    private Cuenta acC;

    public Controlador(VentanaPrincipal vp, Cuenta acc, VentanaAgregar va, VentanaOpciones vo)
    {

        this.vP = vp;
        this.acC = acc;
        this.vP.miPanelVentanaPrincipal.agregarOyentes(this);
        this.vA=va;
        this.vA.miPanelVentanaAgregar.agregarOyentes(this);
        this.vO=vo;
        this.vO.miPanelVentanaOpciones.agregarOyentes(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String event = ae.getActionCommand();

        if (event.equals("ingresar")) {
            // Crea una nueva instancia de la ventana secundaria y la hace visible
            vO.setVisible(true);
            vP.setVisible(false);
        }

        if (event.equals("agregar")) {
            // Crea una nueva instancia de la ventana agregar y la hace visible
            vA.setVisible(true);

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