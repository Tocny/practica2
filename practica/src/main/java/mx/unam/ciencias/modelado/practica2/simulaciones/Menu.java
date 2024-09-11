package mx.unam.ciencias.modelado.practica2.simulaciones;

public class Menu{
    Vehiculo vehiculo = new VehiculoNulo();
    
    public void ejecutaMenu(){
        vehiculo = VehiculoManager.seleccionaVehiculo();
        
        AditamentosManager aditamentos = new AditamentosManager(vehiculo);

        vehiculo = aditamentos.seleccionaAditamentos();
    }
}