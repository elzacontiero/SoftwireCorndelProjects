public class Bread implements Food {
    public void applyFood(Critter creature) {
        creature.feed(this);
    }
}
