package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos{
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos hos) {
        if (hos instanceof Bosszuallo) {
            Bosszuallo b1 = (Bosszuallo) hos;
            if(this.szuperero > b1.szuperero && b1.vanEGyengesege){
                return true;
            }
        } else if (hos instanceof Batman) {
            if (this.szuperero >= 2 * hos.mekkoraAzEreje()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int mekkoraAzEreje() {
        return (int) this.szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return String.format("Szupererő: %.2f; %s gyengesége", szuperero, vanEGyengesege ? "van" : "nincs");
    }
}
