package com.project.Models;

import com.project.Models.States.*;

public class Ship{
    private String shipName;
    private int shipLoadCapacity;
    private boolean isAtBerth;
    private AbstractState state;

    public Ship(String shipName, int loadCapacity){
        this.state = new WatingState(this);
        setAtBerth(false);
        this.shipName = shipName;
        this.shipLoadCapacity = loadCapacity;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName=shipName;
    }

    public int getShipLoadCapacity() {
        return shipLoadCapacity;
    }

    public void setShipLoadCapacity(int shipLoadCapacity) {
        this.shipLoadCapacity=shipLoadCapacity;
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
