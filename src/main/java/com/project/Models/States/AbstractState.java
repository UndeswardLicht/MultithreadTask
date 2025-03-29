package com.project.Models.States;

import com.project.Models.Ship;

public abstract class AbstractState {
    Ship ship;

    AbstractState(Ship ship){
        this.ship = ship;
    }

    public abstract String WaitingInHarbour();
    public abstract String Unloading();
    public abstract String LeavingTheHarbour();
}
