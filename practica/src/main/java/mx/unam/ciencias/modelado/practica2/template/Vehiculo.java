package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.*;

public abstract class Vehiculo {
    protected EstadoVehiculo estadoActual;

    public void ejecutaViaje(){
        System.out.println(descripcion());
        empiezaViaje();
        sigueRuta();
        alertaCombustible();
        finalizaViaje();
    }

    protected void esperaViaje(){
        setEstado(new EstadoEsperando());
    }

    public abstract void sigueRuta();
    public abstract void alertaCombustible();
    public abstract String descripcion();

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
