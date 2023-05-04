public class BmiService {
    public int calculate(int weightInKg, double heightInMeters) {
        double bmi = weightInKg / Math.pow(heightInMeters, 2);
        return (int) bmi;
    }
}
