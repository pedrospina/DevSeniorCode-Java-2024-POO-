package Clase_03;

public class Moto implements Vehiculo {

    @Override
    public void moverse() {
        System.out.println("Se mueve sobre 2 ruedas");
    }

    @Override
    public int obtenerVelocidad() {
        return 120;
    }

    @Override
    public void cambiarMarcha(int cambio) {
        System.out.println("Se cambio a :" + cambio + " marcha");
    }

    public void hacerCaballito() {
        System.out.println("Se mueve sobre 1 rueda");
    }

}
