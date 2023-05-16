package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelVentanaOpciones extends JPanel
{
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

        // Crear y agregar botones
        btAgregar = new JButton("Agregar");
        btAgregar.setBounds(250, 100, 100, 40);
        this.add(btAgregar);

        btModificar = new JButton("Modificar");
        btModificar.setBounds(250, 160, 100, 40);
        this.add(btModificar);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(250, 280, 100, 40);
        this.add(btBorrar);

        btVisualizar = new JButton("Visualizar");
        btVisualizar.setBounds(250, 220, 100, 40);
        this.add(btVisualizar);

        btSalir = new JButton("Salir");
        btSalir.setBounds(250, 400, 100, 20);
        this.add(btSalir);

        // Crear y agregar etiqueta
        lbOpcion = new JLabel("Seleccione una opción:");
        lbOpcion.setBounds(170, 20, 480, 60);
        lbOpcion.setFont(new Font("Arial", Font.BOLD, 25));
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
