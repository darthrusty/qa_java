import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    private final Feline feline = new Feline();

    List<String> animalPredatorFood = List.of("Животные", "Птицы", "Рыба");
    String felineFamily = "Кошачьи";
    int    kittenNum    = 1;
    int    kittensNum   = 7;

    @Test
    public void testEatMeat() {
        try {
            Assert.assertEquals(animalPredatorFood, feline.eatMeat());
        } catch (Exception e) {
            System.out.printf("Exception");
        }
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals(felineFamily, feline.getFamily());
    }

    @Test
    public void testGetKitten() {
        Assert.assertEquals(kittenNum, feline.getKittens());;
    }

    @Test
    public void testGetKittens() {
        Assert.assertEquals(kittensNum, feline.getKittens(kittensNum));
    }

}
