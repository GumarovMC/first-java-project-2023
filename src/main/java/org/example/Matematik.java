package org.example;

public class Matematik {
    String name;
    String surname;
    private int speed; // скорость вычисления математиком 1 - 100
    private int educationLevel; // образование 0 - 10

    public Matematik(int speed, int educationLevel) {
        if (speed < 1 || speed > 100) {
            throw new RuntimeException("Скорость должна быть между 1 - 100, введено значение: " + speed);
        } else {
            this.speed = speed;
        }
        if (educationLevel < 0 || educationLevel > 10) {
            throw new RuntimeException("Уровень образования должен быть между 0 - 10, введено значение: " + educationLevel);
        } else {
            this.educationLevel = educationLevel;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getEducationLevel() {
        return educationLevel;
    }

    public double calculateSquareSurface(double side) throws Exception {
        if (educationLevel >= 10) {
            System.err.println("Я отказываюсь вычислять что-либо.");
            throw new Exception("Математик отказывается вычислять что-либо.");
        } else if (educationLevel >= 5) {
            // Площадь шара
            // Формула: 4 * pi * радиус^2
            if (side <= 0) {
                throw new IllegalArgumentException("Радиус шара не может быть отрицательным");
            }
            Thread.sleep(100_000 / speed);
            return 4 * Math.PI * side * side;
        } else if (educationLevel >= 4) {
            // Площадь поверхности призмы
            // Формула для прямоугольной призмы: 2 * (ширина * длина + высота * длина + высота * ширина)
            if (side <= 0) {
                throw new IllegalArgumentException("Сторона призмы не может быть отрицательной");
            }
            Thread.sleep(100_000 / speed);
            return 2 * (side * side + side * side + side * side);
        } else if (educationLevel >= 3) {
            // Площадь круга
            // Формула: pi * радиус^2
            if (side <= 0) {
                throw new IllegalArgumentException("Радиус круга не может быть отрицательным");
            }
            Thread.sleep(100_000 / speed);
            return Math.PI * side * side;
        } else if (educationLevel == 2) {
            if (Math.random() > 0.6) { // 40% вероятность ошибки
                throw new Exception("Ошибка при вычислении площади квадрата");
            } else {
                Thread.sleep(200_000 / speed);
                return side * side;
            }
        } else if (educationLevel == 1) {
            if (Math.random() > 0.4) { // 60% вероятность ошибки
                throw new Exception("Ошибка при вычислении площади квадрата");
            } else {
                Thread.sleep(200_000 / speed);
                return side * side;
            }
        } else {
            System.err.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }
}
