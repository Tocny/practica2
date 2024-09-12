package mx.unam.ciencias.modelado.practica2.state;
import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.template.*;

public class EstadoEsperando implements EstadoVehiculo{

    @Override
    public String encender(Vehiculo vehiculo){
        return Colors.GREEN + Colors.HIGH_INTENSITY + "No se es posible apagar el vehiculo, se encuentra en movimiento" + Colors.RESTORE;
    }

    @Override
    public String movimiento(Vehiculo vehiculo){
        return Colors.BLACK + Colors.HIGH_INTENSITY + "El vehiculo no se encuentra en movimiento" + Colors.RESTORE;
    }

    @Override
    public String esperandoViaje(Vehiculo vehiculo){
        return Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE + "No es posible esperar un viaje, ya se está esperando uno" + Colors.RESTORE;
    }

    @Override
    public String abrirPuertas(Vehiculo vehiculo){
        return Colors.CYAN + Colors.HIGH_INTENSITY  + "Puertas abiertas" + Colors.RESTORE;
    }
}

