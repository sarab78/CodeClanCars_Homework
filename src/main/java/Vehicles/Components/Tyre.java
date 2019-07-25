package Vehicles.Components;

public class Tyre {

    private String type;
    private int size;

    public Tyre(String type, int size){
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
