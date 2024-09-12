package mx.unam.ciencias.modelado.practica2.simulaciones;

import mx.unam.ciencias.modelado.practica2.template.*;

public class Menu{
    Vehiculo vehiculo = new VehiculoNulo();
    VehiculoManager selectorVehiculos;
    AditamentosManager selectoAditamentos;
    DestinosManager selectorDestinos;
    Vehiculo modelo;
    Vehiculo vehiculoUsuario;

    /**Método general de los menús del proyecto. */
    public void ejecutaMenu(){

        selectorVehiculos = new VehiculoManager();
        modelo = selectorVehiculos.seleccionaVehiculo();
        
        selectoAditamentos = new AditamentosManager(modelo);
        vehiculoUsuario = aditamentos.seleccionaAditamentos();

        selectorDestinos = new DestinosManager();
        selectorDestinos.simularViaje(modelo, vehiculoUsuario);
    }
}