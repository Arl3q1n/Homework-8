package exercises.HierarchyShape;

public class Sphere extends ThreeDimensionalShape{

    @Override
    public void calculateArea(int side) {
        System.out.println("[3D] Area for sphere: " + (4 * 3.14 * (side * side)));
    }

    @Override
    public void calculateVolume(int side) {
        System.out.println("[3D] Volume for sphere: " + ((4/3) * 3.14 * (side * side)));
    }
}
