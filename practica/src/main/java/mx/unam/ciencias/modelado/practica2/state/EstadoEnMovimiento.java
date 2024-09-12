package mx.unam.ciencias.modelado.practica2.state;
import mx.unam.ciencias.modelado.practica2.template.*;

public class EstadoEnMovimiento implements EstadoVehiculo{

    @Override
    public String encender(Vehiculo vehiculo){
        return "No se es posible apagar el vehiculo, se encuentra en movimiento";
    }

    @Override
    public String movimiento(Vehiculo vehiculo){
        return "El vehiculo se encuentra en movimiento";
    }

    @Override
    public String esperandoViaje(Vehiculo vehiculo){
        return "No es posible esperar un viaje, el vehiculo esta en movimiento";
    }

    @Override
    public String abrirPuertas(Vehiculo vehiculo){
        return "Por motivos de seguridad, no puedes abrir las puertas en movimiento";
    }
}
