package mx.unam.ciencias.modelado.practica2.simulaciones;

import mx.unam.ciencias.modelado.practica2.template.*;

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

        selectorVehiculos = new VehiculoManager();
        modelo = selectorVehiculos.seleccionaVehiculo();
        
        selectorAditamentos = new AditamentosManager(modelo);
        vehiculoUsuario = selectorAditamentos.seleccionaAditamentos();

        selectorDestinos = new DestinosManager();
        selectorDestinos.simularViaje(modelo, vehiculoUsuario);
    }
}