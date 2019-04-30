package ohm.softa.a05.model;

import sun.rmi.runtime.Log;

import java.io.Console;

public class Flower extends Plant {

    PlantColor plantColor;

    public Flower(double Height, String Family, String Name, PlantColor PlantColor){
            super(Height, Family, Name);

            if(PlantColor == PlantColor.GREEN){
                throw new IllegalArgumentException("Flowers are not green.");
            }
            else {
                plantColor = PlantColor;
            }
    }

    public double getHeight(){
        return height;
    }

    public String getFamily(){
        return family;
    }

    public String getName(){
        return name;
    }

    public PlantColor getPlantColor(){
        return this.plantColor;
    }
}
