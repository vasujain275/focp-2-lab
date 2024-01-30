package Practical03;

public class Question02 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int x = 3;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
