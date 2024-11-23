/**
 *
 * Shape Hierarchy Pattern Matching Exercise
 *
 * Use modern pattern matching to implement a shape analysis system.
 * This exercise demonstrates nested patterns, guards, and record patterns.
 *
 * Tasks:
 * 1. Implement analyzeShape using pattern matching switch with guards
 * 2. Implement combineShapes using nested pattern matching
 * 3. Handle validation and error cases appropriately
 */
public class ShapeAnalyzer {
    sealed interface Shape permits Rectangle, Circle, Composite {}

    record Rectangle(double width, double height) implements Shape {}

    record Circle(double radius) implements Shape {}

    record Composite(Shape primary, Shape secondary, String operation) implements Shape {}

    // TODO: Implement using pattern matching switch with guards
    public static String analyzeShape(Shape shape) {
        // Return analysis string based on these rules:
        // - Rectangle: "Square" if width == height, "Rectangle (w × h)" otherwise
        // - Circle: "Small Circle" if radius < 5, "Large Circle" otherwise
        // - Composite: Describe combination based on operation ("joined", "overlapped")
        //   Include analysis of both shapes
        throw new UnsupportedOperationException("Implement analyzeShape");
    }

    // TODO: Implement using nested pattern matching
    public static double calculateArea(Shape shape) {
        // Calculate total area:
        // - Rectangle: width * height
        // - Circle: π * radius^2
        // - Composite:
        //   - "joined": sum of both areas
        //   - "overlapped": smaller area
        throw new UnsupportedOperationException("Implement calculateArea");
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                          new Rectangle(5, 5),
                          new Circle(3),
                          new Composite(
                                  new Rectangle(4, 6),
                                  new Circle(2),
                                  "joined"
                          ),
                          new Composite(
                                  new Circle(5),
                                  new Circle(3),
                                  "overlapped"
                          )
        };

        for (Shape shape : shapes) {
            System.out.println("Analysis: " + analyzeShape(shape));
            System.out.println("Area: " + calculateArea(shape));
            System.out.println();
        }
    }

}
