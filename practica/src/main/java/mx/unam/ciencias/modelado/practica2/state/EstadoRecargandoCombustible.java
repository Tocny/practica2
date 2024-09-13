package mx.unam.ciencias.modelado.practica2.state;

import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.template.*;

/**
 * La clase {@code EstadoRecargandoCombustible} representa el estado de un vehículo
 * cuando se está recargando combustible. Implementa la interfaz {@link EstadoVehiculo}
 * y define el comportamiento específico para cada acción mientras el vehículo está en este estado.
 * 
 * En este estado, el vehículo está recargando combustible y debe completar la recarga antes
 * de poder continuar su viaje.
 */
public class EstadoRecargandoCombustible implements EstadoVehiculo {

    /** El vehículo asociado con este estado. */
    private Vehiculo vehiculo;

    /**
     * Crea una nueva instancia del estado {@code EstadoRecargandoCombustible}.
     * @param vehiculo el vehículo que está en este estado.
     */
    public EstadoRecargandoCombustible(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /** Muestra un mensaje indicando que el vehículo está encendido pero sin combustible. */
    @Override public void encender() {
        Colors.println("El vehículo está encendido, no tiene combustible.", Colors.GREEN + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /**
     * Cambia el estado del vehículo a {@code EstadoEnMovimiento} y muestra un mensaje
     * indicando que el vehículo ha recargado combustible y está en movimiento nuevamente.
     */
    @Override public void movimiento() {
        Colors.println("El vehiculo recargó combustible y vuelve a estar en movimiento.", Colors.WHITE + Colors.HIGH_INTENSITY);
        vehiculo.setEstado(new EstadoEnMovimiento(vehiculo));
    }

    /** Muestra un mensaje indicando que no es posible esperar un viaje, ya que el vehículo está recargando combustible. */
    @Override public void esperandoViaje() {
        Colors.println("No es posible esperar un viaje, el vehiculo ya se encuentra en uno.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /** Muestra un mensaje indicando que el viaje aún no ha terminado. */
    @Override public void terminarViaje() {
        Colors.println("Aún no se ha concluido el viaje.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /** Abre las puertas del vehículo y muestra un mensaje indicando que las puertas están abiertas. */
    @Override public void abrirPuertas() {
        Colors.println("Puertas abiertas.", Colors.CYAN + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /** Muestra un mensaje indicando que el vehículo se encuentra recargando combustible. */
    @Override public void sinCombustible() {
        Colors.println("El vehículo se encuentra recargando combustible.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }
}
