import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        float[] two = {1.57f, 7.654f, 9.986f};
        int[] three = {3, 2, 1};
        System.out.println("Задание 2");
        for (int i = 0; i < one.length; i++) {
            if (i < one.length - 1) {
                System.out.print(one[i] + ", ");
            } else {
                System.out.print(one[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            if (i < two.length - 1) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < three.length; i++) {
            if (i < three.length - 1) {
                System.out.print(three[i] + ", ");
            } else {
                System.out.print(three[i]);
            }
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = one.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(one[i] + ", ");
            } else {
                System.out.print(one[i]);
            }
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i]);
            }
        }
        System.out.println();
        for (int i = three.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(three[i] + ", ");
            } else {
                System.out.print(three[i]);
            }

        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0){
                one[i] += 1;
            }
        }
        System.out.print(Arrays.toString(one));
    }
}