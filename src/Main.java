import java.util.*;

public class Main {
    public static Queue<Integer> floorTarget = new ArrayDeque<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int previousFloor = -1;
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int input = scanner.nextInt();

            if (input < 0 || input > 22) {
                System.out.println("Такого этажа нет");
            } else {
                floorTarget.add(input);
                if (input == 0) {
                    floorTarget.remove(0);
                }
            }

            System.out.println("Лифт проследовал по следующим этажам:");

            int waitDoorsInSeconds = 10;
            int waitMoveInSeconds = 5;
            int totalSeconds = 0;

            while (input == 0) {
                for (int startLift : floorTarget) {
                    System.out.print(" -> " + "Этаж " + startLift);
                }
                System.out.println();
                System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
                return;
            }
        }
    }
}

