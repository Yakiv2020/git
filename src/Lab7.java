public class Lab7 {
    public static void main(String[] args) {
        int[] c = new int[]{-7,5,10,89,-52,-1,3,7,55,1,42,6,-38,-2,4};
        int dob = 1;
        int sum = 0;

        for(int i=0;i<c.length;i++) {
            if(c[i] > 0) {
                dob*=c[i];
            }
            if(c[i] < 0) {
                sum+=c[i];
            }
        }

        System.out.println("Добуток додатніх елементів: " + dob);
        System.out.println("Сума від'ємних елементів:" + sum);
    }
}
