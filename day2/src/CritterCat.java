public class CritterCat extends Critter {
    public CritterCat(String name) {
        super(name); // this calls the Critter constructor, as it requires name
    }

    public void sleep() throws InterruptedException {
        System.out.println(name + " sleeps...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Purrr...");
            Thread.sleep(1000); // 1000ms = 1s
        }
    }

    public void feed() {
        System.out.println(name + " nom...nom...");
    }

    public void exercise() {
        System.out.println(name + " meow...meow ... ");
        super.exercise(); // call superclass exercise().
    }
}
