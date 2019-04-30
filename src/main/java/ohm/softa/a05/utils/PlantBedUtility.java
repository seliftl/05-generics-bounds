package ohm.softa.a05.utils;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtility<T extends Plant> {
    private PlantBedUtility(){}

    public static <T extends Plant> Map<PlantColor, SimpleList<T>>  splitBedByColor(PlantBed<T> bed){
        //TODO
        Map<PlantColor, SimpleList<T>> splittedBed = new HashMap<>();

        for(PlantColor color : PlantColor.values()){
            splittedBed.put(color, bed.getPlantsByColor(color));
        }

        return splittedBed;
    }

}
