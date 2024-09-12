package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;


/**
 * Clase concreta del vehiculo VehiculoNulo.
 * Esta clase se usó con fines especificos de evitar usar
 * "null" cuando queremos invocar los aditamentos sin contar
 * con un vehiculo concreto.
 */
public class VehiculoNulo extends Vehiculo{

    /**Método de seguir ruta. */
    @Override public void sigueRuta(){
        System.out.println("Este vehiculo no existe.");
        super.setEstado(new EstadoEnMovimiento());
    }

    /**Método de alerta de combustible. */
    @Override public void alertaCombustible(){
        super.setEstado(new EstadoEsperando());
        System.out.println("Este vehiculo no existe.");
        super.setEstado(new EstadoEnMovimiento());
    }
    
    @Override public String descripcion(){
        return "Este vehiculo no existe.";
    }
}