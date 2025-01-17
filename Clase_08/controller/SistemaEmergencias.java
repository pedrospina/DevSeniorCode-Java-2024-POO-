package Clase_08.controller;

import java.util.ArrayList;
import java.util.List;

import Clase_08.model.Emergencia;
import Clase_08.model.interfaces.IServicioEmergencia;
import Clase_08.model.observer.ObserverEmergencias;
import Clase_08.model.observer.SujetoEmergencias;
import Clase_08.model.strategy.StrategyPrioridad;
import Clase_08.model.strategy.StrategyPrioridadGravedad;

public class SistemaEmergencias implements SujetoEmergencias {

    private static SistemaEmergencias instancia;
    private List<Emergencia> listaEmergencias;
    private List<IServicioEmergencia> listaRecursos;
    private List<ObserverEmergencias> observadores;

    private StrategyPrioridad strategyPrioridad;

    private int emergiasAtendidas;
    private long tiempoTotalAtencion;

    private SistemaEmergencias() {
        strategyPrioridad = new StrategyPrioridadGravedad();
        listaEmergencias = new ArrayList<>();
        listaRecursos = new ArrayList<>();
        observadores = new ArrayList<>();
        emergiasAtendidas = 0;
        tiempoTotalAtencion = 0;
    }

    public static SistemaEmergencias getInstancia() {
        if (instancia == null) {
            instancia = new SistemaEmergencias();
        }
        return instancia;
    }

    @Override
    public void agregarObserver(ObserverEmergencias observerEmergencias) {
        observadores.add(observerEmergencias);
    }

    @Override
    public void eliminarObserver(ObserverEmergencias observerEmergencias) {
        observadores.remove(observerEmergencias);
    }

    @Override
    public void notificarEmergencias(Emergencia emergencia) {
        for (ObserverEmergencias observerEmergencias : observadores) {
            observerEmergencias.onNuevasEmergencias(emergencia);
        }
    }

    // gestion de recursos

    // gestion emergencias

    // mostrar estadisticas

}
