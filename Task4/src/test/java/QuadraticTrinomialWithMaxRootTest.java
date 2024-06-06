import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticTrinomialWithMaxRootTest {

    @Test
    public void testGetMaxRootNoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, 2, 3);
        QuadraticTrinomialWithMaxRoot trinomial = new QuadraticTrinomialWithMaxRoot(equation);

        assertThrows(IllegalArgumentException.class, () -> trinomial.getMaxRoot());
    }

    @Test
    public void testGetMaxRootOneRealRoot() {
        QuadraticEquation equation = new QuadraticEquation(1, 2, 1);
        QuadraticTrinomialWithMaxRoot trinomial = new QuadraticTrinomialWithMaxRoot(equation);

        assertEquals(-1, trinomial.getMaxRoot());
    }

    @Test
    public void testGetMaxRootTwoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, -2, 1);
        QuadraticTrinomialWithMaxRoot trinomial = new QuadraticTrinomialWithMaxRoot(equation);

        assertEquals(1, trinomial.getMaxRoot());
    }
}
