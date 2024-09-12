package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;

/**Aditamento: Suspensión regulable. */
public class SuspensionRegulable extends Aditamento{

    /**
     * Constructor de la clase.
     * @param vehiculo la instancia de Vehiculo para un atributo de la clase padre.
     */
    public SuspensionRegulable(Vehiculo vehiculo){
        super(vehiculo);
    }

    /**
     * Implementación concreta del método descripción.
     * @return la descrición del vehiculo con la cadena ", Suspensión regulable"
     */
    @Override public String descripcion(){
        return super.vehiculo.descripcion() + ", Suspensión regulable";
    }
}