import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckerTriangleTest {
    @Test
    public void shouldCheckerTriangle(){
        Assertions.assertTrue(CheckerTriangle.checker(10,10,10));
    }
}
