package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.EstadoEnMovimiento;
import mx.unam.ciencias.modelado.practica2.state.EstadoEsperando;
import mx.unam.ciencias.modelado.practica2.simulaciones.Terreno;

/**
 * Clase concreta del vehiculo VehiculoNulo.
 * Esta clase se usó con fines especificos de evitar usar
 * "null" cuando queremos invocar los aditamentos sin contar
 * con un vehiculo concreto.
 */
public class VehiculoNulo extends Vehiculo{

    /**
     * Implementación concreta del método sigueRuta.
     * @param terreno el tipo de terreno para la ruta.
     */
    @Override public void sigueRuta(Terreno terreno){
        System.out.println("Este vehiculo no existe.");
        super.estadoActual.movimiento();
        super.estadoActual.abrirPuertas();
    }

    /**Implementacion concreta de alertaCombustble, solo indica que este vehiculo no existe. */
    @Override public void alertaCombustible(){
        System.out.println("Este vehiculo no existe.");
    }
    
    /**
     * Implementacion concreta del método descripción
     * @return la cadena "Este vehículo no existe. "
     */
    @Override public String descripcion(){
        return "Este vehiculo no existe.";
    }
}