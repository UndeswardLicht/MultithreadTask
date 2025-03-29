package com.project.Models;

import java.util.Objects;

public class Berth {
    private final int berthId;
    private final int warehouseCapacity;
    private Ship ship;
    private boolean IsBusy;

    public Berth(int id, int warehouseCapacity){
        this.berthId = id;
        this.warehouseCapacity = warehouseCapacity;
        this.IsBusy = false;
    }

    public int getBerthId() {
        return berthId;
    }

    public int getWarehouseCapacity() {
        return warehouseCapacity;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship=ship;
    }

    public boolean isBusy() {
        return IsBusy;
    }

    public void setBusy(boolean busy) {
        IsBusy=busy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Berth berth=(Berth) o;
        return berthId == berth.berthId && warehouseCapacity == berth.warehouseCapacity && IsBusy == berth.IsBusy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(berthId, warehouseCapacity, IsBusy);
    }
}
