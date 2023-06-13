package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
            String usuario = vP.miPanelVentanaPrincipal.getUsuario();
            String contraseña = vP.miPanelVentanaPrincipal.getContraseña();

        if (usuario.equals("") && contraseña.equals("")) {
            // Crea una nueva instancia de la ventana secundaria y la hace visible
            vP.crearVentanaOpciones();
            this.vP.miPanelVentanaOpciones.agregarOyentes(this);
            vP.setVisible(false);
        } else {
            
            JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrectos, por favor vuelve a intentarlo.", null,1);
        }
        }


        if (event.equals("Agregar")) 
        {
            vP.crearVentanaAgregar();
            this.vP.miPanelVentanaAgregar.agregarOyentes(this);
            vP.miPanelVentanaOpciones.setVisible(false);
        }

        if (event.equals("Visualizar"))
        {
            vP.crearVentanaVer();
            this.vP.miPanelVentanaVer.agregarOyentes(this);
            vP.miPanelVentanaOpciones.setVisible(false);
        }

        if (event.equals("Modificar"))
        {
            vP.crearVentanaModificar();
            this.vP.miPanelVentanaModificar.agregarOyentes(this);
            vP.miPanelVentanaOpciones.setVisible(false);
        }

        if (event.equals("Borrar"))
        {
            vP.crearVentanaBorrar();
            this.vP.miPanelVentanaBorrar.agregarOyentes(this);
            vP.miPanelVentanaOpciones.setVisible(false);
        }

        if (event.equals("ElegirOpcionModificar"))
        {
            vP.miPanelVentanaModificar.establecerCampos();
        }

        if (event.equals("ElegirOpcionConsultar"))
        {
            vP.miPanelVentanaVer.establecerCampos();
        }

        if (event.equals("ElegirOpcionBorrar"))
        {
            vP.miPanelVentanaBorrar.establecerCampos();
        }

        if (event.equals("RegresarDeAgregar"))
        {
            vP.miPanelVentanaAgregar.cerrarDialogoAgregar();
            vP.miPanelVentanaOpciones.setVisible(true);
        }

        if (event.equals("RegresarDeModificar"))
        {
            vP.miPanelVentanaModificar.cerrarDialogoModificar();
            vP.miPanelVentanaOpciones.setVisible(true);
        }

        if (event.equals("RegresarDeBorrar"))
        {
            vP.miPanelVentanaBorrar.cerrarDialogoBorrar();
            vP.miPanelVentanaOpciones.setVisible(true);
        }

        if (event.equals("RegresarDeVer"))
        {
            vP.miPanelVentanaVer.cerrarDialogoVer();
            vP.miPanelVentanaOpciones.setVisible(true);
        }

        if (event.equals("AgregarCredencial"))
        {
            vP.miPanelVentanaAgregar.agregarCredencial();
        }

        if (event.equals("AplicarModificacion"))
        {
            vP.miPanelVentanaModificar.actualizarDatos();
        }

        if (event.equals("BorrarCredencial"))
        {
            vP.miPanelVentanaBorrar.borrarDatos();
        }

        if(event.equals("salir"))
        {
            JOptionPane.showMessageDialog(vP, "Gracias por usar la App\n           Vuelve pronto...");
            System.exit(0);
        }
        
    }
}