package lesson2;
//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

public class NewMethod2 {
    public static int check(int a){

        if (a >=0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
    }
}
