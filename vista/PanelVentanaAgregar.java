package vista;



import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;

public class PanelVentanaAgregar extends JDialog
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
        super((Dialog)null, "Ventana Agregar", true);
        setLayout(null);
        
        setBackground(Color.GREEN);

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 170, 100);
        getContentPane().add(lbImagen);

        lbAgregar = new JLabel("Agregue nuevos datos de credenciales: ");
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
        btGuardar.setActionCommand("guardarcredencial");
        this.add(btGuardar);
        
        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 550, 150, 40);
        btRegresar.setActionCommand("Regresardeagregar");
        this.add(btRegresar);

        /*// Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Ventana Agregar");
        borde.setTitleColor(Color.BLACK);
<<<<<<< HEAD
        setBorder(borde);
    }
=======
        setBorder(borde);/* */

    
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
    
        // Dibujar la figura diagonal
        g.setColor(Color.decode("#009933"));
        g.fillRect(0, 0, width, height); 
        
        // Cambiar el color de la parte inferior
        g.setColor(Color.decode("#003b00"));
        int[] xPoints = {0, width, 0};
        int[] yPoints = {0, height, height };
        g.fillPolygon(xPoints, yPoints, 3);        
    }
    
>>>>>>> 5ff94479af89dc70036e191b179d335cb96380e5

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
    
    public void agregarOyentes(ActionListener pAL)
    {
        btRegresar.addActionListener(pAL);
        btGuardar.addActionListener(pAL);
    }

    public void cerrarDialogo()
    {
        this.dispose();
    }  
    
    /*public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0, 150, 800, 150);
        g.drawLine(0, 450, 800, 450);
    }/* */
    
}
