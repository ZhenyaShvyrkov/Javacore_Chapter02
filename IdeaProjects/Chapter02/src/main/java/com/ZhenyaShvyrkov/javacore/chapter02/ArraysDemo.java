import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = -3 * i;
        }
        System.out.println("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.println("Массив после вызова метода fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.println("Массив после повторной сортировки: ");
        display(array);

        System.out.print("Значение -9 находится на позиции: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);


    }
    public static void display(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
