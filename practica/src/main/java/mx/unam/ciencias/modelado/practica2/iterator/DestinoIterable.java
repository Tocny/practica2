package mx.unam.ciencias.modelado.practica2.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.Iterable;
import mx.unam.ciencias.modelado.practica2.simulaciones.Coordenadas;

/**
 * Clase iterable para los Destinos.
 * Sobrecarga los métodos a los de un HashMap del jdk.
 */
public class DestinoIterable implements Iterable<Map.Entry<String, Coordenadas>>{

    /**Diccionario del iterable. */
    private Map<String, Coordenadas> diccionario;

    /**Constructor de la clase, inicializa el Diccionario. */
    public DestinoIterable(){
        this.diccionario = new HashMap<>();
    }

    /**
     * Método agrega. usa el método put() del diccionario.
     * @param destino una cadena (key).
     * @param coordenadas unas coordeandas (value).
     */
    public void agregar(String destino, Coordenadas coordenadas){
        diccionario.put(destino, coordenadas);
    }

    /**
     * Método para obtener las coordenadas de un destino.
     * @param destino una cadena.
     */
    public Coordenadas getCoordenadas(String destino){
        return diccionario.get(destino);
    }

    /**
     * Método para verificar que un destino (key) esté en el diccionario.
     * @param destino el destino (key) a verificar.
     * @return el método containsKey del parámetro recibido.
     */
    public boolean contieneDestino(String destino){
        return diccionario.containsKey(destino);
    }

    /**
     * Implementación concreta del método de la interfaz.
     * @return una instancia de DestinoIterator sobre el diccionario local.
     */
    @Override public Iterator<Map.Entry<String, Coordenadas>> iterator(){
        return new DestinoIterator(diccionario);
    }
}