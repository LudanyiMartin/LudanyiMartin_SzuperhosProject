package hu.petrik.szuperhosprojekt;

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
    public void gyogyul() {

    }

    @Override
    public String toString() {
        return String.format("Batman: leleményesség: %.2f", this.lelemenyesseg);
    }
}
