package com.project.shipsAndBerths.model.state;

import com.project.shipsAndBerths.model.Ship;

public class UnloadingState extends AbstractState {

    UnloadingState(Ship ship) {
        super(ship);
    }

    @Override
    public String waitingInHarbour() {
        return "";
    }

    @Override
    public String unloading() {
        return "";
    }

    @Override
    public String leavingTheHarbour() {
        return "";
    }
}
