package projects.project01;

public class Bruch {


    public int zaehler;
    public int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public double getDoubleWert() {
        return (double) zaehler / nenner;
    }

}
