package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;
import mx.unam.ciencias.modelado.practica2.simulaciones.Terreno;

/** Clase concreta del vehiculo Autobus */
public class Autobus extends Vehiculo{

    /**
     * Implementación concreta del método sigueRuta.
     * @param terreno el tipo de terreno para la ruta.
     */
    @Override public void sigueRuta(Terreno terreno){
        System.out.println("El autobus sigue la ruta mediante " + terreno.name().toLowerCase() + ".");
        super.estadoActual.movimiento();
        super.estadoActual.abrirPuertas();
    }

    /**Implementacion concreta de alertaCombustble, maneja los estados y mensajes de este evento. */
    @Override public void alertaCombustible(){
        super.estadoActual.sinCombustible();
        Colors.println("El autobus recarga biodiesel.", Colors.GREEN + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        super.estadoActual.movimiento();
    }

    /**
     * Implementacion concreta del método descripción
     * @return la cadena "Autobus: "
     */
    @Override public String descripcion(){
        return "Autobus: ";
    }
}
