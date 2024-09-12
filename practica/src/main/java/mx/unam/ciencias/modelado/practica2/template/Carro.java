package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;

/** Clase concreta del vehiculo Carro */
public class Carro extends Vehiculo{

    // Constructor
    public Carro(EstadoVehiculo estado) {
        super(estado);
        }
@Override 
    public void sigueRuta(){
        System.out.println("El carro sigue la ruta.");
        super.setEstado(new EstadoEnMovimiento());
    }
@Override 
    public void alertaCombustible(){
        super.setEstado(new EstadoEsperando());
        System.out.println("El carro recarga bioetanol.");
        super.setEstado(new EstadoEnMovimiento());
    }
@Override 
    public void descripcion(){
        System.out.println("Carro: ");
    }
}