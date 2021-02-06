import java.util.ArrayList;

public class Calculator {
    private ArrayList<Calculation> calculationList = new ArrayList<>();
    private double[] memory = new double[10];

    public double newCalculation(String calculation) {
        calculationList.add(new Calculation(calculation, this));
        return calculationList.get(calculationList.size()-1).getResult();
    }

    public double getCalculationResult(int index) {
        index = Math.abs(index);
        return calculationList.get(calculationList.size()-index).getResult();
    }

    public String getCalculationText(int index) {
        index = Math.abs(index);
        return calculationList.get(calculationList.size()-index).getCalculation();
    }

    public boolean setMemory(double number, int index) {
        index = Math.abs(index);
        if (index < memory.length) {
            memory[index] = number;
            return true;
        }
        return false;
    }

    public double getmemory(int index) {
        index = Math.abs(index);
        if (index < memory.length) {
            return memory[index];
        }
        System.out.println("invalid index");
        return -1;
    }
}
