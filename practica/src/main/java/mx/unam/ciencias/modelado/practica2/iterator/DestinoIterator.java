package mx.unam.ciencias.modelado.practica2.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mx.unam.ciencias.modelado.practica2.simulaciones.Coordenadas;

/**
 * Clase para el iterador de los destinos.
 * Implementa la interfaz Iterator para un diccionario de la forma String-Coordenadas
 */
public class DestinoIterator implements Iterator<Map.Entry<String, Coordenadas>> {

    /** Diccionario de destinos. */
    private Map<String, Coordenadas> diccionario;
    
    /** Lista de destinos (keys) del diccionario. */
    private List<String> destinos;

    /** Posicion del iterador*/
    private int posicion = 0;

    /**
     * Constructor de la clase, asigna el diccionario y le extrae las llaves para asignarlas a la lista de destinos.
     * @param diccionario un diccionario de la forma String-Coordenadas
     */
    public DestinoIterator(Map<String, Coordenadas> diccionario) {
        this.diccionario = diccionario;
        this.destinos = new ArrayList<>(diccionario.keySet());
    }

    /**
     * Implementación concreta del método hasNext().
     * @return Si la posicion es menor al tamaño de la lista de destinos.
     */
    @Override public boolean hasNext() {
        return posicion < destinos.size();
    }

    /**
     * IMplementacion concreta del método next().
     * @return la entrada siguiente a la posición del iterador.
     */
    @Override public Map.Entry<String, Coordenadas> next() {
        String destino = destinos.get(posicion++);
        return Map.entry(destino, diccionario.get(destino));
    }

    /**
     * Implementacion concreta del método remove().
     * Elimina la entrada en la posición del iterador.
     */
    @Override public void remove() {
        String destino = destinos.get(posicion);
        diccionario.remove(destino);
        destinos.remove(posicion);
        posicion--;
    }
}
