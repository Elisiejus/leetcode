package InterestingPolygon;

public class shapeArea {

    public static void main(String[] args) {

        shapeArea shape = new shapeArea();
        System.out.println(shape.polygon(5));

    }

    public int polygon (int n) {

        n = n * n + ((n - 1) * (n - 1));

        return n;
    }
}
