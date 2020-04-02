package com.company;

public class Humans extends Fantasy implements Printable{
    private String qualityInPeople;

    Humans(String location, String qualityInPeople){
        super(location);
        this.qualityInPeople = qualityInPeople;
    }

    public String getQualityInPeople(){
        return qualityInPeople;
    }

    @Override
    public void print(){
        System.out.println("Местонахождение - "+ super.getLocation() + " качества у расы людей" + qualityInPeople);
    }
}
