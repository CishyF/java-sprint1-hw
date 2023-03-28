import java.util.Scanner;

public class StepTracker {

    private final Scanner scanner;
    private final MonthData[] monthToData = new MonthData[12];
    private int goalByStepPerDay = 10000;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
     }

     public void changeStepGoal() {
         System.out.print("Введите новую цель: ");
         int newGoal = scanner.nextInt();

         if (newGoal < 1) {
             System.out.println("Ваша цель не может быть меньше или равна нулю!");
             return;
         }

        goalByStepPerDay = newGoal;
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
             System.out.println("Такого дня нет в выбранном месяце!");
             return;
         }

         System.out.print("Введите количество шагов: ");
         int steps = scanner.nextInt();

         if (steps < 0) {
             System.out.println("Количество шагов не может быть отрицательным!");
             return;
         }

         monthToData[month].days[day] = steps;
     }

     public void printStatistic() {
         System.out.print("Введите номер месяца (от 1 до 12 включительно): ");
         int month = scanner.nextInt() - 1;

         if (month < 0 || month > 11) {
             System.out.println("Месяц должен быть от 1 до 12 включительно!");
             return;
         }

         MonthData monthData = monthToData[month];
         Converter converter = new Converter();

         System.out.println("- Количество пройденных шагов по дням:");
         monthData.printDaysAndStepsFromMonth();

         System.out.println("- Общее количество шагов за месяц: " + monthData.sumStepsFromMonth());
         System.out.println("- Максимальное пройденное количество шагов в месяце: " + monthData.maxSteps());
         System.out.println("- Среднее количество шагов: " + (monthData.sumStepsFromMonth() / monthData.days.length));
         System.out.println("- Пройденная дистанция (в км): " + converter.convertToKm(
                                                                      monthData.sumStepsFromMonth()
                                                                  )
                           );
         System.out.println("- Количество сожжённых килокалорий: " + converter.convertToKilocalories(
                                                                      monthData.sumStepsFromMonth()
                                                                  )
                           );
         System.out.println("- Лучшая непрерывная серия выполнения цели: " + monthData.bestSeries(goalByStepPerDay));
     }

}
