package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;

/**Aditamento: Difusor de aire. */
public class DifusorDeAire extends Aditamento{

    /**
     * Constructor de la clase.
     * @param vehiculo la instancia de Vehiculo para un atributo de la clase padre.
     */
    public DifusorDeAire(Vehiculo vehiculo){
        super(vehiculo);
    }

    /**
     * Implementación concreta del método descripción.
     * @return la descrición del vehiculo con la cadena ", Difusor de aire"
     */
    @Override public String descripcion(){
        return super.vehiculo.descripcion() + "\n-Difusor de aire";
    }
}