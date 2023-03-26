import java.util.Scanner;

public class StepTracker {

    private final Scanner scanner;
    private final MonthData[] monthToData = new MonthData[12];

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
     }

     public void addNewNumberStepsPerDay() {
         System.out.print("Введите номер месяца (от 1 до 12 включительно): ");
         int month = scanner.nextInt() - 1;

         if (month < 0 || month > 11) {
             System.out.println("Месяц должен быть от 1 до 12 включительно!");
             return;
         }

         System.out.print("Введите день: ");
         int day = scanner.nextInt() - 1;

         if (day < 0 || day > 29) {
             System.out.println("Такого дня нет в выбранном месяце");
             return;
         }

         System.out.print("Введите количество шагов: ");
         int steps = scanner.nextInt();

         if (steps < 0) {
             System.out.println("Количество шагов не может быть отрицательным");
             return;
         }

         monthToData[month].days[day] += steps;
     }

}
