sealed interface ShapeHackToVerifyInheritance permits Circle, Rectangle, Triangle {
    double area();
}

class Circle implements ShapeHackToVerifyInheritance {
    public double area() {
        return 0;
    }
}

final class Rectangle implements ShapeHackToVerifyInheritance {
    public double area() {
        return 0;
    }
}

final class Triangle implements ShapeHackToVerifyInheritance {
    public double area() {
        return 0;
    }
}

final class Square extends Circle {
    public double area() {
        return 0;
    }
}
