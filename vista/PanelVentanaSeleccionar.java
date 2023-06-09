package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;


public class PanelVentanaSeleccionar extends JPanel
{
    private JComboBox<String> cbOperadores;
    private JLabel lbOperadores;

    private JLabel lbImagen;
    private ImageIcon iImagen;
    
    private JButton btElegir;
    private JButton btRegresar;

    public PanelVentanaSeleccionar() {

        setLayout(null);
        setBackground(Color.GREEN);

        // Creación y adición de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/uis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 170, 100);
        this.add(lbImagen);

        // agregar y crear jcombox
        cbOperadores = new JComboBox<>();
        cbOperadores.setBounds(210, 230, 400, 30);
        this.add(cbOperadores);

        lbOperadores = new JLabel("Elija que desea consultar: ");
        lbOperadores.setBounds(210, 190, 400, 30);
        lbOperadores.setFont(new Font("Arial", Font.BOLD, 25));
        lbOperadores.setForeground(Color.BLACK);
        this.add(lbOperadores);

        // botones
        btElegir = new JButton("Elegir");
        btElegir.setBounds(330, 450, 150, 40);
        btElegir.setActionCommand("Elegirdeconsultar");
        this.add(btElegir);

        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 550, 150, 40);
        btRegresar.setActionCommand("Regresardeconsultar");
        this.add(btRegresar);

        // Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Ventana para consultar");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);

    }

    // pintar panel
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
    
    
        public String getOperadores() {
            return (String) cbOperadores.getSelectedItem();
        }
    
        public void borrar() {
            cbOperadores.setSelectedIndex(0);
        }
    
        public void llenarOperadores(String[] operadores) {
            for (int i = 0; i < operadores.length; i++) {
                cbOperadores.addItem(operadores[i]);
            }
        }
    
        public void setControlador(ActionListener c) {
            btElegir.addActionListener(c);
            btRegresar.addActionListener(c);
        }


}
