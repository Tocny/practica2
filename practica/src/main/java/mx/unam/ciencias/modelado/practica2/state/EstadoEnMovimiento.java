package mx.unam.ciencias.modelado.practica2.state;
import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.template.*;

public class EstadoEnMovimiento implements EstadoVehiculo{

    @Override
    public void encender(){
        Colors.println("No se es posible apagar el vehiculo, se encuentra en movimiento", Colors.GREEN + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        //return Colors.GREEN + Colors.HIGH_INTENSITY + Colors.UNDERLINE + "No se es posible apagar el vehiculo, se encuentra en movimiento" + Colors.RESTORE;
    }

    @Override
    public void movimiento(){
        Colors.println("El vehiculo se encuentra en movimiento", Colors.WHITE + Colors.HIGH_INTENSITY);
        //return Colors.WHITE + Colors.HIGH_INTENSITY + "El vehiculo se encuentra en movimiento" + Colors.RESTORE;
    }

    @Override
    public void esperandoViaje(){
        Colors.println("No es posible esperar un viaje, el vehiculo esta en movimiento", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        //return Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE + "No es posible esperar un viaje, el vehiculo esta en movimiento" + Colors.RESTORE;
    }

    @Override
    public void abrirPuertas(){
        Colors.println("Por motivos de seguridad, no puedes abrir las puertas en movimiento", Colors.CYAN + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        //return Colors.CYAN + Colors.HIGH_INTENSITY + Colors.UNDERLINE + "Por motivos de seguridad, no puedes abrir las puertas en movimiento" + Colors.RESTORE;
    }
}
