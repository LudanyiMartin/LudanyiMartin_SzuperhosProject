package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{
    public Vasember() {
        super(150, true);
    }

    public void kutyutKeszit() {
        Random rand = new Random();
        double randomNov = rand.nextDouble() * 10;
        this.setSzuperero(this.getSzuperero() + randomNov);
    }

    public boolean megmentiAVilagot() {
        if(this.getSzuperero() > 1000){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vasember: " + this.getSzuperero();
    }
}
