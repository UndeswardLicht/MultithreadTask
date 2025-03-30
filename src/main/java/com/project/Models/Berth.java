package com.project.Models;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;
import java.util.Objects;

public class Berth implements Serializable {
    private static final Logger logger = LogManager.getLogger(Berth.class);
    private final int berthId;
    private final int warehouseCapacity;
    private Ship ship;
    private boolean IsBerthBusy;
    private boolean isWHFull;

    public Berth(int id, int warehouseCapacity){
        this.berthId = id;
        this.warehouseCapacity = warehouseCapacity;
        this.IsBerthBusy= false;
        this.isWHFull= false;
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

    public boolean isBerthBusy() {
        return IsBerthBusy;
    }

    public void setBerthBusy(boolean berthBusy) {
        IsBerthBusy=berthBusy;
    }

    public boolean isWHFull() {
        return isWHFull;
    }

    public void setWHFull(boolean whFull) {
        isWHFull=whFull;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Berth berth=(Berth) o;
        return berthId == berth.berthId && warehouseCapacity == berth.warehouseCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(berthId, warehouseCapacity);
    }
}
