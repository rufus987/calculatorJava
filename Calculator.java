import java.util.Scanner;
/*
* Да, было бы полезно разбить программу на классы и методы.. наверное
*
* */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean goCalculator = true;
        float operand1 = scanner.nextFloat();


        while (goCalculator) {
            char operation = scanner.next().charAt(0);
            float operand2 = scanner.nextFloat();
            float result = 0;
            if (operand2 == 0 & operation == '/') {
                System.out.println("Делить на ноль нельзя!");
                break;
            } else {
                 switch (operation) {
                     case '+' -> result = operand1 + operand2;
                     case '-' -> result = operand1 - operand2;
                     case '*' -> result = operand1 * operand2;
                     case '/' -> result = operand1 / operand2;
                     default -> {
                         System.out.println("Ошибка программы");
                         System.out.println(operand1);
                         continue;
                     }
                 }
                System.out.println(result);

                System.out.println("Продолжить?.. Нажмите любую клавишу или \n s чтобы завершить работу калькулятора \n C(англ) чтобы начать сначала");
                char check = scanner.next().charAt(0);

                if (check == 's'){
                    System.out.println("Прерывание..");
                    goCalculator = false;
                    break;
                } else if (check == 'C'){
                    operand1 = 0;
                    System.out.println(operand1);
                    continue;
                }
                operand1 = result;
                System.out.println(operand1);
            }
        }
        scanner.close();
    }
}
