import lombok.Getter;
import lombok.Builder;
@Getter
@Builder
public class Cube implements Shape {
    double Pll;

    public double getVolume(){

        return Pll*Pll*Pll;
    }
}
