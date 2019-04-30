package ohm.softa.a05.model;

public class Shrub extends Plant {

    PlantColor plantColor;

    public Shrub(double Height, String Family, String Name, PlantColor PlantColor){
            super(Height, Family, Name);

            if(PlantColor != PlantColor.GREEN)
                throw new IllegalArgumentException("Shrubs are always green.");
            plantColor = PlantColor.GREEN;
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
