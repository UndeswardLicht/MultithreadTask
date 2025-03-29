package com.project.Models.States;

import com.project.Models.Ship;

public class LeavingState extends AbstractState {

    LeavingState(Ship ship) {
        super(ship);
    }

    @Override
    public String WaitingInHarbour() {
        return "";
    }

    @Override
    public String Unloading() {
        return "";
    }

    @Override
    public String LeavingTheHarbour() {
        return "";
    }
}
