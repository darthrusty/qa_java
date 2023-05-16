import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    List<String> animalPredatorFood = List.of("Животные", "Птицы", "Рыба");
    String catSound = "Мяу";

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        assertEquals(catSound, cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void testGetFoodEatMeat() throws Exception {
        Feline feline = new Feline();
        Cat    cat    = new Cat(feline);
        assertEquals(animalPredatorFood, cat.getFood());
    }

}
