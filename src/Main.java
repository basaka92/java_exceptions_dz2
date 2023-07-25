import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вы ввели: " + task1());
        task4();
    }
    public static float task1() {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        float result;
        System.out.println("Задача 1.");
        while (check) {
            System.out.println("Введите дробное число:");
            if (sc.hasNextFloat()) {
                result = sc.nextFloat();
                check = false;
                return result;
            }else{
                System.out.println("Вы ввели неверное значение!");
                sc.next();
            }
        }
        return 0;
    }

    public static void task4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 4.");
        System.out.println("Введите строку:");
        String line;
        line = sc.nextLine();
        if (line.isEmpty()){
            throw new RuntimeException("Нельзя вводить пустые строки!");
        }
    }


}