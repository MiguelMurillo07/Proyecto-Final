package vista;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelVentanaPrincipal extends JPanel {

    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbIUsuario;
    private JTextField tfUsuario;
    private JLabel lbContraseña;
    private JTextField tfContraseña;
    private JButton btIngresar;
    private JButton btSalir;
    private JButton btBorrar;
    private JLabel lbWelcome;
    private JLabel lbCredenciales;
    private JLabel lbAdm;
    private JLabel lbAdm2;

    public PanelVentanaPrincipal() {

        setLayout(null);
        setBackground(Color.decode("#B233FF"));

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 170, 100);
        this.add(lbImagen);

        // Crear y agregar usuario
        lbIUsuario = new JLabel("Usuario");
        lbIUsuario.setBounds(370, 350, 180, 60);
        lbIUsuario.setFont(new Font("Arial", Font.BOLD, 20));
        lbIUsuario.setForeground(Color.WHITE);
        this.add(lbIUsuario);

        tfUsuario = new JTextField();
        tfUsuario.setBounds(335, 400, 140, 30);
        this.add(tfUsuario);

        // Crear y agregar contraseña
        lbContraseña = new JLabel("Contraseña");
        lbContraseña.setBounds(350, 430, 180, 60);
        lbContraseña.setFont(new Font("Arial", Font.BOLD, 20));
        lbContraseña.setForeground(Color.WHITE);
        this.add(lbContraseña);
        
        tfContraseña = new JPasswordField();
        tfContraseña.setBounds(335, 480, 140, 30);
        this.add(tfContraseña);

        lbWelcome = new JLabel("Bienvenido");
        lbWelcome.setBounds(325, 220, 180, 60);
        lbWelcome.setFont(new Font("Arial", Font.BOLD, 30));
        lbWelcome.setForeground(new Color(255,0,0));
        this.add(lbWelcome);

        lbCredenciales = new JLabel("Ingrese sus credenciales");
        lbCredenciales.setBounds(295, 290, 280, 60);
        lbCredenciales.setFont(new Font("Arial", Font.BOLD, 18));
        lbCredenciales.setForeground(new Color(255,255,255));
        this.add(lbCredenciales);

        lbAdm = new JLabel("Administración de Credenciales");
        lbAdm.setBounds(180, 100, 680, 60);
        lbAdm.setFont(new Font("Arial", Font.BOLD, 30));
        lbAdm.setForeground(new Color(255,255,255));
        this.add(lbAdm);

        lbAdm2 = new JLabel("para Páginas Web");
        lbAdm2.setBounds(280, 135, 680, 60);
        lbAdm2.setFont(new Font("Arial", Font.BOLD, 30));
        lbAdm2.setForeground(new Color(255,255,255));  
        this.add(lbAdm2);

        btSalir = new JButton("Salir");
        btSalir.setBounds(245, 600, 120, 25);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        btIngresar = new JButton("Ingresar");
        btIngresar.setBounds(345, 550, 120, 25);
        btIngresar.setActionCommand("ingresar");
        this.add(btIngresar);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(445, 600, 120, 25);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);

        iImagen = new ImageIcon(getClass().getResource("/vista/venprin.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 15, 763, 630);
        this.add(lbImagen);

        // Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Bienvenido");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);

    }

     // pintar panel
    /*protected void paintComponent(Graphics g) {
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
    }/* */
    

    public void borrar()
    {
        tfUsuario.setText("");
        tfContraseña.setText("");
    }

    public String getUsuario() 
    {
        return tfUsuario.getText();
    }

    public String getContraseña() 
    {
        return tfContraseña.getText();
    }


    public void agregarOyentes(ActionListener listener) 
    {
        btIngresar.addActionListener(listener);
        btSalir.addActionListener(listener);
        btBorrar.addActionListener(listener);
    }
}