public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // Масса тела, кг
        double mass = 90;
        // Рост, м
        double height = 1.8;
        double bmi = service.calculate(mass, height);

        System.out.println("Индекс массы тела = " + bmi);
    }
}