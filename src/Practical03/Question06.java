package Practical03;

public class Question06 {
    public static void main(String[] args) {
        int[] array = { 9, 3, 6, 12, 4, 32 };
        for (int i = 0; i < array.length - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
