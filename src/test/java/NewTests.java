import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewTests
{

    @Test
    void lambdaExpressions() {
        assertTrue(Stream.of(1, 2, 3)
                .mapToInt(i -> 2 * i)
                .sum() > 11, () -> "Sum should be greater than 11");
    }
}
