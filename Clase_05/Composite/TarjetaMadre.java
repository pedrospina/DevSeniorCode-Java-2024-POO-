package Clase_05.Composite;

public class TarjetaMadre {

    private Procesador procesador;
    private Memoria memoria;
    private Almacenamiento almacenamiento;
    private Grafica grafica;

    public TarjetaMadre(int almacenamiento, int memoria, int capacidadProcesador, int nucleosProcesador, int grafica) {
        this.almacenamiento = new Almacenamiento(almacenamiento);
        this.memoria = new Memoria(memoria);
        this.procesador = new Procesador(capacidadProcesador, nucleosProcesador);
        this.grafica = new Grafica(grafica);
    }

    public void registrarTipoHD(String tipo) {
        this.almacenamiento.setTipo(tipo);
    }

    public void getMotherBoardComponets() {
        System.out.println("Componentes de la tarjeta madre");
        almacenamiento.mostrarDetalles();
        memoria.mostrarDetalles();
        procesador.mostrarDetalles();
        grafica.mostrarDetalles();
    }

}