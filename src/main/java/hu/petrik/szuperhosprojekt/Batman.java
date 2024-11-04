package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public double mekkoraAzEreje() {
        return (int) (this.lelemenyesseg * 2);
    }

    @Override
    public boolean legyoziE(Szuperhos hos) {
        if(hos.mekkoraAzEreje() < this.lelemenyesseg){
            return true;
        }
        return false;
    }

    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Batman: leleményesség: {0}", this.lelemenyesseg);
    }
}
