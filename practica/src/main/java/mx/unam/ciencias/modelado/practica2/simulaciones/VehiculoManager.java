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
    public void generaListaVehiculos(){
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
    pubic String menuVehiculos(){
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int indice = 0;
        
        for(Vehiculo vehiculo: vehiculos){
            sb.append(indice++)
            sb.append(". ")
            sb.append(vehiculo.getClass().getSimpleName())
            sb.append("\n");

        }

        return sb.toString();
    }

    /**
     * Método para elegir uno de los vehículos del iterable.
     * @return el vehículo escogido por el usuario.
     */
    public Vehiculo seleccionaVehiculo(){
        Colors.println("Vehículos disponibles", Colors.GREEN);
        Colors.println(menuVehiculos(), Colors.GREEN);
        int eleccion = MetodosGet.getInt("Ingrese su elección: ", "Entrada inválida.", 0, vehiculos.getLongitud()-1);
        return vehiculos.get(eleccion);
    }
}