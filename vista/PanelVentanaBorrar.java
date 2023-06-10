package vista;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;

public class PanelVentanaBorrar extends JDialog
{
    private JLabel lbImagen,lbBorrar,lbPagina,lbUsuario,lbContraseña;
    private ImageIcon iImagen;
    private JTextField tfPagina,tfUsuario,tfContraseña;
    private JButton btRegresar,btBorrar;

    public PanelVentanaBorrar()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 170, 100);
        this.add(lbImagen);

        lbBorrar = new JLabel("¿Seguro que desea borrar?");
        lbBorrar.setBounds(250, 80, 400, 30);
        lbBorrar.setFont(new Font("Arial", Font.BOLD, 25));
        lbBorrar.setForeground(Color.BLACK);
        this.add(lbBorrar);

        //Creación y adición de etiquetas 
        lbPagina = new JLabel("Nombre de la pagina o aplicación");
        lbPagina.setBounds(275,150,300,30);
        lbPagina.setFont(new Font("Arial", Font.BOLD, 17));
        lbPagina.setForeground(Color.BLACK);
        add(lbPagina);
        tfPagina = new JTextField(null);
        tfPagina.setBounds(280, 180, 250, 30);
        add(tfPagina);

        lbUsuario = new JLabel("Usuario");
        lbUsuario.setBounds(375,235,300,30);
        lbUsuario.setFont(new Font("Arial", Font.BOLD, 17));
        lbUsuario.setForeground(Color.BLACK);
        add(lbUsuario);
        tfUsuario = new JTextField(null);
        tfUsuario.setBounds(280, 265, 250, 30);
        add(tfUsuario);

        lbContraseña = new JLabel("Contraseña");
        lbContraseña.setBounds(360,325,300,30);
        lbContraseña.setFont(new Font("Arial", Font.BOLD, 17));
        lbContraseña.setForeground(Color.BLACK);
        add(lbContraseña);
        tfContraseña = new JTextField(null);
        tfContraseña.setBounds(280, 355, 250, 30);
        add(tfContraseña);
        
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(330, 410, 150, 40);
        btBorrar.setActionCommand("Borrarcredencial");
        this.add(btBorrar);

        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 460, 150, 40);
        btRegresar.setActionCommand("Regresardesegurodeborrar");
        this.add(btRegresar);

        iImagen = new ImageIcon(getClass().getResource("/vista/img 2.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 770, 500);
        this.add(lbImagen);

        this.setTitle("Opciones");
        this.setSize(800,555);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
// Borrar credencial
    public void borrarCredencial()
    {
        tfPagina.setText(null);
        tfUsuario.setText(null);
        tfContraseña.setText(null);
    }

    // Getters
    public JTextField getTfPagina()
    {
        return tfPagina;
    }

    public JTextField getTfUsuario()
    {
        return tfUsuario;
    }

    public JTextField getTfContraseña()
    {
        return tfContraseña;
    }

    public JButton getBtBorrar()
    {
        return btBorrar;
    }

    public JButton getBtRegresar()
    {
        return btRegresar;
    }
    
    public void agregarOyentes(ActionListener pAL)
    {
        btRegresar.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
    }

    public void cerrarDialogoBorrar()
    {
        this.dispose();
    }  
}
