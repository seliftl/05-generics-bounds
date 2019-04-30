package ohm.softa.a05.model;

public abstract class Plant implements Comparable<Plant>{
    double height;
    String family;
    String name;

    public Plant(double Height, String Family, String Name){
       height = Height;
       family = Family;
       name = Name;
    }

    public abstract double getHeight();

    public abstract String getFamily();

    public abstract String getName();

    public abstract PlantColor getPlantColor();

    @Override
    public int compareTo(Plant p) {
        if(p.height == this.height)
            return 0;
        else if(p.height < this.height)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString(){
        return "Plant: Family: " + this.family + " Name: " +this.name + " Height: "+this.height;
    }
}
