package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;
import mx.unam.ciencias.modelado.practica2.simulaciones.Terreno;

/** Clase concreta del vehiculo */
public class Vehiculo4x4 extends Vehiculo{

    // Constructor
    public Vehiculo4x4() {
        super.setEstado(new EstadoEsperando());
    }

    @Override public void sigueRuta(Terreno terreno){
        System.out.println("El vehiculo 4x4 sigue la ruta mediante " + terreno.name().toLowerCase() + ".");
        super.setEstado(new EstadoEnMovimiento());
    }

    @Override public void alertaCombustible(){
        super.setEstado(new EstadoEsperando());
        System.out.println("El vehiculo 4x4 recarga biodiesel.");
        super.setEstado(new EstadoEnMovimiento());
    }
    
    @Override public String descripcion(){
        return "Vehiculo 4x4: ";
    }
}