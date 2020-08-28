package com.roulette.model;

/**
 *
 * @author Sergio Peña
 */
public class Bet {
    private int client;
    private int amount;
    private int betNumber;
    
    public Bet() {
        super();
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBetNumber() {
        return betNumber;
    }

    public void setBetNumber(int betNumber) {
        this.betNumber = betNumber;
    }
}
