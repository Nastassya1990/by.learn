package lesson2;
//Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

public class NewMethod4 {
    public static void print(String s, int a){
        for (int i=0; i < a; i++){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        print("java courses", 10);
    }
}
