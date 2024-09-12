package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;

/** Clase concreta del vehiculo Motocicleta */
public class Motocicleta extends Vehiculo{

    // Constructor
    public Motocicleta() {
        super.setEstado(new EstadoEsperando());
    }
    
    @Override public void sigueRuta(){
        System.out.println("El motocicleta sigue la ruta.");
        super.setEstado(new EstadoEnMovimiento());
    }

    @Override public void alertaCombustible(){
        super.setEstado(new EstadoEsperando());
        System.out.println("El motocicleta recarga diesel.");
        super.setEstado(new EstadoEnMovimiento());
    }

    @Override public String descripcion(){
        return "Motocicleta: ";
    }
}