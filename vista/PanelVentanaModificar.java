package vista;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


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
        cbOperadores.setBounds(180, 280, 500, 40);
        this.add(cbOperadores);

        lbOperadores = new JLabel("Elija cual desea modificar: ");
        lbOperadores.setBounds(190, 225, 500, 20);
        lbOperadores.setFont(new Font("Arial", Font.BOLD, 20));
        lbOperadores.setForeground(Color.BLACK);
        this.add(lbOperadores);

        lbAdm = new JLabel("Selecciona la credencial");
        lbAdm.setBounds(230, 80, 680, 60);
        lbAdm.setFont(new Font("Arial", Font.BOLD, 30));
        lbAdm.setForeground(new Color(0,0,0));
        this.add(lbAdm);

        lbAdm2 = new JLabel("Que desea modificar");
        lbAdm2.setBounds(260, 120, 680, 60);
        lbAdm2.setFont(new Font("Arial", Font.BOLD, 30));
        lbAdm2.setForeground(new Color(0,0,0));  
        this.add(lbAdm2);

        btElejir = new JButton("Elegir");
        btElejir.setBounds(330, 410, 150, 40);
        btElejir.setActionCommand("Elegiropcion");
        this.add(btElejir);

        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 475, 150, 40);
        btRegresar.setActionCommand("RegresarDeModificar");
        this.add(btRegresar);

        iImagen = new ImageIcon(getClass().getResource("/vista/img 3.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 770, 540);
        this.add(lbImagen);

        this.setTitle("Modificar");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        cargarDatosEnComboBox("pagina");

    }

    public void agregarOyentes(ActionListener pAL)
    {
        btRegresar.addActionListener(pAL);
        btElejir.addActionListener(pAL);
    }
    
    public void cerrarDialogoModificar() {
        this.setVisible(false);
        this.dispose();
    }  

    public void cargarDatosEnComboBox(String nombreColumna) {
        cbOperadores.removeAllItems(); // Limpiar los elementos existentes en el JComboBox

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            PreparedStatement pst = cn.prepareStatement("SELECT " + nombreColumna + " FROM datos");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String valor = rs.getString(nombreColumna);
                cbOperadores.addItem(valor);
            }

            rs.close();
            pst.close();
            cn.close();
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir
        }
    }
    
    public String getOpcionSeleccionada() {
        return (String) cbOperadores.getSelectedItem();
    }
}
