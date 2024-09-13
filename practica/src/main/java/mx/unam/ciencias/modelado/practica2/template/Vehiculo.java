package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.state.*;
import mx.unam.ciencias.modelado.practica2.simulaciones.Terreno;

public abstract class Vehiculo {
    /**El estado del vehículo. */
    protected EstadoVehiculo estadoActual;

    /**Constructor de la clase, setea el estado en EstadoEsperando. */
    public Vehiculo(){
        estadoActual = new EstadoEsperando(this);
    }

    /**
     * Método para seguir la ruta del viaje.
     * @param terreno el tipo de terreno que seguirá la ruta.
     */
    public abstract void sigueRuta(Terreno terreno);

    /**Método para la alerta de combustible. */
    public abstract void alertaCombustible();

    /**
     * Método para la descripción del vehiculo (incluyendo aditamentos).
     * @return una descripción general del vehiculo.
     */
    public abstract String descripcion();

    /**
     * Método general de un viaje dados los datos del mismo.
     * @param terreno el tipo de terreno de la ruta.
     * @param ubicacion el punto de partida.
     * @param destino el punto final.
     * @param tiempo el tiempo de viaje.
     * @param distancia la distancia ubicacion-destino.
     */
    public void ejecutaViaje(Terreno terreno, String ubicacion, String destino, double tiempo, double distancia){
        Colors.println("\nReporte de viaje.", Colors.MAGENTA + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        Colors.println("\n" + descripcion() + "\n", Colors.ITALICS);
        empiezaViaje(ubicacion, terreno);
        alertaCombustible();
        finalizaViaje(destino, tiempo, distancia);
    }

    /**Método para esperar un viaje. */
    protected void esperaViaje(){
        estadoActual.esperandoViaje();
    }

    /**
     * Método para empezar el viaje dados el nombre de la ubicación inicial y el tipo de terreno.
     * @param ubicacion la ubicación de partida para el viaje.
     * @param terreno el tipo de terreno que seguirá la ruta.
     */
    protected void empiezaViaje(String ubicacion, Terreno terreno){
        Colors.println("Viaje empezado en " + ubicacion + ".", Colors.UNDERLINE);
        sigueRuta(terreno);
    }

    /**
     * Método para finalizar el viaje y aportar informacion final del mismo.
     * @param destino el destino al que se llegó.
     * @param tiempo el tiempo que tomó el viaje.
     * @param distancia la distancia recorrida.
     */
    protected void finalizaViaje(String destino, double tiempo, double distancia){
        Colors.println("Viaje finalizado en " +  destino + " [" + tiempo + "hrs ; " + distancia + "km]", Colors.UNDERLINE);
        estadoActual.terminarViaje();
        estadoActual.esperandoViaje();
    }

    /**
     * Método para setear el estado del vehiculo.
     * @param estado una implementacion de la interfaz EstadoVehiculo.
     */
    public void setEstado(EstadoVehiculo estado) {
        this.estadoActual = estado;
   }
}
