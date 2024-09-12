package mx.unam.ciencias.modelado.practica2.state;
import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.template.*;

public class EstadoApagado implements EstadoVehiculo{

    @Override
    public String encender(Vehiculo vehiculo){
        return Colors.GREEN + Colors.HIGH_INTENSITY + "El vehiculo ha encendido motores" + Colors.RESTORE;
    }

    @Override
    public String movimiento(Vehiculo vehiculo){
        return Colors.BLACK + Colors.HIGH_INTENSITY + "El vehiculo no se encuentra en movimiento" + Colors.RESTORE;
    }

    @Override
    public String esperandoViaje(Vehiculo vehiculo){
        return Colors.YELLOW + Colors.HIGH_INTENSITY + "El vehiculo ha comenzado a esperar por un viaje" + Colors.RESTORE;
    }

    @Override
    public String abrirPuertas(Vehiculo vehiculo){
        return Colors.CYAN + Colors.HIGH_INTENSITY + "Puertas abiertas" + Colors.RESTORE;
    }
}