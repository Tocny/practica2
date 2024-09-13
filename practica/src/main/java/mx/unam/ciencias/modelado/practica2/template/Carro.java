package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;
import mx.unam.ciencias.modelado.practica2.simulaciones.Terreno;

/** Clase concreta del vehiculo Carro */
public class Carro extends Vehiculo{
    
    /**
     * Implementación concreta del método sigueRuta.
     * @param terreno el tipo de terreno para la ruta.
     */
    @Override public void sigueRuta(Terreno terreno){
        System.out.println("El carro sigue la ruta mediante " + terreno.name().toLowerCase() + ".");
        super.estadoActual.movimiento();
        super.estadoActual.abrirPuertas();
    }
    
    /**Implementacion concreta de alertaCombustble, maneja los estados y mensajes de este evento. */
    @Override public void alertaCombustible(){
        super.estadoActual.sinCombustible();
        Colors.println("El carro recarga bioetanol.", Colors.GREEN + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        super.estadoActual.movimiento();
    }
    
    /**
     * Implementacion concreta del método descripción
     * @return la cadena "Carro: "
     */
    @Override public String descripcion(){
        return "Carro: ";
    }
}