package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.Font;

public class VentanaModificar extends JDialog
{
    private JLabel lbImagen,lbAgregar,lbPagina,lbUsuario,lbContraseña;
    private ImageIcon iImagen;
    private JTextField tfPagina, tfUsuario,tfContraseña;
    private JButton btRegresar,btGuardar;

    public VentanaModificar()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 170, 100);
        getContentPane().add(lbImagen);

        lbAgregar = new JLabel("Sobre escriba los datos de credenciales: ");
        lbAgregar.setBounds(180, 100, 500, 30);
        lbAgregar.setFont(new Font("Arial", Font.BOLD, 25));
        lbAgregar.setForeground(Color.BLACK);
        getContentPane().add(lbAgregar);

        //Creación y adición de etiquetas 
        lbPagina = new JLabel("Nombre de la pagina o aplicación");
        lbPagina.setBounds(275,170,300,30);
        lbPagina.setFont(new Font("Arial", Font.BOLD, 17));
        lbPagina.setForeground(Color.BLACK);
        add(lbPagina);

        tfPagina = new JTextField(null);
        tfPagina.setBounds(280, 200, 250, 30);
        add(tfPagina);

        lbUsuario = new JLabel("Usuario");
        lbUsuario.setBounds(375,260,300,30);
        lbUsuario.setFont(new Font("Arial", Font.BOLD, 17));
        lbUsuario.setForeground(Color.BLACK);
        add(lbUsuario);

        tfUsuario = new JTextField(null);
        tfUsuario.setBounds(280, 290, 250, 30);
        add(tfUsuario);

        lbContraseña = new JLabel("Contraseña");
        lbContraseña.setBounds(360,350,300,30);
        lbContraseña.setFont(new Font("Arial", Font.BOLD, 17));
        lbContraseña.setForeground(Color.BLACK);
        add(lbContraseña);

        tfContraseña = new JTextField(null);
        tfContraseña.setBounds(280, 380, 250, 30);
        add(tfContraseña);
        
        btGuardar = new JButton("Guardar");
        btGuardar.setBounds(330, 490, 150, 40);
        btGuardar.setActionCommand("guardarcredencialModificada");
        this.add(btGuardar);
        
        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 550, 150, 40);
        btRegresar.setActionCommand("RegresarAModificar");
        this.add(btRegresar);

        this.setTitle("Modificar");
        this.setSize(800,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public String getPagina()
    {
        return tfPagina.getText();
    }
    
    public String getUsuario()
    {
        return tfUsuario.getText();
    }
    
    public String getContraseña()
    {
        return tfContraseña.getText();
    }
    
    public void setTfPagina(String pagina) {
        tfPagina.setText(pagina);
    }
    
    public void setTfUsuario(String usuario) {
        tfUsuario.setText(usuario);
    }
    
    public void setTfContraseña(String contraseña) {
        tfContraseña.setText(contraseña);
    }

    public void borrar()
    {
        tfPagina.setText("");
        tfUsuario.setText("");
        tfContraseña.setText("");
    }
    
    public void agregarOyentes(ActionListener pAL)
    {
        btRegresar.addActionListener(pAL);
        btGuardar.addActionListener(pAL);
    }

    public void cerrarDialogoModificar()
    {
        this.dispose();
    }  
}