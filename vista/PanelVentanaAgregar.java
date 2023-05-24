package vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class PanelVentanaAgregar extends JPanel
{
    private JLabel lbImagen;
    private ImageIcon iImagen;

    private JLabel lbAgregar;

    private JLabel lbPagina;
    private JLabel lbUsuario;
    private JLabel lbContraseña;
    private JTextField tfPagina;
    private JTextField tfUsuario;
    private JTextField tfContraseña;
    private JButton btRegresar;
    private JButton btGuardar;

    public PanelVentanaAgregar()
    {
        setLayout(null);
        setBackground(Color.GREEN);

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 170, 100);
        this.add(lbImagen);

        lbAgregar = new JLabel("Agregue nuevos datos de credenciales: ");
        lbAgregar.setBounds(180, 100, 500, 30);
        lbAgregar.setFont(new Font("Arial", Font.BOLD, 25));
        lbAgregar.setForeground(Color.BLACK);
        this.add(lbAgregar);

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
        btGuardar.setActionCommand("guardarcredencial");
        this.add(btGuardar);
        
        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 550, 150, 40);
        btRegresar.setActionCommand("Regresardeagregar");
        this.add(btRegresar);

        // Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Ventana Agregar");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);

    }
    
    // pintar panel
        /**public void paintComponent(Graphics g) 
        {
            super.paintComponent(g);
            g.setColor(Color.decode("#009933")); // color de la línea diagonal

            for (int i = 0; i <= 780; i = i + 1) 
            {
                // dibuja muchas línea diagonal por la mitad del panel
                g.drawLine(i, getHeight(), getWidth() , getHeight() / 130);
            }
        }**/

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
    
    public void borrar()
    {
        tfPagina.setText("");
        tfUsuario.setText("");
        tfContraseña.setText("");
    }
    
    public void agregarOyentes(ActionListener c)
    {
        btRegresar.addActionListener(c);
        btGuardar.addActionListener(c);
    }
}
