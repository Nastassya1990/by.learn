package lesson2;
//Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
public class NewMethod6 {
    public static void main(String[] args) {
        int [] array1 = new int[100];
        for (int i = 0; i < array1.length; i++){
            array1[i]=i + 1;
        }
        for (int i:array1
             ) {
            System.out.print(i + " ");

        }
    }

}
