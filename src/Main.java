import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        StepTracker tracker = new StepTracker(scanner);

        while (true) {
            printMenu();

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    tracker.addNewNumberStepsPerDay();
                    System.out.println();
                    break;
                case 2:
                    tracker.changeStepGoal();
                    System.out.println();
                    break;
                case 3:
                    tracker.printStatistic();
                    System.out.println();
                    break;
                case 0:
                    scanner.close();
                    return;
                default:
                    System.out.println("Вы ввели несуществующую команду, попробуйте снова");
                    System.out.println();
            }
        }
    }

    private static void printMenu() {
        String menu = "Что вы хотите сделать?\n" +
                      "1 - Ввести количество шагов за определённый день;\n" +
                      "2 - Изменить цель по количеству шагов в день;\n" +
                      "3 - Напечатать статистику за определённый месяц;\n" +
                      "0 - Выход.";

        System.out.println(menu);
        System.out.println();
    }
}
