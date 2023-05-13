package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import java.awt.Graphics;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class PanelVentanaModificar extends JPanel{

    private JComboBox<String> cbOperadores;
    private JLabel lbOperadores;

    public PanelVentanaModificar()
    {

        setLayout(null);
        setBackground(Color.GREEN);

        // agregar y crear jcombox
        cbOperadores = new JComboBox<>();
        cbOperadores.setBounds(170, 190, 200, 20);
        this.add(cbOperadores);

        lbOperadores = new JLabel("Elija cual desea modificar: ");
        lbOperadores.setBounds(30, 190, 140, 20);
        this.add(lbOperadores);

        // Borde
        TitledBorder borde = BorderFactory.createTitledBorder("Ventana para modificar");
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

}
