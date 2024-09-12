package mx.unam.ciencias.modelado.practica2.simulaciones;

import mx.unam.ciencias.modelado.practica2.template.*;

public class Menu{
    Vehiculo vehiculo = new VehiculoNulo();
    VehiculoManager selectorVehiculos;
    AditamentosManager selectorAditamentos;
    DestinosManager selectorDestinos;
    Vehiculo modelo;
    Vehiculo vehiculoUsuario;

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