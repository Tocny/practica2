package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;
import mx.unam.ciencias.modelado.practica2.simulaciones.Terreno;

/** Clase concreta del vehiculo Carro */
public class Carro extends Vehiculo{

    // Constructor
    public Carro() {
        super.setEstado(new EstadoEsperando());
    }
    
    @Override public void sigueRuta(Terreno terreno){
        System.out.println("El carro sigue la ruta mediante " + terreno.name().toLowerCase() + ".");
        super.setEstado(new EstadoEnMovimiento());
    }
    
    @Override public void alertaCombustible(){
        super.setEstado(new EstadoEsperando());
        System.out.println("El carro recarga bioetanol.");
        super.setEstado(new EstadoEnMovimiento());
    }
    
    @Override public String descripcion(){
        return "Carro: ";
    }
}