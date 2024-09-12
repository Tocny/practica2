package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;

/**Aditamento: Radio de comunicación. */
public class RadioDeComunicacion extends Aditamento{

    /**
     * Constructor de la clase.
     * @param vehiculo la instancia de Vehiculo para un atributo de la clase padre.
     */
    public RadioDeComunicacion(Vehiculo vehiculo){
        super(vehiculo);
    }

    /**
     * Implementación concreta del método descripción.
     * @return la descrición del vehiculo con la cadena ", Radio de comunicación"
     */
    @Override public String descripcion(){
        return super.vehiculo.descripcion() + ", Radio de comunicación";
    }
}