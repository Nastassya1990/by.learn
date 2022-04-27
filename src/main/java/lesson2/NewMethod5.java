package lesson2;
//Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0

public class NewMethod5 {
    public static void main(String[] args) {

        int [] array1 = new int[] {1, 1, 0, 0, 1, 0};
        int [] array2 = new int[array1.length];
        for (int i=0; i<array1.length;i++){
            if (array1[i]==0){
                array2[i] = 1;
            }
            else array2[i]=0;
        }
        for (int n: array2
             ) {
            System.out.print(n);

        }
    }
}
