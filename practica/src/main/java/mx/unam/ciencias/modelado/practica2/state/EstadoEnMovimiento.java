package mx.unam.ciencias.modelado.practica2.state;

import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.template.*;

/**
 * La clase {@code EstadoEnMovimiento} representa el estado de un vehículo
 * cuando está en movimiento. Implementa la interfaz {@link EstadoVehiculo}
 * 
 * Este estado restringe algunas operaciones como abrir puertas o esperar un viaje,
 * ya que no son posibles mientras el vehículo está en movimiento.
 */
public class EstadoEnMovimiento implements EstadoVehiculo {

    /** El vehículo asociado con este estado. */
    private Vehiculo vehiculo;

    /**
     * Crea una nueva instancia del estado {@code EstadoEnMovimiento}.
     * @param vehiculo el vehículo que está en este estado.
     */
    public EstadoEnMovimiento(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Indica que el vehículo ya está encendido.
     * No se puede volver a encender cuando ya está en movimiento.
     */
    @Override public void encender() {
        Colors.println("El vehiculo ya está encendido.", Colors.GREEN + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /** Muestra un mensaje indicando que el vehículo está en movimiento.*/
    @Override public void movimiento() {
        Colors.println("El vehiculo se encuentra en movimiento.", Colors.WHITE + Colors.HIGH_INTENSITY);
    }

    /** Indica que no es posible esperar un viaje porque el vehículo está en movimiento.*/
    @Override public void esperandoViaje() {
        Colors.println("No es posible esperar un viaje, el vehiculo esta en movimiento.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /** Finaliza el viaje actual y cambia el estado del vehículo a {@code EstadoFinDelViaje}.*/
    @Override public void terminarViaje() {
        Colors.println("Viaje finalizado.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        vehiculo.setEstado(new EstadoFinDelViaje(vehiculo));
    }

    /** Indica que no es posible abrir las puertas por seguridad mientras el vehículo está en movimiento. */
    @Override public void abrirPuertas() {
        Colors.println("Por motivos de seguridad, no puedes abrir las puertas en movimiento.", Colors.CYAN + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /**
     * Indica que el vehículo se ha quedado sin combustible y cambia su estado
     * a {@code EstadoRecargandoCombustible}.
     */
    @Override public void sinCombustible() {
        Colors.println("El vehículo se ha quedado sin combustible.", Colors.RED + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        vehiculo.setEstado(new EstadoRecargandoCombustible(vehiculo));
    }
}
