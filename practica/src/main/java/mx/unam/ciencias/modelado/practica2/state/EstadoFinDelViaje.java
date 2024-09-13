package mx.unam.ciencias.modelado.practica2.state;

import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.template.*;

/**
 * La clase {@code EstadoFinDelViaje} representa el estado de un vehículo
 * cuando ha finalizado un viaje. Implementa la interfaz {@link EstadoVehiculo}
 * y define el comportamiento específico para cada acción mientras el vehículo está en este estado.
 * 
 * En este estado, el vehículo puede encenderse o comenzar a esperar por un nuevo viaje.
 * 
 */
public class EstadoFinDelViaje implements EstadoVehiculo {

    /** El vehículo asociado con este estado. */
    private Vehiculo vehiculo;

    /**
     * Crea una nueva instancia del estado {@code EstadoFinDelViaje}. 
     * @param vehiculo el vehículo que está en este estado.
     */
    public EstadoFinDelViaje(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /** Enciende el vehículo y muestra un mensaje indicando que el vehículo está encendido. */
    @Override public void encender() {
        Colors.println("Vehiculo encendido.", Colors.RED + Colors.HIGH_INTENSITY);
    }

    /** Muestra un mensaje indicando que el vehículo no está en movimiento. */
    @Override public void movimiento() {
        Colors.println("El vehiculo no se encuentra en movimiento.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
    }

    /**
     * Cambia el estado del vehículo a {@code EstadoEsperando} y muestra un mensaje
     * indicando que el vehículo está esperando un nuevo viaje.
     */
    @Override public void esperandoViaje() {
        Colors.println("Esperando por un nuevo viaje.", Colors.YELLOW + Colors.HIGH_INTENSITY);
        vehiculo.setEstado(new EstadoEsperando(vehiculo));
    }

    /** Muestra un mensaje indicando que el viaje ya ha finalizado. */
    @Override public void terminarViaje() {
        Colors.println("Se acaba de finalizar un viaje.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /** Abre las puertas del vehículo y muestra un mensaje indicando que las puertas están abiertas. */
    @Override public void abrirPuertas() {
        Colors.println("Puertas abiertas.", Colors.CYAN + Colors.HIGH_INTENSITY);
    }

    /** Muestra un mensaje indicando que el vehículo tiene combustible, ya que fue recargado en el último viaje. */
    @Override public void sinCombustible() {
        Colors.println("El vehículo cuenta con combustible, recargó en el último viaje.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }
}
