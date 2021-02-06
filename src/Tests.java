import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    Calculator calculator = new Calculator();

    @Test
    public void three_minus_three() {
        assertEquals(-1, calculator.newCalculation("3 4 -"));
    }

    @Test
    public void three_plus_three() {
        assertEquals(6, calculator.newCalculation("3 3 +"));
    }

    @Test
    public void multiplication() {
        assertEquals(15, calculator.newCalculation("3 5 *"));
    }

    @Test
    public void division() {
        assertEquals(5, calculator.newCalculation("25 5 /"));
    }

    @Test
    public void orderOfOperations() {
        assertEquals(5, calculator.newCalculation("4 3 - 5 *"));
    }

    @Test
    public void memory(){
        calculator.setMemory(3, 0);
        assertEquals(3, calculator.getmemory(0));
        assertEquals(1, calculator.newCalculation("4 0 mem -"));
    }

    @Test
    public void ans() {
        calculator.newCalculation("3 2 -");
        assertEquals(3, calculator.newCalculation("ans 2 +"));
    }
}
