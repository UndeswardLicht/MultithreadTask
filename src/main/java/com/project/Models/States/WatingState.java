package com.project.Models.States;

import com.project.Models.Ship;

public class WatingState extends AbstractState {

    public WatingState(Ship ship) {
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
