import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        welcome();

        String input;
        while(true) {
            input = scanner.nextLine();
            if (input.equals("")) break;
            else if (input.equals("h")) {
                help();
            } else System.out.println(calculator.newCalculation(input));

        }
    }

    private static void welcome() {
        System.out.println("Welcome to my RPN calculator");
        System.out.println("h for help, and empty line to quit");
    }

    private static void help() {
        System.out.println("This is a RPN notation calculator, meaning the operations go after the number instead of between");
        System.out.println("So instead of 3+4 you have 3 4 +");
        System.out.println("https://en.wikipedia.org/wiki/Reverse_Polish_notation if you want to learn more");
        System.out.println("ans is the answer from your last calculation");
        System.out.println("25 0 st will store 25 too the 0th memory location, memory locations range from 0 to 9");
        System.out.println("0 mem will fetch whatever is stored on memory location 0");
        System.out.println("The default value for the memory locations is 0");
    }
}
