package com.company;

public class Main {

    public static void main(String[] args) {
    createObject("Elf").print();
    createObject("Dwarfs").print();
    createObject("Humans").print();

    }

    public static Printable createObject (String className){
        Printable printable = null;
        switch (className){
            case "Elf":
                printable = new Elf("Великие Леса, ", 2500);
                break;
            case "Dwarfs":
                printable = new Dwarfs("Подземные Города, ", 125);
                break;
            case "Humans":
                printable = new Humans("Средиземье, "," \"Алчность\"");

        }
        return printable;
    }
}
