package ejecutable;

import vista.VentanaAgregar;
import vista.VentanaOpciones;
//import controlador.Controlador;
import vista.VentanaPrincipal;
import modelo.Cuenta;
import controlador.Controlador;
public class Test
{
    public static void main(String[] args) {
        
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        VentanaAgregar miVentanaAgregar = new VentanaAgregar();
        VentanaOpciones miVentanaOpciones = new VentanaOpciones();
        Cuenta miCuenta = new Cuenta();
        Controlador miControlador = new Controlador(miVentanaPrincipal, miCuenta, miVentanaAgregar, miVentanaOpciones);
    
    }
}