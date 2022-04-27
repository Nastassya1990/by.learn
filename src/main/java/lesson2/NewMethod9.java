package lesson2;
// Написать метод, принимающий на вход два аргумента:
// len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

public class NewMethod9 {
    public static void main(String[] args) {
        printArray(arrayCreate(100,1));
    }
    public static int[] arrayCreate(int len, int initialValue){
        int[]array = new int[len];
        for (int i=0; i<array.length; i++){
            array[i]=initialValue;
        }
        return array;
    }

    public static void printArray(int [] array){
        for (int n: array
             ) {
            System.out.print(n + " ");

        }
        System.out.println();
    }

}
