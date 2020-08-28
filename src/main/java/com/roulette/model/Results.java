package com.roulette.model;
import java.util.*;

/**
 *
 * @author alejo
 */
public class Results {
    private long ruleta;
    private int numeroJuegoMesa;
    private List<Bet> apuestas;
    private int numeroGanador;
    private HashMap<Integer, Long> resultadosClientes;

    public Results(long ruleta, int numeroJuegoMesa,List<Bet> apuestas, int numeroGanador) {
        super();
        this.ruleta = ruleta;
        this.numeroJuegoMesa = numeroJuegoMesa;
        this.apuestas = apuestas;
        this.numeroGanador = numeroGanador;
        resultadosClientes = new HashMap<>();
    }

    public long getRuleta() {
        return ruleta;
    }

    public void setRuleta(long ruleta) {
        this.ruleta = ruleta;
    }

    public int getNumeroJuegoMesa() {
        return numeroJuegoMesa;
    }

    public void setNumeroJuegoMesa(int numeroJuegoMesa) {
        this.numeroJuegoMesa = numeroJuegoMesa;
    }

    public List<Bet> getApuestas() {
        return apuestas;
    }

    public void setApuestas(List<Bet> apuestas) {
        this.apuestas = apuestas;
    }

    public int getNumeroGanador() {
        return numeroGanador;
    }

    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    public HashMap<Integer, Long> getResultadosClientes() {
        return resultadosClientes;
    }

    public void setResultadosClientes(HashMap<Integer, Long> resultadosClientes) {
        this.resultadosClientes = resultadosClientes;
    }
    
    
}
