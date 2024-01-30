package Practical03;

public class Question05 {
    public static void main(String[] args) {
        int[] array = new int[6];
        int n = 6;
        int j = 0;
        for (int i = 1; i <= n; i += 2) {
            array[j] = i;
            j++;
        }
        for (int i = n; i >= 1; i -= 2) {
            array[j] = i;
            j++;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
