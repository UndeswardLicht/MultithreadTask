package com.project.Utils;

import com.project.Models.Berth;
import com.project.Models.Harbour;
import com.project.Models.Ship;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {
    private static final Logger logger = LogManager.getLogger(Deserializer.class);

    //TODO add my exceptions to code
    //TODO duplicated code?? generalise two methods in one??

    public void getShipsToHarbour(){
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("resources/ships.txt"))) {
            //TODO harbour doesn't belong here?? this method should return ArrayList???
            Harbour harbour = Harbour.getInstance();
            harbour.addShipToHarbour((Ship)input.readObject());
        }catch (IOException | ClassNotFoundException e){
            logger.error("");
        }
    }

    public void getBerthsToHarbour(){
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("resources/berths.txt"))) {
            Harbour harbour = Harbour.getInstance();
            harbour.addBerthToHarbour((Berth)input.readObject());
        }catch (IOException | ClassNotFoundException e){
            logger.error("");
        }
    }
}
