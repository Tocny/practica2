package mx.unam.ciencias.modelado.practica2.state;
import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.template.*;

public class EstadoFinDelViaje implements EstadoVehiculo{

    @Override
    public void encender(){
        Colors.println("Vehiculo apagado", Colors.RED + Colors.HIGH_INTENSITY);
        //return Colors.RED + Colors.HIGH_INTENSITY + "Vehiculo apagado" + Colors.RESTORE;
    }

    @Override
    public void movimiento(){
        Colors.println("El vehiculo no se encuentra en movimiento", Colors.MAGENTA + Colors.HIGH_INTENSITY);
        //return Colors.BLACK + Colors.HIGH_INTENSITY + "El vehiculo no se encuentra en movimiento" + Colors.RESTORE;
    }

    @Override
    public void esperandoViaje(){
        Colors.println("Esperando por un nuevo viaje", Colors.YELLOW + Colors.HIGH_INTENSITY);
        //return Colors.YELLOW + Colors.HIGH_INTENSITY + "Esperando por un nuevo viaje" + Colors.RESTORE;
    }

    @Override
    public void abrirPuertas(){
        Colors.println("Puertas abiertas", Colors.CYAN + Colors.HIGH_INTENSITY);
        //return Colors.CYAN + Colors.HIGH_INTENSITY + "Puertas abiertas" + Colors.RESTORE;
    }
}