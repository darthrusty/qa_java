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
    String exceptionMessage = "Используйте допустимые значения пола животного - самец или самка";
    String  sex       = "Самец";
    int     kittenNum = 1;
    boolean haveMane  = true;

    @Test
    public void testGetFood() {
        try {
            Lion lion = new Lion(sex, feline);
            lion.getFood();
            Mockito.verify(feline).getFood("Хищник");
        } catch (Exception e) {
        }
    }

    @Test
    public void testGetFoodEatMeat() {
        try {
            Feline feline = new Feline();
            Lion   lion   = new Lion(sex, feline);
            assertEquals(animalPredatorFood, lion.getFood());
        } catch (Exception e) {
        }
    }

    @Test
    public void testGetKittens() {
        try {
            Feline feline = new Feline();
            Lion   lion   = new Lion(sex, feline);
            Assert.assertEquals(kittenNum, lion.getKittens());;
        } catch (Exception e) {
        }
    }

    @Test
    public void lionCheckException() {
        Exception exception = Assert.assertThrows(Exception.class,() -> new Lion("Неизвестно", feline));
        Assert.assertEquals(exception.getMessage(), exceptionMessage);
    }

}
