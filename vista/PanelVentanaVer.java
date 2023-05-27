package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import java.awt.Graphics;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class PanelVentanaVer extends JPanel 
{
    private JLabel lbImagen;
    private ImageIcon iImagen;

    private JLabel lbVer;

    private JLabel lbPagina;
    private JLabel lbUsuario;
    private JLabel lbContraseña;
    private JTextField tfPagina;
    private JTextField tfUsuario;
    private JTextField tfContraseña;
    private JButton btRegresar;

    public PanelVentanaVer() 
    {
        setLayout(null);
        setBackground(Color.GREEN);

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 170, 100);
        this.add(lbImagen);

        lbVer = new JLabel("Datos de la pagina seleccionada: ");
        lbVer.setBounds(210, 100, 400, 30);
        lbVer.setFont(new Font("Arial", Font.BOLD, 25));
        lbVer.setForeground(Color.BLACK);
        this.add(lbVer);

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
         
        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 550, 150, 40);
        btRegresar.setActionCommand("Regresardever");
        this.add(btRegresar);

        // Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Ventana ver");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(200, 0, 200, 600);
    }

    public JButton getBtRegresar() {
        return btRegresar;
    }

    public void setBtRegresar(JButton btRegresar) {
        this.btRegresar = btRegresar;
    }

    public JTextField getTfPagina() {
        return tfPagina;
    }

    public void setTfPagina(JTextField tfPagina) {
        this.tfPagina = tfPagina;
    }

    public JTextField getTfUsuario() {
        return tfUsuario;
    }

    public void setTfUsuario(JTextField tfUsuario) {
        this.tfUsuario = tfUsuario;
    }

    public JTextField getTfContraseña() {
        return tfContraseña;
    }

    public void setTfContraseña(JTextField tfContraseña) {
        this.tfContraseña = tfContraseña;
    }
}



