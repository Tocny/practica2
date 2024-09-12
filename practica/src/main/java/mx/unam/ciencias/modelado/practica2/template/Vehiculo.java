package mx.unam.ciencias.modelado.practica2.template;

import mx.unam.ciencias.modelado.practica2.state.*;
import mx.unam.ciencias.modelado.practica2.simulaciones.Terreno;

public abstract class Vehiculo {
    protected EstadoVehiculo estadoActual;

    public void ejecutaViaje(Terreno terreno, String destino, double tiempo){
        System.out.println("\nReporte de viaje.");
        System.out.println(descripcion());
        empiezaViaje(destino);
        sigueRuta(terreno);
        alertaCombustible();
        finalizaViaje(tiempo);
    }

    protected void esperaViaje(){
        setEstado(new EstadoEsperando());
        estadoActual.esperandoViaje();
    }

    public abstract void sigueRuta(Terreno terreno);
    public abstract void alertaCombustible();
    public abstract String descripcion();

    protected void empiezaViaje(String destino){
        System.out.println("Viaje empezado. Destino: " + destino);
        setEstado(new EstadoEnMovimiento());
        estadoActual.movimiento();
        estadoActual.abrirPuertas();
    }
    protected void finalizaViaje(double tiempo){
        System.out.println("Viaje finalizado. Tiempo: " +  tiempo + "hrs");
        setEstado(new EstadoFinDelViaje());
        estadoActual.movimiento();
        esperaViaje();
    }
    public void setEstado(EstadoVehiculo estado) {
        this.estadoActual = estado;
   }
}
