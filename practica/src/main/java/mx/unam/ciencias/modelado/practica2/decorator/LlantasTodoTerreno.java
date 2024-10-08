package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;

/**Aditamento: Llantas todo terreno. */
public class LlantasTodoTerreno extends Aditamento{

    /**
     * Constructor de la clase.
     * @param vehiculo la instancia de Vehiculo para un atributo de la clase padre.
     */
    public LlantasTodoTerreno(Vehiculo vehiculo){
        super(vehiculo);
    }

    /**
     * Implementación concreta del método descripción.
     * @return la descrición del vehiculo con la cadena ", Llantas todo terreno"
     */
    @Override public String descripcion(){
        return super.vehiculo.descripcion() + "\n-Llantas todo terreno";
    }

    /**Implementación concreta del método envolver. */
    @Override public Vehiculo envolver(Vehiculo vehiculo){
        return new LlantasTodoTerreno(vehiculo);
    }
}