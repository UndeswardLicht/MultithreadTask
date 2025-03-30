package com.project.Models;

import com.project.Models.States.*;

import java.io.Serializable;

public class Ship implements Serializable {
    private String shipName;
    private int shipLoad;
    private boolean isAtBerth;
    private AbstractState state;

    public Ship(String shipName, int load){
        this.state = new WatingState(this);
        setAtBerth(false);
        this.shipName = shipName;
        this.shipLoad= load;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName=shipName;
    }

    public int getShipLoad() {
        return shipLoad;
    }

    public void setShipLoad(int shipLoad) {
        this.shipLoad=shipLoad;
    }

    public boolean isShipEmpty(){
        return getShipLoad() == 0;
    }

    public boolean isAtBerth() {
        return isAtBerth;
    }

    public void setAtBerth(boolean atBerth) {
        isAtBerth=atBerth;
    }

    public AbstractState getState() {
        return state;
    }

    public void changeState(AbstractState state) {
        this.state=state;
    }
}
