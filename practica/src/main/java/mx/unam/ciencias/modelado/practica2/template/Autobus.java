package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;


/** Clase concreta del vehiculo Autobus */
public class Autobus extends Vehiculo{

    // Constructor
    public Autobus(EstadoVehiculo estado) {
        super(estado);
        }

    public void sigueRuta(){
        System.out.pritnln("El autobus sigue la ruta.");
        super.setEstado(new EstadoEnMovimiento());
    }

    public void alertaCombustible(){
        super.setEstado(new EstadoEsperando());
        System.out.pritnln("El autobus recarga diesel.");
        super.setEstado(new EstadoEnMovimiento());
    }
}
