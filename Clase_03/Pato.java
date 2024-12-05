package Clase_03;

public class Pato implements Volador, Nadador {

    @Override
    public void nadar() {
        System.out.println("El pato esta nadando");
    }

    @Override
    public void volar() {
        System.out.println("El pato esta volado");
    }

}
