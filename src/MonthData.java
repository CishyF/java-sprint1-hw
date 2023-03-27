import java.util.stream.IntStream;

public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.printf("%d день: %d\n", i + 1, days[i]);
        }
    }

    int sumStepsFromMonth() {
        return IntStream.of(days).sum();
    }

    int maxSteps() {
        return IntStream.of(days).max().orElse(0);
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0, maxSeries = 0;

        for (int stepsPerDay : days) {
            if (stepsPerDay >= goalByStepsPerDay) {
                currentSeries++;
                maxSeries = Math.max(maxSeries, currentSeries);
            } else
                currentSeries = 0;
        }

        return maxSeries;
    }
}
