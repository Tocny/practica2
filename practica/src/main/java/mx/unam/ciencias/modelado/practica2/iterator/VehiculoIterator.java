package mx.unam.ciencias.modelado.practica2.iterator;

import java.util.Iterator;
import java.util.List;
import mx.unam.ciencias.modelado.practica2.template.*;

/**
 * Clase que implementa la interfaz iterador del paquete java.util
 * sobre instancias de la clase Vehiculo.
 */
public class VehiculoIterator implements Iterator<Vehiculo>{
    /**Lista de vehículos */
    private List<Vehiculo> vehiculos;
    /**Posición del iterador. */
    private int posicion = 0;

    /**
     * Constructor de la clase, asigna la lista vehiculos.
     * @param vehiculos una lista de instancias de Vehiculo.
     */
    public VehiculoIterator(List<Vehiculo> vehiculos){
        this.vehiculos = vehiculos;
    }

    /**
     * Método hasNext, determina si hay un siguiente.
     * @return si la posicion es menor al tamaño de la lista.
     */
    public boolean hasNext(){
        return posicion < vehiculos.size();
    }

    /**
     * Método next, regresa el siguiente elemento de la posición.
     * @return el elemento posterior a la posicion
     */
    public Vehiculo next(){
        return vehiculos.get(posicion++);
    }

    /**
     * Método remove, elimina el elemento en la posición.
     */
    public void remove(){
        vehiculos.remove(posicion);
        posicion--;
    }

}