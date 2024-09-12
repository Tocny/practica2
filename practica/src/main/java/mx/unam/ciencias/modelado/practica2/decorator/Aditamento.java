package mx.unam.ciencias.modelado.practica2.decorator;

import mx.unam.ciencias.modelado.practica2.template.Vehiculo;

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
     * @return la cadena del método sigueRuta() del vehiculo local.
     */
    public String sigueRuta(){
        return vehiculo.sigueRuta();
    }

    /**
     * Método que sobrecarga el método alerta combustible.
     * @return la cadena del método alertaCombustible() del vehiculo local.
     */
    public String alertaCombustible(){
        return vehiculo.alertaCombustible();
    }

    /**
     * Método abstracto para obtener la descripción del vehiculo.
     * @return una cadena con el método concreto de la descripción de cada vehiculo.
     */
    public abstract String descripcion();

}