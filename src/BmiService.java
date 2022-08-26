public class BmiService {
    public double calculate(double mass, double height) {
        double i;
        i = mass / (height * height);
        return i;
    }

}
