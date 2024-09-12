package mx.unam.ciencias.modelado.practica2.state;

public interface EstadoVehiculo{
    public String encender();
    public String movimiento();
    public String esperandoViaje();
    public String abrirPuertas();
}