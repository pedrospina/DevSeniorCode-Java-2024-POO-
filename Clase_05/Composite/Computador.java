package Clase_05.Composite;

public class Computador {
    private TarjetaMadre tarjetaMadre;

    public Computador() {
        this.tarjetaMadre = new TarjetaMadre(1000, 16, 4, 8, 64);
        tarjetaMadre.registrarTipoHD("SSD");
    }

    public void mostrarConfiguracion() {
        System.out.println("Configuracion de la PC:");
        tarjetaMadre.getMotherBoardComponets();
    }

}
