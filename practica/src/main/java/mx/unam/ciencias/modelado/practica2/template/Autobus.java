package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;

/** Clase concreta del vehiculo Autobus */
public class Autobus extends Vehiculo{

    // Constructor
    public Autobus(EstadoVehiculo estado) {
        super(estado);
        }
@Override
    public void sigueRuta(){
        System.out.pritnln("El autobus sigue la ruta.");
        super.setEstado(new EstadoEnMovimiento());
    }
@Override
    public void alertaCombustible(){
        super.setEstado(new EstadoEsperando());
        System.out.pritnln("El autobus recarga biodiesel.");
        super.setEstado(new EstadoEnMovimiento());
    }
@Override 
    public void descripcion(){
        System.out.pritnln("Autobus: ");
    }
}
