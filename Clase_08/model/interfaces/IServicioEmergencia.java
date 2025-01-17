package Clase_08.model.interfaces;

public interface IServicioEmergencia {
    String getId();

    int getPersonalDisponible();

    int getCombustible();

    boolean estaDisponible();

    void asignarPersonal(int cantidad);

    void libreraPersonal(int cantidad);

    void gastarCombustible(int cantidad);

    void tanquearCombustible(int cantidad);

    //

}
