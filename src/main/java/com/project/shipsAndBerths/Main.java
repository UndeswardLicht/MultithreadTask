package com.project.shipsAndBerths;

import com.project.shipsAndBerths.model.Berth;
import com.project.shipsAndBerths.model.Ship;
import com.project.shipsAndBerths.util.FromFileRetriever;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Ship> ships = FromFileRetriever.retrieveShipsFromFile();
        for(Ship ship : ships){
            System.out.println(ship.toString());
        }
        ArrayList<Berth> berths = FromFileRetriever.retrieveBerthsFromFile();
        for(Berth berth: berths){
            System.out.println(berth.toString());
        }
    }
}