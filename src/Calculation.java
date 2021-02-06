import java.util.Stack;

public class Calculation {
    private final String calculation;
    private final double result;
    private final Calculator calculator;

    public Calculation(String calculation, Calculator calculator){
        this.calculation = calculation;
        this.calculator = calculator;
        result = calculateResult();
    }

    private double calculateResult(){
        String[] calculationParts = calculation.split(" ");
        Stack<Double> stack = new Stack<>();

        for(String ch : calculationParts){
            switch (ch){
                case "+" -> {
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    stack.push(num2+num1);
                }
                case "-" -> {
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    stack.push(num2-num1);
                }
                case "*" -> {
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    stack.push(num2*num1);
                }
                case "/" -> {
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    stack.push(num2/num1);
                }
                case "ans" -> stack.push(calculator.getCalculationResult(1));
                case "st" -> {
                    int index = stack.pop().intValue();
                    double mem = stack.pop();
                    System.out.println(calculator.setMemory(mem, index));
                }
                case "mem" -> {
                    int mem = stack.pop().intValue();
                    stack.push(calculator.getmemory(mem));
                }

                default -> {
                    try {
                        stack.push(Double.parseDouble(ch));
                    } catch (NumberFormatException e) {
                        System.out.println("your formatting is of");
                    }
                }
            }
        }
        if (stack.empty()){
            return 0;
        }
        return stack.pop();
    }

    public double getResult() {
        return result;
    }

    public String getCalculation() {
        return calculation;
    }
}
