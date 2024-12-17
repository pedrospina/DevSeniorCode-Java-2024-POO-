package Clase_05.Composite;

public class Procesador {
    private int capacidad;
    private int nucleos;

    public Procesador(int capacidad, int nucleos) {
        this.capacidad = capacidad;
        this.nucleos = nucleos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void mostrarDetalles() {
        System.out.println("El procesador es de: " + this.capacidad + "GHz y tiene " + this.nucleos + " nucleos");
    }
}
