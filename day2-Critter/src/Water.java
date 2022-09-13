public class Water implements Food{
    public void applyFood(Critter creature) { // subclass Water has body {
        creature.feed(this); // this is the current instance of w in main
                                  // hey you Water when you apply food to this creature feed creature with yourself.
    }
}
