import java.util.Scanner;

public class CritterMain {
    public static void main(String[] args) {
        // Ask user which critter to play with
        Scanner scan = new Scanner(System.in);
        System.out.println("Which critter would you like to play with? " +
                "Enter 1 for CritterSwan or 2 for CritterCat.");
        String critterType = scan.nextLine();

        Critter critter; // create variable critter first as it will be assigned later in line 13 or 16.
        if (critterType.equals("1")) {
            critter = new CritterSwan("Timmy"); // take constructor and pass Timmy to it and assign the
                                                      // newly created object to critter.
        }
        else if (critterType.equals("2")) {
            critter = new CritterCat("Baileys");

        } else {
            System.out.println("Invalid option");
            return;
        }
        // give water to that critter
        Water w = new Water();
        w.applyFood(critter);

        Bread b = new Bread();
        b.applyFood(critter);
    }







    /*
    This is just to check if Critter is working:
        Critter c = new Critter("Joe");
        boolean isAlive = c.isAlive();
        if (isAlive) {
            System.out.println("The critter is alive");
        } else {
            System.out.println("The critter is dead");
        }
    }
     */
}
