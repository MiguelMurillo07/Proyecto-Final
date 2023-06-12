package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class PanelVentanaOpciones extends JDialog
{
    private JButton btAgregar,btModificar,btBorrar,btVisualizar,btSalir;
    private JLabel lbOpcion,lbImagen;
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
        btAgregar.setBounds(330, 160, 130, 40);
        btAgregar.setActionCommand("agregar");
        this.add(btAgregar);

        btModificar = new JButton("Modificar");
        btModificar.setBounds(330, 240, 130, 40);
        btModificar.setActionCommand("modificar");
        this.add(btModificar);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(330, 320, 130, 40);
        btBorrar.setActionCommand("borrarDatos");
        this.add(btBorrar);

        btVisualizar = new JButton("Visualizar");
        btVisualizar.setBounds(330, 400, 130, 40);
        btVisualizar.setActionCommand("visualizar");
        this.add(btVisualizar);

        btSalir = new JButton("Salir");
        btSalir.setBounds(345, 500, 100, 20);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        // Crear y agregar etiqueta
        lbOpcion = new JLabel("Seleccione una opción:");
        lbOpcion.setBounds(210, 50, 480, 60);
        lbOpcion.setFont(new Font("Arial", Font.BOLD, 30));
        lbOpcion.setForeground(new Color(0,0,0));
        this.add(lbOpcion);

        iImagen = new ImageIcon(getClass().getResource("/vista/posible img.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 5, 760, 550);
        this.add(lbImagen);

        this.setTitle("Opciones Disponibles");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

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
