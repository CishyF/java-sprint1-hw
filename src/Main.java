import java.util.Scanner;

public class Main {

    //private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 0:
                    System.out.println("0");
                    scanner.close();
                    return;
                default:
                    System.out.println("Вы ввели несуществующую команду, попробуйте снова");
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
    }
}
