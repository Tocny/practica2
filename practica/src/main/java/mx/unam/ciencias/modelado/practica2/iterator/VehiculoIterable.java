package mx.unam.ciencias.modelado.practica2.iterator;

import java.lang.Iterable;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import mx.unam.ciencias.modelado.practica2.template.*;

/**
 * Clase que implementa la interfaz Iterable de la clase java.lang
 * para instancias de la clase Vehiculo.
 */
public class VehiculoIterable implements Iterable<Vehiculo>{
    /**Lista de vehículos. */
    private List<Vehiculo> vehiculos;

    /**Constructor de la clase, inicializa la lista de vehículos. */
    public VehiculoIterable(){
        vehiculos = new ArrayList<>();
    }

    /**
     * Método para agregar un vehículo a la lista.
     * @param vehiculo un nuevo vehiculo para la lista.
     */
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    /**
     * Método que regresa un iterador.
     * @return una instancia de VehiculoIterator
     */
    public Iterator<Vehiculo> iterator(){
        return new VehiculoIterator(vehiculos);
    }

    /**
     * Método para obtener la longitud del iterable,
     * dado que es una lista del jdk, podemos hacer esto.
     * @return la longitud de la Lista vehiculos.
     */
    public int getLongitud(){
        return vehiculos.size();
    }

    /**
     * Método para obtener un índice del iterable.
     * @param i el índice buscado.
     * @return El vehiculo que se encuentra en el índice.
     */
    public Vehiculo get(int i){
        return vehiculos.get(i);
    }
}