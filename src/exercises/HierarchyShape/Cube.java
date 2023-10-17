package exercises.HierarchyShape;

public class Cube extends ThreeDimensionalShape{

    @Override
    public void calculateArea(int side) {
        System.out.println("[3D] Area for cube: " + (6 * (side * side)));
    }

    @Override
    public void calculateVolume(int side) {
        System.out.println("[3D] Volume for sphere: " + (side * side * side));
    }
}
