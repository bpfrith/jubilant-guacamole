import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SharkTest{
  Shark shark;
  Surfer dinner;
  Swimmer snack;

  @Before 
  public void before() {
    shark = new Shark("Jaws");
    dinner = new Surfer();
    snack = new Swimmer();
  }

  @Test
  public void hasName(){
    assertEquals("Jaws", shark.getName()); 
  }

  @Test
  public void startsWithNoFood(){
    assertEquals(0, shark.foodCount());
  }

  @Test
  public void canSatiateHunger(){
    shark.eat(dinner);
    assertEquals(1, shark.foodCount());
  }

  @Test
  public void canEatSwimmer(){
    shark.eat(snack);
    assertEquals(1, shark.foodCount());
  }

  @Test
  public void shouldDigestFoodAfterSleeping(){
    shark.eat(dinner);
    shark.hungryAgain();
    assertEquals(0, shark.foodCount());
  }
}
