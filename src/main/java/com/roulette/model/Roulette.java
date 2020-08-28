package com.roulette.model;
import java.util.*;
/**
 *
 * @author Sergio Peña
 */
public class Roulette {
    private long id;
    private Boolean state;
    private List<Game> games;
    
    public Roulette(long id) {
        super();
        this.id = id;
        state = false;
        games = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
