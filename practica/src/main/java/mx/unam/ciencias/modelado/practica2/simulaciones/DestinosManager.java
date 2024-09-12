package mx.unam.ciencias.modelado.practica2.simulaciones;

import mx.unam.ciencias.modelado.practica2.common.*;
import mx.unam.ciencias.modelado.practica2.template.*;
import mx.unam.ciencias.modelado.practica2.iterator.*;
import java.util.Map;

public class DestinosManager{

    /**Iterable de los destinos. */
    private DestinoIterable destinos;
    /** Nombre de la ubicacion del cliente.*/
    private String ubicacion;
    /** Coordenadas de la ubicacion del cliente. */
    private Coordenadas coordenadasUbicacion = new Coordenadas(0,0);
    /** Nombre del destino del cliente. */
    private String destino;
    /** Coordenadas del destino del cliente. */
    private Coordenadas coordenadasDestino = new Coordenadas(0,0);
    /**Terreno del camino. */
    private Terreno terreno;

    /**Constructor de la clase, inicializa y llena el iterable. */
    public DestinosManager(){
        destinos = new DestinoIterable();
        generaDestinos();
    }

    /**
     * Método que llena el iterable de posibles destinos.
     */
    public void generaDestinos(){
        destinos.agregar("Xochimilco", new Coordenadas(19.25465, -99.10356));
        destinos.agregar("Polanco", new Coordenadas(19.433333333333, -99.2));
        destinos.agregar("Estadio Azteca", new Coordenadas(19.303055555556, -99.150555555556));
        destinos.agregar("Torre Latino", new Coordenadas(19.43388888888, -99.140555555556));
        destinos.agregar("Monumento a la Revolucion", new Coordenadas(19.4361792, -99.1546288));
        destinos.agregar("Auditorio Nacional", new Coordenadas(19.42478195, -99.194810503198));
        destinos.agregar("Cosmovitral", new Coordenadas(19.29363333, -99.65319167));
        destinos.agregar("Piramides de Teotihuacan", new Coordenadas(19.6925, -98.843888888889));
        destinos.agregar("Tepotzotlan", new Coordenadas(19.716111111111, -99.223611111111));
        destinos.agregar("Xochicalco", new Coordenadas(18.804306, -99.296639));
    }

    /**
     * Método para generar el menú de destinos.
     * @return una cadena con todos los destinos del iterable.
     */
    public String menuDestinos(){
        StringBuilder sb = new StringBuilder();
        sb.append("Destinos disponibles: \n");
        for(Map.Entry<String, Coordenadas> destino : destinos){
            sb.append("\t" + destino.getKey() + "\n");
        }
        return sb.toString();
    }

    /**
     * Método para seleccionar un destino del iterable.
     * @return El nombre del destino (key) seleccionado.
     */
    public String seleccionarDestino(){
        Colors.println(menuDestinos(), Colors.GREEN);
        String destino;
        while(true){
            destino = MetodosGet.getString("Ingrese el nombre de una ubicación: ", "Error, intente de nuevo.");
            if(!destinos.contieneDestino(destino)){
                Colors.println("No es una ubicación, intente de nuevo.", Colors.RED);
            } else{
                break;
            }
        }
        return destino;
    }

    /**Método para seleccionar ubicacion y destino. */
    public void seleccionaPartidaDestino(){
        Colors.println("Ingrese su ubicación.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
        this.ubicacion = seleccionarDestino();
        this.coordenadasUbicacion = destinos.getCoordenadas(this.ubicacion);

        Colors.println("Ingrese el destino al que desea ir.", Colors.MAGENTA + Colors.HIGH_INTENSITY);
        this.destino = seleccionarDestino();
        this.coordenadasDestino = destinos.getCoordenadas(this.destino);

    }

    /**
     * Método para calcular distancia entre el destino y la ubicacion.
     * El calculo es una mera formalidad porque lo considera como si estuvieran en un plano.
     * @return la distancia entre los dos puntos.
     */
    public double calcularDistancia(){
        double dLatitud = coordenadasDestino.getLatitud() - coordenadasUbicacion.getLatitud();
        double dAltitud = coordenadasDestino.getLatitud() - coordenadasUbicacion.getLatitud();
        return Math.sqrt(dLatitud*dLatitud + dAltitud*dAltitud);
    }

    /**
     * Método que determina el terreno de la ruta para el viaje según el vehiculo.
     * @param vehiculo una instancia de Vehiculo.
     * @return Un atributo de la enumeracion Terreno.
     */
    public Terreno determinaTerreno(Vehiculo vehiculo){
        if(vehiculo instanceof Carro){
            return Terreno.CARRETERA;

        } else if(vehiculo instanceof Motocicleta){
            return Terreno.TERRACERIA;

        } else if(vehiculo instanceof Vehiculo4x4){
            return Terreno.CERRO;

        } else if(vehiculo instanceof Autobus){
            return Terreno.CARRETERA;

        } else if(vehiculo instanceof Scooter){
            return Terreno.URBANO;
        }

        return null;

    }

    /**
     * Método para calcular un multiplicador de velocidad en base al terreno de la ruta.
     * @param terreno un atributo de la enumeracion Terreno.
     * @return el escalar de velocidad para la ruta.
     */
    public double determinaVelocidad(Terreno terreno){
        switch (terreno) {
            case CARRETERA:
                return 70.0;  
            case TERRACERIA:
                return 80.0;  
            case CERRO:
                return 90.0;  
            case URBANO:
                return 35.0;  
            default:
                return 0.0; 
        } 
    }

    /**
     * Método para calcular el tiempo de un viaje.
     * @param vehiculo una instancia de vehiculo.
     * @return el tiempo que se tardará en realizar el viaje.
     */
    public double calcularTiempoViaje(Vehiculo vehiculo){
        double distancia = calcularDistancia();
        this.terreno = determinaTerreno(vehiculo);
        double velocidad = determinaVelocidad(this.terreno);
        return 100*(distancia/velocidad);
    }

    /**
     * Método para simular el viaje de un vehículo.
     * @param vehiculo una instancia de vehiculo.
     */
    public void simularViaje(Vehiculo modelo, Vehiculo vehiculoUsuario){
        seleccionaPartidaDestino();
        double tiempo = calcularTiempoViaje(modelo);
        double distancia = calcularDistancia();
        vehiculoUsuario.ejecutaViaje(terreno, destino, tiempo);
    }
}