package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.*;

public abstract class Vehiculo {
    protected EstadoVehiculo estadoActual;

    // Constructor
    public Vehiculo(EstadoVehiculo estado) {
        this.estadoActual = estado;
    }
    protected void ejecutaViaje(){
        descripcion();
        empiezaViaje();
        sigueRuta();
        alertaCombustible();
        finalizaViaje();
    }

    protected void esperaViaje(){
        setEstado(new EstadoEsperando());
    }
    protected abstract void sigueRuta();
    protected abstract void alertaCombustible();
    protected abstract void descripcion();
    protected void empiezaViaje(){
        System.out.println("Viaje empezado");
    }
    protected void finalizaViaje(){
        System.out.println("Viaje finalizado");
    }
    public void setEstado(EstadoVehiculo estado) {
        this.estadoActual = estado;
   }
}
