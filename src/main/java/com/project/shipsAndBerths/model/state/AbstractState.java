package com.project.shipsAndBerths.model.state;

import com.project.shipsAndBerths.model.Ship;

public abstract class AbstractState {
    Ship ship;

    AbstractState(Ship ship){
        this.ship = ship;
    }

    public abstract String waitingInHarbour();
    public abstract String unloading();
    public abstract String leavingTheHarbour();
}
