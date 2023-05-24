package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
            vO.crearVentanaAgregar();
            this.vO.miVentanaAgregar.agregarOyentesBoton(this);
            //vA.setVisible(true);
        }

        if (event.equals("salir1"))
        {
            JOptionPane.showMessageDialog(vP, "T cuidas papa");
            System.exit(0);
        }


        if (event.equals("modificar"))
        {
            vO.crearVentanaModificar();
            this.vO.miVentanaModificar.agregarOyentesBoton(this);
        }

        if (event.equals("visualizar"))
        {
            vO.crearVentanaVer();
            this.vO.miVentanaVer.agregarOyentesBoton(this);
        }

        if (event.equals("borrarDatos"))
        {
            vO.crearVentanaBorrar();
            this.vO.miVentanaBorrar.agregarOyentesBoton(this);
        }

        if(event.equals("salir"))
        {
            JOptionPane.showMessageDialog(vA, "Gracias por usar la App.\n           Vuelve Pronto...");
            System.exit(0);
        }
        
        if(event.equals("borrar"))
        {
            vP.miPanelVentanaPrincipal.borrar();
            JOptionPane.showMessageDialog(vA, "Los datos han sido parcialmente borrados.");
        }
    }
}