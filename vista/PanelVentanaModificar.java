package vista;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;


public class PanelVentanaModificar extends JDialog{

    private JComboBox<String> cbOperadores;
    private JLabel lbOperadores,lbAdm,lbAdm2,lbImagen;
    private ImageIcon iImagen;
    private JButton btElejir,btRegresar;

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
        btRegresar.setActionCommand("RegresarDeModificar");
        this.add(btRegresar);

        this.setTitle("Modificar");
        this.setSize(800,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

    public JComboBox<String> getCbOperadores() 
    {
        return cbOperadores;
    }

    public void agregarOyentes(ActionListener pAL)
    {
        btRegresar.addActionListener(pAL);
        btElejir.addActionListener(pAL);
    }
    
    public void cerrarDialogoModificar()
    {
        this.dispose();
    }  
}
