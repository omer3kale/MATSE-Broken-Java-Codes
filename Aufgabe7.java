package projects.project01;
import java.awt.Point;
import java.lang.Math;


public class Aufgabe7{
    public class Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Punkt(Punkt p2){
        private int p2;
    }
    public Punkt(Punkt p2){
        this.p2 = punkt.p2;
    }
    public void schiebe(double dx, double dy){
        Punkt meinPunkt = new Point(1.7,7.3);
        double dxVerschiebung = 7.3;
        double dyVerschiebung = 1.7;

        meinPunkt.dx += dxVerschiebung;
        meinPunkt.dy += dyVerschiebung;
    }
        public class Punkt{
            private int z;
            private int u;

            public Punkt(int z, int u){
                this.z = z;
                this.u = u;
            }

            @Override
    public String toString(){
        return "(" + z + "," + u + ")";
        }
        public static void main(String[]args){
            Punkt meinPunkt = new Point(3,7);
            String punkt asString = meinPunkt.toString();
            System.out.println("Punkt als String" + punktasString);
        }
    }
}

public class Komplex{
    private int real;
    private int imaginary;

    public Komplex(int x, int y){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal(){
        return real;
    }

    public int getImaginary(){
        return imaginary;
    }

    public static void main(String[] args){
        Komplex num7 = new Komplex(73, 17);
        System.out.println("Real:" + num7.getReal());
        System.out.println("Imaginary:" + num7.getImaginary());
    }
}

public Komplex(Komplex k2){
    private k2;
}
public Komplex(Komplex k2){
    this.k2 = Komplex k2;
}

public String toString(){
    return "(" + x + "," + y + ")";
}

public double getBetrag() {
    return Math.sqrt(real * real + imaginary * imaginary);
}

public void konjugiertKomplex(){
    private double real;
    private double imaginary;

    public konjugiertKomplex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public konjugiertKomplex konjugiere(){
        return new konjugiertKomplex(this.real, -this.imaginary);
    }
}
