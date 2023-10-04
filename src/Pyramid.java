public class Pyramid implements Shape {

    double h,a;

    public Pyramid(double a, double h){
        this.a = a;
        this.h = h;
    }

    @Override
    public double getVolume(){

        return (a*a*h)/3;
    }


}
