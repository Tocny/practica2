package mx.unam.ciencias.modelado.practica2.state;
import mx.unam.ciencias.modelado.practica2.template.*;

public class EstadoEsperando implements EstadoVehiculo{

    @Override
    public String encender(Vehiculo vehiculo){
        return "Vehiculo apagado";
    }

    @Override
    public String movimiento(Vehiculo vehiculo){
        return "El no se encuentra en movimiento";
    }

    @Override
    public String esperandoViaje(Vehiculo vehiculo){
        return "Esperando por un nuevo viaje";
    }

    @Override
    public String abrirPuertas(Vehiculo vehiculo){
        return "Puertas abiertas";
    }
}