package mx.unam.ciencias.modelado.practica2.iterator;

import java.util.Iterator;
import java.util.Map;
import mx.unam.ciencias.modelado.practica2.simulaciones.Coordenadas;

/**
 * Clase para el iterador de los destinos.
 * En sí solo es una clase para sobrecargar los métodos del iterador de un Diccionario del jdk.
 */
public class DestinoIterator implements Iterator<Map.Entry<String, Coordenadas>>{

    /**Iterador del Diccionario. */
    private Iterator<Map.Entry<String, Coordenadas>> iterador;

    /**
     * Constructor de la clase, asigna el iterador.
     * @param diccionario un diccionario del que obtener su iterador.
     */
    public DestinoIterator(Map<String, Coordenadas> diccionario){
        this.iterador = diccionario.entrySet().iterator();
    }

    /**
     * Método hasNext()
     * @return el método hasNext() del iterador.
     */
    @Override public boolean hasNext(){
        return interador.hasNext();
    }

    /**
     * Método next()
     * @return el método next() del iterador.
     */
    @Override public Map.Entry<String, Coordenadas> next(){
        return iterador.next();
    }

    /**
     * Método remove()
     * Usa el método remove() del iterador.
     */
    @Override public void remove(){
        iterdor.remove();
    }

}