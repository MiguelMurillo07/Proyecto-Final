package vista;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PanelVentanaBorrar extends JDialog
{
    private JComboBox<String> cbOperadores;
    private JLabel lbAdm,lbAdm2,lbImagen,lbPagina,lbUsuario,lbContraseña;
    private ImageIcon iImagen;
    private JButton btElejir,btRegresar,btBorrar;
    private JTextField tfuser, tfpagina, tfContraseña;

    public PanelVentanaBorrar()
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
        cbOperadores.setBounds(180, 120, 500, 40);
        this.add(cbOperadores);
        cargarDatosEnComboBox("pagina");

        lbAdm = new JLabel("Selecciona la credencial");
        lbAdm.setBounds(230, 20, 680, 60);
        lbAdm.setFont(new Font("Arial", Font.BOLD, 30));
        lbAdm.setForeground(new Color(0,0,0));
        this.add(lbAdm);

        lbAdm2 = new JLabel("que desea borrar");
        lbAdm2.setBounds(260, 60, 680, 60);
        lbAdm2.setFont(new Font("Arial", Font.BOLD, 30));
        lbAdm2.setForeground(new Color(0,0,0));  
        this.add(lbAdm2);

        btElejir = new JButton("Elegir");
        btElejir.setBounds(330, 170, 150, 40);
        btElejir.setActionCommand("ElegirOpcionBorrar");
        this.add(btElejir);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(330, 420, 150, 40);
        btBorrar.setActionCommand("BorrarCredencial");
        this.add(btBorrar);

        btRegresar = new JButton("Regresar");
        btRegresar.setBounds(330, 475, 150, 40);
        btRegresar.setActionCommand("RegresarDeBorrar");
        this.add(btRegresar);

        lbPagina = new JLabel("Nombre de la pagina o aplicación:");
        lbPagina.setBounds(100,300,300,30);
        lbPagina.setFont(new Font("Arial", Font.BOLD, 17));
        lbPagina.setForeground(Color.BLACK);
        add(lbPagina);

        tfpagina = new JTextField(null);
        tfpagina.setBounds(370, 300, 250, 30);
        tfpagina.setFont(new Font ("Arial",Font.BOLD,15));
        add(tfpagina);
        tfpagina.setEnabled(false);

        lbUsuario = new JLabel("Usuario:");
        lbUsuario.setBounds(200,340,300,30);
        lbUsuario.setFont(new Font("Arial", Font.BOLD, 17));
        lbUsuario.setForeground(Color.BLACK);
        add(lbUsuario);

        tfuser = new JTextField(null);
        tfuser.setBounds(370, 340, 250, 30);
        tfuser.setFont(new Font ("Arial",Font.BOLD,15));
        add(tfuser);
        tfuser.setEnabled(false);

        lbContraseña = new JLabel("Contraseña:");
        lbContraseña.setBounds(200,380,300,30);
        lbContraseña.setFont(new Font("Arial", Font.BOLD, 17));
        lbContraseña.setForeground(Color.BLACK);
        add(lbContraseña);

        tfContraseña = new JTextField(null);
        tfContraseña.setBounds(370, 380, 250, 30);
        tfContraseña.setFont(new Font ("Arial",Font.BOLD,15));
        add(tfContraseña);
        tfContraseña.setEnabled(false);

        iImagen = new ImageIcon(getClass().getResource("/vista/img 4.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 770, 540);
        this.add(lbImagen);

        this.setTitle("Borrar");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

    public String getPagina()
    {
        return tfpagina.getText();
    }
    
    public String getUsuario()
    {
        return tfuser.getText();
    }
    
    public String getContraseña()
    {
        return tfContraseña.getText();
    }

    public void setPagina(String pagina)
    {
        tfpagina.setText(pagina);
    }

    public void setUsuario(String usuario)
    {
        tfuser.setText(usuario);
    }

    public void setContraseña(String contraseña)
    {
        tfContraseña.setText(contraseña);
    }

    public void agregarOyentes(ActionListener pAL)
    {
        btRegresar.addActionListener(pAL);
        btElejir.addActionListener(pAL);
        btBorrar.addActionListener(pAL);

    }

    public void cargarDatosEnComboBox(String nombreColumna) {
        cbOperadores.removeAllItems(); // Limpiar los elementos existentes en el JComboBox

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            PreparedStatement pst = cn.prepareStatement("SELECT " + nombreColumna + " FROM datos");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) 
            {
                String valor = rs.getString(nombreColumna);
                cbOperadores.addItem(valor);
            }
            rs.close();
            pst.close();
            cn.close();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No se cargaron los registros "+e.getMessage());
        }
    }
    
    public String getOpcionSeleccionada() {
        return (String) cbOperadores.getSelectedItem();
    }

    public void establecerCampos()
    {
        try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM datos where pagina = ?");
                pst.setString(1, getOpcionSeleccionada());

                ResultSet rs = pst.executeQuery();
                if (rs.next())
                {
                    tfpagina.setText(rs.getString("pagina"));
                    tfuser.setText(rs.getString("user"));
                    tfContraseña.setText(rs.getString("password"));
                    rs.close();
                    pst.close();
                    cn.close();
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "No se encontro el registro");
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al consultar "+ e.getMessage());
            }
    }

    public void borrarDatos() {
        String opcion = getOpcionSeleccionada();
        JOptionPane.showMessageDialog(null, "Seguro que desea corrar la credencial ?");
        try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
                PreparedStatement pst = cn.prepareStatement("DELETE FROM datos WHERE pagina = ? ");
                
                pst.setString(1, getPagina().trim());
                pst.executeUpdate();
                setPagina("");
                setUsuario("");
                setContraseña("");
                cn.close();
                cargarDatosEnComboBox("pagina");

                JOptionPane.showMessageDialog(null, "Credencial borrada");

            } catch (Exception ex) {
                // Manejar cualquier excepción que pueda ocurrir
                JOptionPane.showMessageDialog(null, "No se borro la credencial "+ opcion + " "+ex.getMessage());
            }
        
    }

    public void cerrarDialogoBorrar() 
    {
        this.setVisible(false);
        this.dispose();
    }  
}
