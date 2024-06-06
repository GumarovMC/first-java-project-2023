// Фигура
abstract class Figure {
    abstract double area();
}

// Квадрат
class Square extends Figure {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

// Круг
class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Треугольник
class Triangle extends Figure {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Главный класс
public class Main3 {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 6);

        System.out.println("Площадь квадрата: " + square.area());
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Площадь треугольника: " + triangle.area());
    }
}
