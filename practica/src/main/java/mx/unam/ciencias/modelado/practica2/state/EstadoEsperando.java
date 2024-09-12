package mx.unam.ciencias.modelado.practica2.state;
import mx.unam.ciencias.modelado.practica2.template.*;

public class EstadoEsperando implements EstadoVehiculo{

    @Override
    public String encender(Vehiculo vehiculo){
        return "No se es posible apagar el vehiculo, se encuentra en movimiento";
    }

    @Override
    public String movimiento(Vehiculo vehiculo){
        return "El vehiculo no se encuentra en movimiento";
    }

    @Override
    public String esperandoViaje(Vehiculo vehiculo){
        return "No es posible esperar un viaje, ya se está esperando uno";
    }

    @Override
    public String abrirPuertas(Vehiculo vehiculo){
        return "Puertas abiertas";
    }
}

