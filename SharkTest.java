import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SharkTest{
  Shark shark;
  Surfer dinner;

  @Before 
  public void before() {
    shark = new Shark("Jaws");
    dinner = new Surfer();
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
  public void canGetFull(){
    for(int i = 0; i < 10; i++){
      shark.eat(dinner);
    }
    assertEquals(5, shark.foodCount());
  }

  @Test
  public void getsFullAfter5Fish(){
    for(int i = 0; i<5; i++){
      shark.eat(dinner);
    }
    assertEquals(5, shark.foodCount());
  }

  @Test
  public void shouldDigestFoodAfterSleeping(){
    shark.eat(dinner);
    shark.hungryAgain();
    assertEquals(0, shark.foodCount());
  }
}
