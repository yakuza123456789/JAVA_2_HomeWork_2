package com.company;

public class Dwarfs extends Fantasy implements Printable{
    private int whatHeight;

    Dwarfs(String location, int whatHeight){
        super(location);
        this.whatHeight = whatHeight;
    }

    public int getWhatHeight(){
        return whatHeight;
    }


    @Override
    public void print() {
        System.out.println("Местонахождение - " + super.getLocation() + " рост у дворфов " + whatHeight + " см");
    }
}
