package Clase_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Carro());
        vehiculos.add(new Avion());
        vehiculos.add(new Moto());
        System.out.println(vehiculos);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.moverse();
        }

        Nadador.patear();

        Pato pato = new Pato();
        pato.nadar();
        pato.volar();
        pato.clavado();
    }
}
