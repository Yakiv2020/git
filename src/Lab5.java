public class Lab5 {
    public static void main(String[] args) {
        double epsilon = 0.00001;
        double y;
        double x = 2.6;
        double t;

        int iteration = 0;
        do {
            y = Math.cbrt(Math.exp(x) + 5.5);
            t = Math.abs(x-y);
            x = y;
            iteration++;
            System.out.println(y);
        } while(t > epsilon);

        System.out.println("----------");
        System.out.println("Кількість ітерацій: " + iteration);
        System.out.println("Корінь: " + x);
    }
}
