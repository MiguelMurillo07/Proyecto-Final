package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;

public class PanelVentanaBorrar extends JPanel
{
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbBorrar;
    private JLabel lbPagina;
    private JLabel lbUsuario;
    private JLabel lbContraseña;
    private JTextField tfPagina;
    private JTextField tfUsuario;
    private JTextField tfContraseña;
    private JButton btRegresar;
    private JButton btBorrar;

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
        lbBorrar.setBounds(250, 100, 400, 30);
        lbBorrar.setFont(new Font("Arial", Font.BOLD, 25));
        lbBorrar.setForeground(Color.BLACK);
        this.add(lbBorrar);

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
        
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(330, 500, 150, 40);
        btBorrar.setActionCommand("Borrarcredencial");
        this.add(btBorrar);

        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 550, 150, 40);
        btRegresar.setActionCommand("Regresardesegurodeborrar");
        this.add(btRegresar);

        // Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Ventana Borrar");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
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
    

}
