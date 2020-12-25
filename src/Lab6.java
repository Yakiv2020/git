import java.util.Arrays;

public class Lab6 {
    public static void main(String[] args) {
        int[] x = new int[]{-4,1,3,10,-9,0,2,4,-4,-6,-7,8,7,0,-1};
        int[] y = new int[] {5,5,10,1,-5,-1,-1,5,8,-2,0,0,3,-3,1};
        int size_for_first_array = 0;
        int size_for_second_array = 0;

        for(int i = 0; i < x.length; i++) {
            if(x[i] > 0 && y[i] > 0) size_for_first_array++;
            if(x[i] > 0 && y[i] < 0) size_for_second_array++;
        }

        int[] ord_in_first_quart = new int[size_for_first_array];
        int[] abs_in_fourth_quart = new int[size_for_second_array];

        for(int i = 0; i < x.length; i++) {
            if(x[i] > 0 && y[i] > 0) ord_in_first_quart[--size_for_first_array] = y[i];
            if(x[i] > 0 && y[i] < 0) abs_in_fourth_quart[--size_for_second_array] = x[i];
        }

        System.out.println("Ординати точок, які знаходяться в I чверті: " + Arrays.toString(ord_in_first_quart) + ". Кількість таких точок: " + ord_in_first_quart.length);
        System.out.println("Абсциси точок, які знаходяться в IV чверті: " + Arrays.toString(abs_in_fourth_quart) + ". Кількість таких точок: " + abs_in_fourth_quart.length);
    }
}
