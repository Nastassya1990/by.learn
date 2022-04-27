package lesson2;
//Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
// Замечание: ноль считаем положительным числом.

public class NewMethod3 {
    public static boolean check(int a){
        boolean b = a < 0;
        return b;

    }

    public static void main(String[] args) {
        System.out.println(check(-100));
    }
}


