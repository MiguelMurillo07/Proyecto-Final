package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
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

        if (event.equals("ingresar")) 
        {
            // Crea una nueva instancia de la ventana secundaria y la hace visible
            vP.crearVentanaOpciones();
            this.vP.miPanelVentanaOpciones.agregarOyentes(this);
            vP.setVisible(false);
        }

        if (event.equals("agregar")) 
        {
            // Crea una nueva instancia de la ventana agregar y la hace visible
            vP.crearVentanaAgregar();
            this.vP.miPanelVentanaAgregar.agregarOyentes(this);
            vP.miPanelVentanaOpciones.setVisible(false);
        }

        if (event.equals("borrarDatos"))
        {
            // crea una nueva de la ventana borrary la hace visible
            vP.crearVentanaBorrar();
            this.vP.miPanelVentanaBorrar.agregarOyentes(this);
            vP.miPanelVentanaOpciones.setVisible(false);
        }

        if (event.equals("visualizar"))
        {

            //abre una nueva ventana visualizar
            vP.crearVentanaVer();
            this.vP.miPanelVentanaAgregar.agregarOyentes(this);
            vP.miPanelVentanaOpciones.setVisible(false);
        }

        if (event.equals("modificar"))
        {
            vP.crearVentanaModificar();
            this.vP.miPanelVentanaModificar.agregarOyentes(this);
            vP.miPanelVentanaOpciones.setVisible(false);
        }

        if (event.equals("Elegiropcion"))
        {
            
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

        if (event.equals("Regresardesegurodeborrar"))
        {
            vP.miPanelVentanaBorrar.cerrarDialogoBorrar();
            vP.miPanelVentanaOpciones.setVisible(true);
        }

        if (event.equals("RegresarDeVer"))
        {
            vP.miPanelVentanaVer.cerrarDialogoVer();
            vP.miPanelVentanaOpciones.setVisible(true);
        }

        if (event.equals("visualizar"))
        {

        }

        if (event.equals("borrarDatos"))
        {
            
        }

        if (event.equals("guardarcredencial"))
        {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
                PreparedStatement pst = cn.prepareStatement("insert into datos values (?,?,?,?)");

                pst.setString(1, "0");
                pst.setString(2, vP.miPanelVentanaAgregar.getPagina().trim());
                pst.setString(3, vP.miPanelVentanaAgregar.getUsuario().trim());
                pst.setString(4, vP.miPanelVentanaAgregar.getContraseña().trim());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(vP, "Registro exitoso ", "Realizado", 2);
                vP.miPanelVentanaAgregar.borrar();

            }
            catch (Exception e)
            {

            }
        }

        if(event.equals("salir"))
        {
            JOptionPane.showMessageDialog(vP, "Gracias por usar la App.\n           Vuelve Pronto...");
            System.exit(0);
        }
        
        if(event.equals("borrar"))
        {
            vP.miPanelVentanaPrincipal.borrar();
            //JOptionPane.showMessageDialog(vA, "Los datos han sido parcialmente borrados.");
        }
    }
}