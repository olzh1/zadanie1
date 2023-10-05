
public class main {
    public static void main(String[] args) {
        //System.out.print("Hello, world");

        Cube cube1 = Cube.builder().Pll(3.0f).build();
        System.out.println(cube1.getPll());
        System.out.println(cube1.getVolume());
        System.out.println(cube1.getVolume());

        Pyramid pyra = new Pyramid(3.0f,4.0f);
        System.out.println(pyra.getVolume());
    }
}
