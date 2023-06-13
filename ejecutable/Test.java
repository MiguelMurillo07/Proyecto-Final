package ejecutable;

import vista.VentanaPrincipal;
import modelo.Cuenta;
import controlador.Controlador;
public class Test
{
    public static void main(String[] args) {
        
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Cuenta miCuenta = new Cuenta();
        Controlador miControlador = new Controlador(miVentanaPrincipal, miCuenta);
    
    }
}