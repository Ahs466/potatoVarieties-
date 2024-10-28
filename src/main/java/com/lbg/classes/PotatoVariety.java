package com.lbg.classes;

public class PotatoVariety {
    private String name;
    private double averageMass;
    private String texture;

    public PotatoVariety(String name, double averageMass, String texture){
        this.name = name;
        this.averageMass = averageMass;
        this.texture = texture;
    }

    // Chained Constructor
    public PotatoVariety(String name){
        this(name, 5, null);
    }

    public String getName(){
        return this.name;
    }
    public double averageMass(){
        return this.averageMass;
    }
    public String getTexture(){
        return this.texture;
    }
}
