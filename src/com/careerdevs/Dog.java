package com.careerdevs;

public class Dog {
    private String name;
    private int legs=4;
    private String hair;

    public Dog(String hair, String name){
        this.hair=hair;
        this.name=name;
    }
    public Dog(String hair, int legs, String name){
        this.hair=hair;
        this.legs=legs;
        this.name=name;
    }
    public String speak(){
        return "Woof";
    }
    public String details(){
        return name+" has "+hair+" hair, and "+legs+ " legs.";
    }
    public String toString(){
        return "{name: "+name+", hair: "+hair+", legs: "+legs+"}";
    }
}
