import exercises.HierarchyPerson.Person;
import exercises.HierarchyShape.*;
import exercises.Parallelogram;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println("\n---------------------------\n");

        Person Ex_1 = new Person("Milk Str. 15");

        System.out.println(Ex_1);


        // Exercise 2
        System.out.println("\n---------------------------\n");

        Parallelogram Ex_2 = new Parallelogram();

        System.out.println("Perimeter: " +  Ex_2.calculatePerimeter(4, 2));
        System.out.println("Perimeter: " + Ex_2.calculatePerimeter(6));

        System.out.println("Area: " + Ex_2.calculateArea(4, 2));
        System.out.println("Area: " + Ex_2.calculateArea(6));

        // Exercise 3
        System.out.println("\n---------------------------\n");

        Circle Ex_3_Circle = new Circle();
        Ex_3_Circle.calculateArea(5);

        Square Ex_3_Square = new Square();
        Ex_3_Square.calculateArea(5);

        System.out.println();

        Sphere Ex_3_Sphere = new Sphere();
        Ex_3_Sphere.calculateArea(5);
        Ex_3_Sphere.calculateVolume(5);

        Cube Ex_3_Cube = new Cube();
        Ex_3_Cube.calculateArea(5);
        Ex_3_Cube.calculateVolume(5);
    }
}