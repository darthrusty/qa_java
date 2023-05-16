import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    List<String> animalPredatorFood = List.of("Животные", "Птицы", "Рыба");
    String  exceptionMessage = "Используйте допустимые значения пола животного - самец или самка";
    String  sex       = "Самец";
    int     kittenNum = 1;

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void testGetFoodEatMeat() throws Exception {
        Feline feline = new Feline();
        Lion   lion   = new Lion(sex, feline);
        assertEquals(animalPredatorFood, lion.getFood());
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(kittenNum);
        Assert.assertEquals(kittenNum, lion.getKittens());
    }

    @Test
    public void lionCheckException() {
        Exception exception = Assert.assertThrows(Exception.class,() -> new Lion("Неизвестно", feline));
        Assert.assertEquals(exception.getMessage(), exceptionMessage);
    }

}
