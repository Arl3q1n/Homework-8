package exercises;

public class Parallelogram {

    public Parallelogram() {

    }


    public int calculatePerimeter(int length, int width) {
        return 2 * (length * width);
    }

    public int calculatePerimeter(int sideLength) {
        return sideLength * 4;
    }

    public double calculateArea(int length, double width) {
        return length * width;
    }

    public int calculateArea(int sideLength) {
        return sideLength * sideLength;
    }
}
