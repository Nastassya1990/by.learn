package lesson2;
//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class NewMethod7 {
    public static void main(String[] args) {
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<array.length; i++){
            if (array[i] < 6){
                array[i] *= 2;
            }
            }
        for (int n:array
        ) {
            System.out.print(n + " ");
    }
    }
}
