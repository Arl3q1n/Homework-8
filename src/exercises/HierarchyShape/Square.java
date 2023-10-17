package exercises.HierarchyShape;

public class Square extends TwoDimensionalShape{

    @Override
    public void calculateArea(int side) {
        System.out.println("[2D] Area for square: " + (3.14 * (side * side)));
    }
}
