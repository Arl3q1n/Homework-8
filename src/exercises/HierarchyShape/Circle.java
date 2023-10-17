package exercises.HierarchyShape;

public class Circle extends TwoDimensionalShape{

    @Override
    public void calculateArea(int side) {
        System.out.println("[2D] Area for circle: " + (side * side));
    }
}
