package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;
import mx.unam.ciencias.modelado.practica2.simulaciones.Terreno;

/**
 * Clase aditamento, referente al patrón de diseño decorator.
 * Se encargará de las operaciones para los articulos de tuning del programa.
 * Así como de sobrecargar los métodos abstractos de su clase padre.
 */
public abstract class Aditamento extends Vehiculo{
    /**Vehiculo asociado al aditamento */
    protected Vehiculo vehiculo;
    /**
     * Constructor de la clase
     * @param vehiculo para asignar al atributo del mismo nombre.
     */
    public Aditamento(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    /**
     * Método que sobrecarga el método sigue ruta.
     * @param terreno el terreno de la ruta.
     */
    @Override public void sigueRuta(Terreno terreno){
        vehiculo.sigueRuta(terreno);
    }

    /**
     * Método que sobrecarga el método alerta combustible.
     */
    @Override public void alertaCombustible(){
        vehiculo.alertaCombustible();
    }

    /**
     * Método abstracto para obtener la descripción del vehiculo.
     * @return una cadena con el método concreto de la descripción de cada vehiculo.
     */
    @Override public abstract String descripcion();

}