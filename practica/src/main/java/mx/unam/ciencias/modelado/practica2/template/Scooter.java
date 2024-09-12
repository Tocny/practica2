package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.common.Colors;
import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;
import mx.unam.ciencias.modelado.practica2.simulaciones.Terreno;

/** Clase concreta del vehiculo Scooter */
public class Scooter extends Vehiculo{

    // Constructor
    public Scooter() {
        super.setEstado(new EstadoEsperando());
    }
    
    @Override public void sigueRuta(Terreno terreno){
        System.out.println("El scooter sigue la ruta mediante " + terreno.name().toLowerCase() + ".");
        super.setEstado(new EstadoEnMovimiento());
    }
    
    @Override public void alertaCombustible(){
        super.setEstado(new EstadoEsperando());
        Colors.println("El scooter recarga su bateria.", Colors.GREEN + Colors.HIGH_INTENSITY + Colors.UNDERLINE);
        super.setEstado(new EstadoEnMovimiento());
    }
    
    @Override public String descripcion(){
        return "Scooter: ";
    }
}