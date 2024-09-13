package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;

/**Aditamento: Vidrios polarizados. */
public class VidriosPolarizados extends Aditamento{

    /**
     * Constructor de la clase.
     * @param vehiculo la instancia de Vehiculo para un atributo de la clase padre.
     */
    public VidriosPolarizados(Vehiculo vehiculo){
        super(vehiculo);
    }

    /**
     * Implementación concreta del método descripción.
     * @return la descrición del vehiculo con la cadena ", Vidrios polarizados"
     */
    @Override public String descripcion(){
        return super.vehiculo.descripcion() + "\n-Vidrios polarizados";
    }

    /**Implementación concreta del método envolver. */
    @Override public Vehiculo envolver(Vehiculo vehiculo){
        return new VidriosPolarizados(vehiculo);
    }
}