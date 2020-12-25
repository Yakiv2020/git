public class Lab4 {
    public static void main(String[] args) {
        double a = 3.45;
        double b = 1.62;
        double y;

        double biggest_y = 0;
        double biggest_x = 0;
        double smaller_y = 0;
        double smaller_x = 0;
        int iterations = 0;

        for(double x = 0.1; x <= 3.1; x+=0.15) {
            iterations++;
            y = (1+Math.pow(a, x))/((b-x)*Math.pow(Math.sin(x), 3.0));
            System.out.printf("x = %.2f \t y = %.3f \n", x, y);

            if(iterations==1) {
                biggest_y = y;
                biggest_x = x;
                smaller_y = y;
                smaller_x = x;
            } else {
                if(y > biggest_y) {
                    biggest_y = y;
                    biggest_x = x;
                }
                if(y < smaller_y) {
                    smaller_y = y;
                    smaller_x = x;
                }
            }
        }

        System.out.printf("Найменше значення y = %.3f, відповідне йому значення х = %.2f \n", smaller_y, smaller_x);
        System.out.printf("Найбільше значення y = %.3f, відповідне йому значення х = %.2f \n", biggest_y, biggest_x);
    }
}
