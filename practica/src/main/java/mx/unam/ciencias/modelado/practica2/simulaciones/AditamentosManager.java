package mx.unam.ciencias.modelado.practica2.simulaciones;

import mx.unam.ciencias.modelado.practica2.decorator.*;
import mx.unam.ciencias.modelado.practica2.template.*;
import mx.unam.ciencias.modelado.practica2.common.*;
import mx.unam.ciencias.modelado.practica2.iterator.*;

/**
 * Clase AditamentosManager, nos sirve para generar
 * un menú para que el usuario escoja aditamentos de los que tenemos
 * en el paquete "mx.unam.ciencias.modelado.practica2.decorator".
 */
public class AditamentosManager{

    /**Iterable de las instancias de tipo Vehiculo */
    private VehiculoIterable aditamentos;
    /**Vehiculo previamente seleccionado por el usuario */
    private Vehiculo vehiculo;
    /**Contador de los aditamentos escojidos por el usuario. */
    private int contadorAditamentos = 0;
    /**El máximo numero de aditamentos permitidos para el usuario. */
    private static final int MAXIMO_ADITAMENTOS = 6;

    /**
     * Constructor de la clase, inicializa el iterador.
     * @param vehiculo una instancia de {@code Vehiculo}
     *  */
    public AditamentosManager(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        aditamentos = new VehiculoIterable();
        generaListaAditamentos();

    }

    /**Método para agregar elementos al iterable. */
    public void generaListaAditamentos(){
        Vehiculo vehiculoNulo = new VehiculoNulo();
        aditamentos.agregarVehiculo(new FarosNiebla(vehiculoNulo));
        aditamentos.agregarVehiculo(new VidriosPolarizados(vehiculoNulo));
        aditamentos.agregarVehiculo(new RadioDeComunicacion(vehiculoNulo));
        aditamentos.agregarVehiculo(new AleronDeportivo(vehiculoNulo));
        aditamentos.agregarVehiculo(new LlantasTodoTerreno(vehiculoNulo));
        aditamentos.agregarVehiculo(new SuspensionRegulable(vehiculoNulo));
        aditamentos.agregarVehiculo(new CamaraDeReversa(vehiculoNulo));
        aditamentos.agregarVehiculo(new SensorDeEstacionamiento(vehiculoNulo));
        aditamentos.agregarVehiculo(new LucesLed(vehiculoNulo));
        aditamentos.agregarVehiculo(new AsientosDeCuero(vehiculoNulo));
        aditamentos.agregarVehiculo(new BocinasBoze(vehiculoNulo));
        aditamentos.agregarVehiculo(new DifusorDeAire(vehiculoNulo));
    }

    /**
     * Método que genera el menú de los aditamentos disponibles.
     * @return una cadena con vehículos numerados.
     */
    public String menuAditamentos(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n Aditamentos disponibles:");
        int indice = 0;
        
        for(Vehiculo aditamento: aditamentos){
            sb.append("\n\t" + (indice++) + "." + aditamento.getClass().getSimpleName());
        }
        sb.append("\n\t" + aditamentos.getLongitud() + ". Proceder con el viaje.");

        return sb.toString();
    }

    /**
     * Método para elegir uno de los vehículos del iterable.
     * @return el vehículo tuneado por el usuario.
     */
    public Vehiculo seleccionaAditamentos(){
        while(contadorAditamentos < MAXIMO_ADITAMENTOS){
            Colors.println(menuAditamentos(), Colors.GREEN);
            int eleccion = MetodosGet.getInt("Ingrese su elección: ", "Entrada inválida.", 0, aditamentos.getLongitud());

            if(eleccion == aditamentos.getLongitud()){
                break;
            }

            aplicaAditamento((Aditamento) aditamentos.get(eleccion));

            ++contadorAditamentos;

            if(contadorAditamentos == MAXIMO_ADITAMENTOS){
                Colors.println("Límite de aditamentos alcanzado.", Colors.CYAN);
                break;
            }

        }

        return vehiculo;
    }

    /**
     * Método encargado de aplicar el aditamento sobre el vehículo local.
     * @param aditamento el aditamento a colocar.
     */
    public void aplicaAditamento(Aditamento aditamento){
        if (aditamento instanceof FarosNiebla) {
            vehiculo = new FarosNiebla(vehiculo);

        } else if (aditamento instanceof VidriosPolarizados) {
            vehiculo = new VidriosPolarizados(vehiculo);

        } else if (aditamento instanceof RadioDeComunicacion) {
            vehiculo = new RadioDeComunicacion(vehiculo);

        } else if (aditamento instanceof AleronDeportivo) {
            vehiculo = new AleronDeportivo(vehiculo);

        } else if (aditamento instanceof LlantasTodoTerreno) {
            vehiculo = new LlantasTodoTerreno(vehiculo);

        } else if (aditamento instanceof SuspensionRegulable) {
            vehiculo = new SuspensionRegulable(vehiculo);

        } else if (aditamento instanceof CamaraDeReversa) {
            vehiculo = new CamaraDeReversa(vehiculo);

        } else if (aditamento instanceof SensorDeEstacionamiento) {
            vehiculo = new SensorDeEstacionamiento(vehiculo);

        } else if (aditamento instanceof LucesLed) {
            vehiculo = new LucesLed(vehiculo);

        } else if (aditamento instanceof AsientosDeCuero) {
            vehiculo = new AsientosDeCuero(vehiculo);

        } else if (aditamento instanceof BocinasBoze) {
            vehiculo = new BocinasBoze(vehiculo);

        } else if (aditamento instanceof DifusorDeAire) {
            vehiculo = new DifusorDeAire(vehiculo);
        }
    }


}