package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;

/**Aditamento: Asientos de cuero. */
public class AsientosDeCuero extends Aditamento{

    /**
     * Constructor de la clase.
     * @param vehiculo la instancia de Vehiculo para un atributo de la clase padre.
     */
    public AsientosDeCuero(Vehiculo vehiculo){
        super(vehiculo);
    }

    /**
     * Implementación concreta del método descripción.
     * @return la descrición del vehiculo con la cadena ", Asientos de cuero"
     */
    @Override public String descripcion(){
        return super.vehiculo.descripcion() + "\n-Asientos de cuero";
    }

    /**Implementación concreta del método envolver. */
    @Override public Vehiculo envolver(Vehiculo vehiculo){
        return new AsientosDeCuero(vehiculo);
    }
}