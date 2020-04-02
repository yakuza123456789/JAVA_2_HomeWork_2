package com.company;

public class Elf extends Fantasy implements Printable{
    private int howLongDoTheyLive;

    Elf(String location,int howLongDoTheyLive){
        super(location);
        this.howLongDoTheyLive = howLongDoTheyLive;
    }

    public int getHowLongDoTheyLive(){
        return howLongDoTheyLive;
    }

    @Override
    public void print(){
        System.out.println("Местонахождение - " + super.getLocation() +  howLongDoTheyLive + " лет живут Эльфы");
    }

}
