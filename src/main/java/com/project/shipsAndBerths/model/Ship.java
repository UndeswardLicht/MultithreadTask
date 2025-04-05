package com.project.shipsAndBerths.model;

import com.project.shipsAndBerths.model.state.ShipState;

import java.util.Objects;
import java.util.concurrent.Callable;

public class Ship implements Callable<Boolean> {
    private String shipName;
    private int shipLoad;
    private ShipState currentState;

    public Ship(String shipName, int load){
        this.shipName = shipName;
        this.shipLoad= load;
        this.currentState = ShipState.WAITING;
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

    public ShipState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ShipState currentState) {
        this.currentState=currentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship=(Ship) o;
        return shipLoad == ship.shipLoad && Objects.equals(shipName, ship.shipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipName, shipLoad);
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Ship{");
        sb.append("shipName='").append(shipName).append('\'');
        sb.append(", shipLoad=").append(shipLoad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Boolean call() throws Exception {
        return false;
    }
}
