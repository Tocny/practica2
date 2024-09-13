package mx.unam.ciencias.modelado.practica2.state;

/**
 * {@code EstadoVehiculo} define los métodos que deben ser implementados
 * por las clases que representan los diferentes estados de un vehículo.
 */
public interface EstadoVehiculo {

    /**Enciende el vehiculo o realiza una accion correspondiente según la implementación. */
    public void encender();

    /**Pone el vehiculo en movimiento o realiza una accion correspondiente segun la implementación */
    public void movimiento();

    /**Termina el viaje o realiza una accion correspondiente segun la implementación */
    public void terminarViaje();

    /**Pone al vehiculo a esperar un viaje o realiza una accion correspondiente segun la implementación */
    public void esperandoViaje();

    /**Abre las puertas del vehiculo o realiza una accion correspondiente segun la implementación */
    public void abrirPuertas();

    /**Coloca al vehiculo en un estado sin combustible o realiza una accion correspondiente segun la implementación */
    public void sinCombustible();
}
