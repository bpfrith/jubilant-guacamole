import java.util.*;

public class Shark{
  private String name;
  private ArrayList<Edible> belly;

  public Shark(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();
  }
  public String getName(){
    return this.name;
  }

  public void eat(Edible food) {
    belly.add(food);
  }

  public int foodCount() {
    return belly.size();
  }

  public Edible hungryAgain(){
    if (foodCount() > 0){
        return belly.remove(0);
      }
    return null;
  }
}
