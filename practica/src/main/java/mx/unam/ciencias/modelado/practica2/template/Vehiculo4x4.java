package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;

/** Clase concreta del vehiculo */
public class Vehiculo4x4 extends Vehiculo{

    // Constructor
    public Vehiculo4x4(EstadoVehiculo estado) {
        super(estado);
        }
@Override
    public void sigueRuta(){
        System.out.println("El vehiculo 4x4 sigue la ruta.");
        super.setEstado(new EstadoEnMovimiento());
    }
@Override
    public void alertaCombustible(){
        super.setEstado(new EstadoEsperando());
        System.out.println("El vehiculo 4x4 recarga biodiesel.");
        super.setEstado(new EstadoEnMovimiento());
    }
@Override
    public void descripcion(){
        System.out.println("Vehiculo 4x4: ");
    }
}