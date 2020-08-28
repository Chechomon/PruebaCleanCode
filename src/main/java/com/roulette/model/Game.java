package com.roulette.model;
import java.util.*;
/**
 *
 * @author Sergio Peña
 */
public class Game {
    private int id;
    private long ruleta;
    private List<Bet> apuestas;
    private int numeroGanador;

    public Game(int id, long ruleta) {
        super();
        this.id = id;
        this.ruleta = ruleta;
        apuestas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getRuleta() {
        return ruleta;
    }

    public void setRuleta(long ruleta) {
        this.ruleta = ruleta;
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

    
}
