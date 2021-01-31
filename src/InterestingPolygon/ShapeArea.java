package InterestingPolygon;

public class ShapeArea {

    public static void main(String[] args) {

        ShapeArea shape = new ShapeArea();
        System.out.println(shape.polygon(5));

    }

    public int polygon (int n) {

        n = n * n + ((n - 1) * (n - 1));

        return n;
    }
}
