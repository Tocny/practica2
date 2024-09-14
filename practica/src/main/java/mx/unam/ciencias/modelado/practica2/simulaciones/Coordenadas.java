package mx.unam.ciencias.modelado.practica2.simulaciones;

/**
 * Clase para las coordenadas de los destinos.
 */
public class Coordenadas{
    /**Latitud */
    private double latitud;
    /**Longitud */
    private double longitud;

    /**
     * Constructor de la clase, asigna atributos.
     * @param latitud para el atributo latitud.
     * @param longitud para el atributo longitud.
     */
    public Coordenadas(double latitud, double longitud){
        this.latitud = latitud;
        this.longitud = longitud;
    }

    /**
     * Getter de la latitud.
     * @return this.latitud.
     */
    public double getLatitud(){
        return latitud;
    }

    /**
     * Getter de la longitud.
     * @return this.longtidud.
     */
    public double getLongitud(){
        return longitud;
    }

    @Override public String toString(){
        return "(" +  latitud + "," + longitud + ")";
    }
}