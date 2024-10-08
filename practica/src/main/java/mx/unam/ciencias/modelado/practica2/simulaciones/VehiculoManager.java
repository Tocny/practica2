package mx.unam.ciencias.modelado.practica2.simulaciones;

import mx.unam.ciencias.modelado.practica2.template.*;
import mx.unam.ciencias.modelado.practica2.common.*;
import mx.unam.ciencias.modelado.practica2.iterator.*;

/**
 * Clase VehiculoManager, en gran medida nos sirve para generar
 * un menú para que el usuario escoja un vehiculo de los que tenemos
 * en el paquete "mx.unam.ciencias.modelado.practica2.template".
 */
public class VehiculoManager{

    /**Iterable de las instancias de tipo Vehiculo */
    private VehiculoIterable vehiculos;

    /**Constructor de la clase, inicializa el iterador. */
    public VehiculoManager(){
        vehiculos = new VehiculoIterable();
        generaListaVehiculos();
    }

    /**Método para agregar elementos al iterable. */
    private void generaListaVehiculos(){
        vehiculos.agregarVehiculo(new Autobus());
        vehiculos.agregarVehiculo(new Carro());
        vehiculos.agregarVehiculo(new Motocicleta());
        vehiculos.agregarVehiculo(new Scooter());
        vehiculos.agregarVehiculo(new Vehiculo4x4());
    }

    /**
     * Método que genera el menú de los vehiculos disponibles.
     * @return una cadena con vehículos numerados.
     */
    private String menuVehiculos(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nVehiculos disponibles:");
        int indice = 0;
        
        for(Vehiculo vehiculo: vehiculos){
            sb.append("\n\t" + (indice++) + "." + vehiculo.getClass().getSimpleName());

        }

        return sb.toString();
    }

    /**
     * Método para elegir uno de los vehículos del iterable.
     * @return el vehículo escogido por el usuario.
     */
    public Vehiculo seleccionaVehiculo(){
        Colors.println(menuVehiculos(), Colors.GREEN);
        int eleccion = MetodosGet.getInt("Ingrese su elección: ", "Entrada inválida.", 0, vehiculos.getLongitud()-1);
        return vehiculos.get(eleccion);
    }
}