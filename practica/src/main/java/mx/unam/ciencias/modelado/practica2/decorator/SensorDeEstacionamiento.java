package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;

/**Aditamento: Alerón Deportivo. */
public class SensorDeEstacionamiento extends Aditamento{

    /**
     * Constructor de la clase.
     * @param vehiculo la instancia de Vehiculo para un atributo de la clase padre.
     */
    public SensorDeEstacionamiento(Vehiculo vehiculo){
        super(vehiculo);
    }

    /**
     * Implementación concreta del método descripción.
     * @return la descrición del vehiculo con la cadena ", Sensor de estacionamiento"
     */
    @Override public String descripcion(){
        return super.vehiculo.descripcion() + "\n-Sensor de estacionamiento";
    }

    /**Implementación concreta del método envolver. */
    @Override public Vehiculo envolver(Vehiculo vehiculo){
        return new SensorDeEstacionamiento(vehiculo);
    }
}