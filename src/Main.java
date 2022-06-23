import java.util.*;

public class Main {
    public static Queue<Integer> floorTarget = new ArrayDeque<>();
    private static Scanner scanner = new Scanner(System.in);
    private static void getFloor() {
        int[] floor = new int[22];
        for (int i = 1; i <= floor.length; i++) {
            System.out.println(i + " этаж");
        }
    }

    public static void main(String[] args) {
        while (true) {
            getFloor();
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

            while (!floorTarget.isEmpty()) {

                System.out.println("Лифт проследовал по следующим этажам:");
                int waitDoorsInSeconds = 10;
                int waitMoveInSeconds = 5;
                int totalSeconds = 0;

                for (int startLift : floorTarget) {
                    totalSeconds += waitDoorsInSeconds + waitMoveInSeconds;
                    System.out.print(" -> " + "Этаж " + startLift);
                }
                System.out.println();
                System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
                break;
            }
        }
    }
}

