import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by lavanya on 6/6/17.
 */
public class TestOddOrEven {
    @Test
    public void shouldreturnFalseForEven() {
        OddorEven oddorEven = new OddorEven();
        assertTrue(oddorEven.isOdd(3));
    }

}
