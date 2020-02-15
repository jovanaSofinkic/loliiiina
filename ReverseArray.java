package academy.learnprogramming;

import java.util.Arrays;

public class Main {
    public static void reverse(int[] array){
            for(int i = 0; i < array.length / 2; i++){
                int aux = array[i];
                array[i] = array[(array.length - 1) - i];
                array[(array.length - 1) - i] = aux;
            }
    }
    public static void main(String[] args) {

	    int[] array = {1,2,3,4,5,6};
        System.out.println("n = 2k");
        System.out.println("Before reversing: " + Arrays.toString(array));
        reverse(array);
        System.out.println("After reversing: " + Arrays.toString(array));
        System.out.println();
        array = new int[] {1,2,3,4,5};
        System.out.println("n = 2k - 1");
        System.out.println("Before reversing: " + Arrays.toString(array));
        reverse(array);
        System.out.println("After reversing: " + Arrays.toString(array));
    }
}
