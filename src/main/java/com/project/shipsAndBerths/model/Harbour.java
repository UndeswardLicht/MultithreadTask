package com.project.shipsAndBerths.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public final class Harbour {
    private static final Logger logger = LogManager.getLogger(Harbour.class);

    //TODO double lock check instead of 'volatile' and 'synchronized'???
    private static volatile Harbour instance;
    public ArrayList<Ship> shipsInHarbour;
    public ArrayList<Berth> berthsInHarbour;

    private Harbour(){
        this.shipsInHarbour = new ArrayList<>();
        this.berthsInHarbour = new ArrayList<>();
    }

    public static Harbour getInstance(){
        Harbour result = instance;
        if(result != null){
            return result;
        }
        synchronized(Harbour.class){
            if (instance == null){
                instance = new Harbour();
            }
            return instance;
        }
    }

    public void addShipToHarbour(Ship ship){
        shipsInHarbour.add(ship);
    }

    public Ship takeShipToBerth(){
        try {
            return shipsInHarbour.getFirst();
        }catch (NoSuchElementException nsee){
            logger.error("No ships in harbour anymore!");
            nsee.printStackTrace();
            throw nsee;
        }
    }

    public void addBerthToHarbour(Berth berth){
        berthsInHarbour.add(berth);
    }
}
