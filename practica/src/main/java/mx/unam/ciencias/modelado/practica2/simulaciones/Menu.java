package mx.unam.ciencias.modelado.practica2.simulaciones;

public class Menu{
    Vehiculo vehiculo = new VehiculoNulo();
    
    public void ejecutaMenu(){
        vehiculo = VehiculoManager.seleccionaVehiculo();
        vehiculo = AditamentosManager(vehiculo).seleccionaAditamentos();
    }
}