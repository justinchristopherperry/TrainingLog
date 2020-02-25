import java.util.*;

public class Lift {

    static class Set {
        int load;
        int reps;
        Set(int load, int reps) {
            this.load = load;
            this.reps = reps;
        }
    }

    private String name;
    private String variation;
    private int intensity;
    private ArrayList<Set> sets = new ArrayList<Set>();
    private String notes;

    public void show() {
        System.out.println("In this Lift class, there is information about a certain lift within a workout.");
        if (this.sets.size() > 0) System.out.println("My first set: " + this.sets.get(0).load + "kgs for " + this.sets.get(0).reps + " reps.");
    }

    public static void main(String[] args) {
        Lift thisLift = new Lift();
        Set set1 = new Set(100,2);
        Set set2 = new Set(110,2);
        thisLift.sets.add(set1);
        thisLift.sets.add(set2);
        thisLift.show();
    }
}