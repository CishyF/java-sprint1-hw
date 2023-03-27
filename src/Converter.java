public class Converter {

    public int convertToKm(int steps) {
        double stepToKm = 0.00075;
        return (int) (steps * stepToKm);
    }

    public int convertToKilocalories(int steps) {
        double stepToKilocalorie = 0.05;
        return (int) (steps * stepToKilocalorie);
    }
}
