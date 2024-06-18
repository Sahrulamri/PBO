package week10;

public class Lingkaran {
    private int radius;
    private static final pi = 3.14;

    public Lingkaran(int radius) {
        this.radius = radius;
    }

    public double luas() {
        return radius*radius*pi;
    }

    public int getRadius() {
        return radius;
    }
}