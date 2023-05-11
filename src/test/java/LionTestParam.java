import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestParam {

    private final String sex;
    private final boolean haveMane;

    @Mock
    Feline feline;

    public LionTestParam(String sex, boolean haveMane) {
        this.sex      = sex;
        this.haveMane = haveMane;
    }

    @Parameterized.Parameters(name = "Проверка наличия гривы. Тестовые данные: {0} {1}")
    public static Object[][] testData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void checkHaveMane() {
        try {
        Lion lion = new Lion(sex, feline);
        assertEquals(haveMane, lion.doesHaveMane());
        } catch (Exception e) {
        }
    }

}
