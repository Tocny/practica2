package mx.unam.ciencias.modelado.practica2.template;
abstract class Vehiculo {
protected EstadoVehiculo estadoActual;

// Constructor
public Vehiculo(EstadoVehiculo estado) {
this.estadoActual = estado;

}

    protected abstract void ejecutaViaje();
    protected abstract String esperaViaje();
    protected abstract String verificaPasajero();
    protected abstract String empiezaViaje();
    protected abstract String finalizaViaje();
    protected abstract String sigueRuta();
    protected abstract String alertaCombustible();
    protected abstract String descripcion();

    public void setEstado(EstadoVehiculo estado) {
        this.estadoActual = estado;
    }
}
