public class Critter {
    protected String name; // change to protected so children
                           // can have access to parent properties.
    private boolean isAlive;
    private int foodLevel;
    private int tiredness;
    private int levelOfFitness;

    public Critter(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void sleep() throws InterruptedException {
        System.out.println(name + " sleeps...");
        for (int i = 0 ; i<5; i++) {
            System.out.println("Zzzz...");
            Thread.sleep(1000); // 1000ms = 1s
        }
    }

    public void feed() {
        System.out.println(name + " is fed.");
    }

    public void feed(Food food) {
        System.out.println(name + " is being fed with " + food.toString());
    }

    // every time he exercises he gets fitter.
    public void exercise() {
        levelOfFitness++;
    }
    // methods that return the level of fitness.
    public int getLevelOfFitness(){
        return levelOfFitness;
    }
}

