package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.Font;

public class PanelVentanaAgregar extends JDialog
{
    private JLabel lbImagen,lbAgregar,lbPagina,lbUsuario,lbContraseña;
    private ImageIcon iImagen;
    private JTextField tfPagina, tfUsuario,tfContraseña;
    private JButton btRegresar,btGuardar;

    public PanelVentanaAgregar()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 170, 100);
        getContentPane().add(lbImagen);

        lbAgregar = new JLabel("Agregue nuevos datos de credenciales: ");
        lbAgregar.setBounds(180, 80, 500, 30);
        lbAgregar.setFont(new Font("Arial", Font.BOLD, 25));
        lbAgregar.setForeground(Color.BLACK);
        getContentPane().add(lbAgregar);

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
        lbUsuario.setBounds(375,240,300,30);
        lbUsuario.setFont(new Font("Arial", Font.BOLD, 17));
        lbUsuario.setForeground(Color.BLACK);
        add(lbUsuario);
        
        tfUsuario = new JTextField(null);
        tfUsuario.setBounds(280, 270, 250, 30);
        add(tfUsuario);

        lbContraseña = new JLabel("Contraseña");
        lbContraseña.setBounds(360,330,300,30);
        lbContraseña.setFont(new Font("Arial", Font.BOLD, 17));
        lbContraseña.setForeground(Color.BLACK);
        add(lbContraseña);

        tfContraseña = new JTextField(null);
        tfContraseña.setBounds(280, 360, 250, 30);
        add(tfContraseña);
        
        btGuardar = new JButton("Guardar");
        btGuardar.setBounds(330, 415, 150, 30);
        btGuardar.setActionCommand("AgregarCredencial");
        this.add(btGuardar);
        
        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 455, 150, 30);
        btRegresar.setActionCommand("RegresarDeAgregar");
        this.add(btRegresar);

        iImagen = new ImageIcon(getClass().getResource("/vista/img 3.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 770, 540);
        this.add(lbImagen);

        this.setTitle("Agregar");
        this.setSize(800,600);
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
    
    public void setPagina(String pagina)
    {
        tfPagina.setText(pagina);
    }

    public void setUsuario(String usuario)
    {
        tfUsuario.setText(usuario);
    }

    public void setContraseña(String contraseña)
    {
        tfContraseña.setText(contraseña);
    }

    public void agregarCredencial()
    {
        try 
        {

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into datos values (?,?,?)");

            pst.setString(1, getPagina().trim());
            pst.setString(2, getUsuario().trim());
            pst.setString(3, getContraseña().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro exitoso ", "Realizado", 2);
            borrar();

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al agregar "+e.getMessage());
        }
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

    public void cerrarDialogoAgregar()
    {
        this.dispose();
    }  
}
