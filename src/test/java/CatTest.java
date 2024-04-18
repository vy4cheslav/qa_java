import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        String sound = "Мяу";
        assertEquals(sound, cat.getSound());
    }
    @Test
    public void getFoodReturnFelineList() throws Exception {
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        Feline feline1 = new Feline();
        Cat cat = new Cat(feline1);
        assertEquals(felineFood, cat.getFood());
    }
}
