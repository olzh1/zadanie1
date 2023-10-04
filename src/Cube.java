

public class Cube implements Shape {
    double a;

    public Cube(double a){
        this.a = a;
    }

    @Override
    public double getVolume(){

        return a*a*a;
    }
}
