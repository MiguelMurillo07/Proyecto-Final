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
    

    private JButton btAgregar;
    private JButton btModificar;
    private JButton btBorrar;
    private JButton btVisualizar;
    private JButton btSalir;
    private JLabel lbOpcion;
    private JLabel lbImagen;
    private ImageIcon iImagen;


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
        btAgregar.setBounds(330, 180, 130, 40);
        btAgregar.setActionCommand("agregar");
        this.add(btAgregar);

        btModificar = new JButton("Modificar");
        btModificar.setBounds(330, 260, 130, 40);
        btModificar.setActionCommand("modificar");
        this.add(btModificar);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(330, 340, 130, 40);
        btBorrar.setActionCommand("borrarDatos");
        this.add(btBorrar);

        btVisualizar = new JButton("Visualizar");
        btVisualizar.setBounds(330, 420, 130, 40);
        btVisualizar.setActionCommand("visualizar");
        this.add(btVisualizar);

        btSalir = new JButton("Salir");
        btSalir.setBounds(345, 550, 100, 20);
        btSalir.setActionCommand("salir1");
        this.add(btSalir);

        // Crear y agregar etiqueta
        lbOpcion = new JLabel("Seleccione una opción:");
        lbOpcion.setBounds(210, 50, 480, 60);
        lbOpcion.setFont(new Font("Arial", Font.BOLD, 40));
        lbOpcion.setForeground(new Color(0,0,0));
        this.add(lbOpcion);

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
    

        public void agregarOyentes(ActionListener pAL)
        {
            btAgregar.addActionListener(pAL);
            btModificar.addActionListener(pAL);
            btBorrar.addActionListener(pAL);
            btVisualizar.addActionListener(pAL);
            btSalir.addActionListener(pAL);
        }
    
}
