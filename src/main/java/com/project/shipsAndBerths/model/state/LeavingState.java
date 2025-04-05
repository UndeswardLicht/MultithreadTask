package com.project.shipsAndBerths.model.state;

import com.project.shipsAndBerths.model.Ship;

public class LeavingState extends AbstractState {

    LeavingState(Ship ship) {
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
