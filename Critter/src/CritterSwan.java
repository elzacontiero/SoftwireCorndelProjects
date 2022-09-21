public class CritterSwan extends Critter {
    public CritterSwan(String name) {
        super(name); // this calls the Critter constructor, as it requires name
    }

    // 4.
    // Different critters should make different noises when they
    // feed/sleep/exercise but the game mechanics should stay the same.
    public void sleep() throws InterruptedException {
        System.out.println(name + " sleeps...");
        for (int i = 0; i < 5; i++) {
            System.out.println("glock, glock");
            Thread.sleep(1000); // 1000ms = 1s
        }
    }

    public void feed() {
        System.out.println(name + " yummy..yummy..");
    }

    public void exercise() {
        System.out.println(name + " says: huff huff...");
        super.exercise(); // call superclass exercise().
    }

}