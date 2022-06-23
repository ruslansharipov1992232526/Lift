import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> floorTarget = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int previousFloor = -1;

        while (2 * 2 == 4) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int input = scanner.nextInt();

            if (input < 0 || input > 22) {
                System.out.println("Такого этажа нет");
            } else {
                floorTarget.add(input);
                if (input == 0) {
                    floorTarget.remove(0);
                    break;
                }
            }
            previousFloor = input;
        }

        System.out.println("Лифт проследовал по следующим этажам:");

        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        previousFloor = -1;


        while (!floorTarget.isEmpty()) {
            System.out.printf("этаж %d ", floorTarget.peek());

            if (floorTarget.peek() != 0) {
                System.out.print("-> ");
            }

            if (previousFloor != -1) {
                totalSeconds += Math.abs(floorTarget.peek() - previousFloor) * waitMoveInSeconds;
                totalSeconds += waitDoorsInSeconds;

            }
            previousFloor = floorTarget.peek();
            floorTarget.poll();
        }
        System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
    }
}

