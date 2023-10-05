import lombok.Getter;
import lombok.AllArgsConstructor;
@Getter
@AllArgsConstructor
public class Pyramid implements Shape {

    double h,a;



    public double getVolume(){

        return (a*a*h)/3;
    }


}
