package com.project.shipsAndBerths.util;

import com.project.shipsAndBerths.constant.FileNameConst;
import com.project.shipsAndBerths.model.Berth;
import com.project.shipsAndBerths.model.Ship;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;

import static com.project.shipsAndBerths.constant.FileNameConst.BERTHS_FILE;
import static com.project.shipsAndBerths.constant.FileNameConst.SHIPS_FILE;

public class FromFileRetriever {
    private static final Logger logger = LogManager.getLogger(FromFileRetriever.class);

    //TODO duplicated code?? generalise two methods in one??
    public static ArrayList<Ship> retrieveShipsFromFile(){
        ArrayList<Ship> ships = new ArrayList<>();
        String tmp;
        try(BufferedReader reader =
                    new BufferedReader(new FileReader(SHIPS_FILE))){
            while ((tmp = reader.readLine()) != null){
                String[] parts= tmp.split(",");
                var name = parts[0];
                var load = Integer.parseInt(parts[1]);
                Ship ship = new Ship(name, load);
                ships.add(ship);
            }
        }catch (IOException e){
            e.printStackTrace();
            //TODO change to custom exception
        }
        return ships;
    }

    public static ArrayList<Berth> retrieveBerthsFromFile(){
        ArrayList<Berth> berths = new ArrayList<>();
        String tmp;
        try(BufferedReader reader =
                    new BufferedReader(new FileReader(BERTHS_FILE))){
            while ((tmp = reader.readLine()) != null){
                String[] parts= tmp.split(",");
                int id = Integer.parseInt(parts[0]);
                int capacity = Integer.parseInt(parts[1]);
                Berth berth = new Berth(id, capacity);
                berths.add(berth);
            }
        }catch (IOException e){
            e.printStackTrace();
            //TODO change to custom exception
        }
        return berths;
    }

}
