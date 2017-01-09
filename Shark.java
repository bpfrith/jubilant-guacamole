public class Shark{
  private String name;
  private Surfer[] belly;

  public Shark(String name){
    this.name = name;
    this.belly = new Surfer[5];
  }
  public String getName(){
    return this.name;
  }

  public void eat(Surfer food) {
    if (isBellyFull()) return;
    int nextIndex = foodCount();
    belly[nextIndex] = food;
  }

  public int foodCount() {
    int count = 0;
    for(Surfer surfer : belly) {
      if(surfer != null) {
        count += 1;
      }
    }
    return count;
  }

  public boolean isBellyFull(){
    return foodCount() == belly.length;
  }

  public void hungryAgain(){
    // this.belly = new Surfer[5];
    for(int i = 0; i < belly.length; i ++) {
      belly[i] = null;
    }
  }
}
