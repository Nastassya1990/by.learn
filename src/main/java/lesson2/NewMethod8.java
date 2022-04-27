package lesson2;
// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];

public class NewMethod8 {
    public static void main(String[] args) {
        int[][] array1 = new int[8][8];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                        if (i == j || j==(array1.length-1)-i)
                            array1[i][j] = 1;
                        else {
                            array1[i][j]=0;
                        }
                        System.out.print(array1[i][j]);
                    }
                    System.out.println();
                }


            }
        }
