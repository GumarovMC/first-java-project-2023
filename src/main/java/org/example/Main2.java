import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main2 {
    private String[] array;
    private int size;
    private final int initialCapacity;

    public Main2(int initialCapacity) {
        this.array = new String[initialCapacity];
        this.size = 0;
        this.initialCapacity = initialCapacity;
    }

    public void add(String element) {
        if (size == initialCapacity) {
            System.out.println("Массиву не хватает места для добавления элемента: " + element);
            return;
        }
        array[size++] = element;
        Arrays.sort(array, 0, size, Comparator.comparingInt(String::length));
    }

    public int getMaxByLength() {
        if (size == 0) {
            System.out.println("Массив пустой");
            return 0;
        }
        return array[size - 1].length();
    }

    public double getAverageLength() {
        if (size == 0) {
            return 0.0;
        }
        int totalLength = 0;
        for (int i = 0; i < size; i++) {
            totalLength += array[i].length();
        }
        return (double) totalLength / size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальную вместимость массива строк: ");
        int initialCapacity;

        try {
            initialCapacity = scanner.nextInt();
            scanner.nextLine(); // Поглощение символа новой строки
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод. Пожалуйста, введите действительное целое число.");
            return;
        }

        Main2 stringArray = new Main2(initialCapacity);

        System.out.println("Введите строки (введите 'done', чтобы завершить): ");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("done")) {
            stringArray.add(input);
        }

        System.out.println("Максимальная длина элемента: " + stringArray.getMaxByLength());
        System.out.println("Средняя длина: " + stringArray.getAverageLength());
    }
}
