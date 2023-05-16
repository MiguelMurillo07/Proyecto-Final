package vista;

import javax.swing.JPanel;
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
        setBackground(Color.decode("#003b00"));

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 170, 100);
        this.add(lbImagen);

        // Crear y agregar usuario
        lbIUsuario = new JLabel("Usuario");
        lbIUsuario.setBounds(370, 350, 180, 60);
        this.add(lbIUsuario);

        tfUsuario = new JTextField();
        tfUsuario.setBounds(320, 400, 140, 30);
        this.add(tfUsuario);

        // Crear y agregar contraseña
        lbContraseña = new JLabel("Contraseña");
        lbContraseña.setBounds(360, 430, 180, 60);
        this.add(lbContraseña);

        tfContraseña = new JTextField();
        tfContraseña.setBounds(320, 480, 140, 30);
        this.add(tfContraseña);

        lbWelcome = new JLabel("Bienvenido");
        lbWelcome.setBounds(320, 220, 180, 60);
        lbWelcome.setFont(new Font("Arial", Font.BOLD, 25));
        lbWelcome.setForeground(new Color(255,0,0));
        this.add(lbWelcome);

        lbCredenciales = new JLabel("Ingrese sus credenciales");
        lbCredenciales.setBounds(280, 290, 280, 60);
        lbCredenciales.setFont(new Font("Arial", Font.BOLD, 18));
        lbCredenciales.setForeground(new Color(255,255,255));
        this.add(lbCredenciales);

        lbAdm = new JLabel("Administración de Credenciales");
        lbAdm.setBounds(230, 140, 680, 60);
        lbAdm.setFont(new Font("Arial", Font.BOLD, 21));
        lbAdm.setForeground(new Color(0,0,0));
        this.add(lbAdm);

        lbAdm2 = new JLabel("para Páginas Web");
        lbAdm2.setBounds(310, 170, 680, 60);
        lbAdm2.setFont(new Font("Arial", Font.BOLD, 21));
        lbAdm2.setForeground(new Color(0,0,0));  
        this.add(lbAdm2);

        btSalir = new JButton("Salir");
        btSalir.setBounds(230, 600, 120, 25);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        btIngresar = new JButton("Ingresar");
        btIngresar.setBounds(330, 550, 120, 25);
        btIngresar.setActionCommand("ingresar");
        this.add(btIngresar);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(430, 600, 120, 25);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);

        // Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Bienvenido");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);

    }

     // pintar panel
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.decode("#009933")); // color de la línea diagonal

        for (int i = 0; i <= 780; i = i + 1) {

            // dibuja muchas línea diagonal por la mitad del panel
            g.drawLine(i, getHeight(), getWidth() , getHeight() / 130);
            g.drawLine(i + 1, getHeight(), getWidth() , getHeight() / 130);
            i = i + 1;
        }

    }

    public void borrar()
    {
        tfUsuario.setText("");
        tfContraseña.setText("");
    }

    public void agregarOyentes(ActionListener listener) 
    {
        btIngresar.addActionListener(listener);
        btSalir.addActionListener(listener);
        btBorrar.addActionListener(listener);
    }
}