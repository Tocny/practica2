package mx.unam.ciencias.modelado.practica2.state;

import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.template.*;

/**
 * La clase {@code EstadoEsperando} representa el estado de un vehículo
 * cuando está esperando un nuevo viaje. Implementa la interfaz {@link EstadoVehiculo}
 * y define el comportamiento específico para cada acción mientras el vehículo está en este estado.
 * 
 * Este estado permite algunas acciones como abrir puertas, pero restringe otras como apagar el vehículo
 * mientras se espera un viaje.
 */
public class EstadoEsperando implements EstadoVehiculo {

    /** El vehículo asociado con este estado. */
    private Vehiculo vehiculo;

    /**
     * Crea una nueva instancia del estado {@code EstadoEsperando}.
     * @param vehiculo el vehículo que está en este estado.
     */
    public EstadoEsperando(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Indica que no es posible apagar el vehículo mientras se espera un viaje.
     * Este método muestra un mensaje indicando que la acción no es válida en este estado.
     */
    @Override public void encender() {
        Colors.println("No se es posible apagar el vehiculo mientras se espera un viaje.", Colors.GREEN + Colors.HIGH_INTENSITY);
    }

    /**
     * Inicia el movimiento del vehículo y cambia el estado a {@code EstadoEnMovimiento}.
     * Muestra un mensaje indicando que el viaje ha comenzado.
     */
    @Override public void movimiento() {
        Colors.println("El vehiculo comenzó el viaje.", Colors.BLUE + Colors.HIGH_INTENSITY);
        vehiculo.setEstado(new EstadoEnMovimiento(vehiculo));
    }

    /** Muestra un mensaje indicando que el vehículo está esperando un nuevo viaje. */
    @Override public void esperandoViaje() {
        Colors.println("Se está esperando un nuevo viaje.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /** Indica que no es posible finalizar un viaje, ya que no hay ningún viaje en curso. */
    @Override public void terminarViaje() {
        Colors.println("No hay ningún viaje en curso.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }

    /** Abre las puertas del vehículo y muestra un mensaje indicando que las puertas están abiertas. */
    @Override public void abrirPuertas() {
        Colors.println("Puertas abiertas.", Colors.CYAN + Colors.HIGH_INTENSITY);
    }

    /** Muestra un mensaje indicando que el vehículo aún tiene combustible, ya que no ha iniciado movimiento. */
    @Override public void sinCombustible() {
        Colors.println("El vehículo no se ha movido, aún cuenta con combustible.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
    }
}
