package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{

    //-------------
    //Atributos
    //-------------
    public VentanaAgregar miVentanaAgregar;
    public VentanaBorrar miVentanaBorrar;
    public VentanaModificar mientanaModificar;
    public VentanaOpciones miVentanaOpciones;
    public VentanaSeleccionar miVentanaSeleccionar;
    public VentanaVer miVentanaVer;

    //---------
    //Métodos
    //---------

    //Constructor

    public VentanaPrincipal()
    {   
        this.setLayout(null));
        this.setBackground(Color.decode("#00ff00"));
    }

    // Creación Panel Agregar
    miVentanaAgregar = new VentanaAgregar();
    //miVentanaAgregar.setbo


    this.setTitle("Always Safe");
    this.setSize(600,600);
    //this.setLocation(100,500);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
    

}