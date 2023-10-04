
public class main {
    public static void main(String[] args) {
        //System.out.print("Hello, world");

        Cube cube1 = new Cube(3.0f);
        System.out.println(cube1.getVolume());

        Pyramid pyra = new Pyramid(3.0f,4.0f);
        System.out.println(pyra.getVolume());
    }
}