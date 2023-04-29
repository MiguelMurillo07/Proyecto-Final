package vista;

import javax.swing.JPanel;
import java.awt.Color;
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

    public PanelVentanaPrincipal() {

        setLayout(null);
        setBackground(Color.GREEN);

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

        btSalir = new JButton("Salir");
        btSalir.setBounds(330, 600, 120, 25);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        btIngresar = new JButton("Ingresar");
        btIngresar.setBounds(330, 550, 120, 25);
        btIngresar.setActionCommand("ingresar");
        this.add(btIngresar);

        // Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Bienbenido");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);

    }

    // pintar panel
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.decode("#009933")); // color de la línea diagonal

        for (int i = 0; i <= 780; i = i + 1) {

            // dibuja muchas línea diagonal por la mitad del panel
            g.drawLine(i, getHeight(), getWidth() / 2, getHeight() / 2);
            g.drawLine(i + 1, getHeight(), getWidth() / 2, getHeight() / 2);
            i = i + 1;
        }

    }

    public void agregarEscuchadores(ActionListener listener) {
        btIngresar.addActionListener(listener);
        btSalir.addActionListener(listener);
    }
}