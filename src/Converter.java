public class Converter {

    private static final double STEP_LENGTH_KILOMETERS = 0.00075;
    private static final double STEP_COST_KILOCALORIES = 0.05;

    public int convertToKm(int steps) {
        return (int) (steps * STEP_LENGTH_KILOMETERS);
    }

    public int convertToKilocalories(int steps) {
        return (int) (steps * STEP_COST_KILOCALORIES);
    }
}
