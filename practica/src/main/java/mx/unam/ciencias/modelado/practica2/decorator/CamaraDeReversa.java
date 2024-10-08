package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;

/**Aditamento: Cámara de reversa. */
public class CamaraDeReversa extends Aditamento{

    /**
     * Constructor de la clase.
     * @param vehiculo la instancia de Vehiculo para un atributo de la clase padre.
     */
    public CamaraDeReversa(Vehiculo vehiculo){
        super(vehiculo);
    }

    /**
     * Implementación concreta del método descripción.
     * @return la descrición del vehiculo con la cadena ", Cámara de reversa"
     */
    @Override public String descripcion(){
        return super.vehiculo.descripcion() + "\n-Cámara de reversa";
    }

    /**Implementación concreta del método envolver. */
    @Override public Vehiculo envolver(Vehiculo vehiculo){
        return new CamaraDeReversa(vehiculo);
    }
}