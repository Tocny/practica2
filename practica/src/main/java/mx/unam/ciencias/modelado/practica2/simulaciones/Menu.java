package mx.unam.ciencias.modelado.practica2.simulaciones;

import mx.unam.ciencias.modelado.practica2.template.*;
import mx.unam.ciencias.modelado.practica2.common.Colors;

/**
 * Clase general de los menús del usuario para escoger y tunear vehiculos
 * así como manejar el viaje a realizar.
 */
public class Menu{
    /**Instancia de VehiculoManager. */
    private VehiculoManager selectorVehiculos;
    /**Instancia de AditamentosManager. */
    private AditamentosManager selectorAditamentos;
    /**Instancia de DestinosManager. */
    private DestinosManager selectorDestinos;
    /**Modelo base del vehiculo del usuario. */
    private Vehiculo modelo;
    /**Vehiculo tuneado por el usuario. */
    private Vehiculo vehiculoUsuario;

    /**Método general de los menús del proyecto. */
    public void ejecutaMenu(){
        Colors.println("Bienvenidx al menú de viajes de la empresa VehMos.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
        Colors.println("Por favor, ingrese la información que se le solicitará para realizar un viaje.", Colors.CYAN);

        selectorVehiculos = new VehiculoManager();
        modelo = selectorVehiculos.seleccionaVehiculo();
        
        selectorAditamentos = new AditamentosManager(modelo);
        vehiculoUsuario = selectorAditamentos.seleccionaAditamentos();

        selectorDestinos = new DestinosManager();
        selectorDestinos.simularViaje(modelo, vehiculoUsuario);
    }
}