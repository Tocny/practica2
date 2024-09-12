package mx.unam.ciencias.modelado.practica2.state;
import mx.unam.ciencias.modelado.practica2.template.*;

public class EstadoApagado implements EstadoVehiculo{

    @Override
    public String encender(Vehiculo vehiculo){
        return "El vehiculo ha encendido motores";
    }

    @Override
    public String movimiento(Vehiculo vehiculo){
        return "El vehiculo no se encuentra en movimiento";
    }

    @Override
    public String esperandoViaje(Vehiculo vehiculo){
        return "El vehiculo ha comenzado a esperar por un viaje";
    }

    @Override
    public String abrirPuertas(Vehiculo vehiculo){
        return "Puertas abiertas";
    }
}