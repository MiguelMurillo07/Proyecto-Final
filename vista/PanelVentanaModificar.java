package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import java.awt.Graphics;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;


public class PanelVentanaModificar extends JPanel{

    private JComboBox<String> cbOperadores;
    private JLabel lbOperadores;

    private JLabel lbAdm;
    private JLabel lbAdm2;

    private JLabel lbImagen;
    private ImageIcon iImagen;

    private JButton btElejir;
    private JButton btRegresar;

    public PanelVentanaModificar()
    {

        setLayout(null);
        setBackground(Color.GREEN);

         // Creación y adición de la imagen al panel
         iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
         lbImagen = new JLabel(iImagen);
         lbImagen.setBounds(10, 10, 170, 100);
         this.add(lbImagen);
 

        // agregar y crear jcombox
        cbOperadores = new JComboBox<>();
        cbOperadores.setBounds(170, 280, 500, 40);
        this.add(cbOperadores);

        lbOperadores = new JLabel("Elija cual desea modificar: ");
        lbOperadores.setBounds(170, 240, 500, 20);
        lbOperadores.setFont(new Font("Arial", Font.BOLD, 25));
        lbOperadores.setForeground(Color.BLACK);
        this.add(lbOperadores);

        lbAdm = new JLabel("Selecciona la credencial");
        lbAdm.setBounds(230, 100, 680, 60);
        lbAdm.setFont(new Font("Arial", Font.BOLD, 30));
        lbAdm.setForeground(new Color(0,0,0));
        this.add(lbAdm);

        lbAdm2 = new JLabel("Que desea modificar");
        lbAdm2.setBounds(260, 130, 680, 60);
        lbAdm2.setFont(new Font("Arial", Font.BOLD, 30));
        lbAdm2.setForeground(new Color(0,0,0));  
        this.add(lbAdm2);

        btElejir = new JButton("Elegir");
        btElejir.setBounds(330, 510, 150, 40);
        btElejir.setActionCommand("Elegiropcion");
        this.add(btElejir);

        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 575, 150, 40);
        btRegresar.setActionCommand("Regresardemodificar");
        this.add(btRegresar);

        // Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Ventana para modificar");
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
    

    public JComboBox<String> getCbOperadores() {
        return cbOperadores;
    }
    
    

}
