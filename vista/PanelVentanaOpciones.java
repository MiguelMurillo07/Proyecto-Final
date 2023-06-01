package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelVentanaOpciones extends JPanel
{
    private JLabel lbImagen;
    private ImageIcon iImagen;

    private JButton btAgregar;
    private JButton btModificar;
    private JButton btBorrar;
    private JButton btVisualizar;
    private JButton btSalir;
    private JLabel lbOpcion;

    public PanelVentanaOpciones()
    {
        setLayout(null);
        setBackground(Color.decode("#003b00"));

         // Creación y adición de la imagen al panel
         iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
         lbImagen = new JLabel(iImagen);
         lbImagen.setBounds(10, 10, 170, 100);
         this.add(lbImagen);
 

        // Crear y agregar botones
        btAgregar = new JButton("Agregar");
        btAgregar.setBounds(350, 130, 150, 40);
        btAgregar.setActionCommand("agregar");
        this.add(btAgregar);

        btModificar = new JButton("Modificar");
        btModificar.setBounds(350, 190, 150, 40);
        btModificar.setActionCommand("modificar");
        this.add(btModificar);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(350, 310, 150, 40);
        btBorrar.setActionCommand("borrarDatos");
        this.add(btBorrar);

        btVisualizar = new JButton("Visualizar");
        btVisualizar.setBounds(350, 250, 150, 40);
        btVisualizar.setActionCommand("visualizar");
        this.add(btVisualizar);

        btSalir = new JButton("Salir");
        btSalir.setBounds(350, 430, 150, 32);
        btSalir.setFont(new Font("Arial", Font.BOLD, 28));
        btSalir.setActionCommand("salir1");
        this.add(btSalir);

        // Crear y agregar etiqueta
        lbOpcion = new JLabel("Seleccione una opción:");
        lbOpcion.setBounds(210, 50, 480, 60);
        lbOpcion.setFont(new Font("Arial", Font.BOLD, 30));
        lbOpcion.setForeground(new Color(0,0,0));
        this.add(lbOpcion);

    }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.decode("#009933")); // color de la línea diagonal
    
            for (int i = 0; i <= 780; i = i + 1) {
    
                // dibuja muchas línea diagonal por la mitad del panel
                g.drawLine(i, getHeight(), getWidth() , getHeight() / 400);
                g.drawLine(i + 1, getHeight(), getWidth() , getHeight() / 400);
                i = i + 1;
            }
    
        }

        public void agregarOyentes(ActionListener pAL)
        {
            btAgregar.addActionListener(pAL);
            btModificar.addActionListener(pAL);
            btBorrar.addActionListener(pAL);
            btVisualizar.addActionListener(pAL);
            btSalir.addActionListener(pAL);
        }
    
}
