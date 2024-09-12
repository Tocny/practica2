package mx.unam.ciencias.modelado.practica2.state;
import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.template.*;

public class EstadoEsperando implements EstadoVehiculo{

    @Override
    public void encender(){
        Colors.println("No se es posible apagar el vehiculo mientras se espera un viaje.", Colors.GREEN + Colors.HIGH_INTENSITY);
        //return Colors.GREEN + Colors.HIGH_INTENSITY + "No se es posible apagar el vehiculo mientras se espera un viaje" + Colors.RESTORE;
    }

    @Override
    public void movimiento(){
        Colors.println("El vehiculo no se encuentra en movimiento.", Colors.BLACK + Colors.HIGH_INTENSITY);
        //return Colors.BLACK + Colors.HIGH_INTENSITY + "El vehiculo no se encuentra en movimiento" + Colors.RESTORE;
    }

    @Override
    public void esperandoViaje(){
        Colors.println("Se está esperando un nuevo viaje.", Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        //return Colors.YELLOW + Colors.HIGH_INTENSITY + Colors.UNDERLINE + "No es posible esperar un viaje, ya se está esperando uno" + Colors.RESTORE;
    }

    @Override
    public void abrirPuertas(){
        Colors.println("Puertas abiertas.", Colors.CYAN + Colors.HIGH_INTENSITY);
        //return Colors.CYAN + Colors.HIGH_INTENSITY  + "Puertas abiertas" + Colors.RESTORE;
    }
}

