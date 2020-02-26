import java.util.*;

public class Workout {

    // Workout attributes
    private String date;
    private String type;
    private String block;
    private String notes;
    private ArrayList<Lift> lifts;

    // Getters and Setters
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBlock() {
        return block;
    }
    public void setBlock(String block) {
        this.block = block;
    }
    public ArrayList<Lift> getLifts() {
        return lifts;
    }
    public void setLifts(ArrayList<Lift> lifts) {
        this.lifts = lifts;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Show all non-null attributes
    public void show() {
        System.out.println("We are in the workout show() method.");
        if (this.date != null) System.out.println("Date: " + this.date);
        if (this.type != null) System.out.println("Type: " + this.type);
        if (this.block != null) System.out.println("Block: " + this.block);
        if (this.notes != null) System.out.println("Notes: " + this.notes);
        if (this.lifts.size() > 0) {
            for (int i = 0; i < this.lifts.size(); i++) {
                Lift curLift = this.lifts.get(i);
                curLift.show();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("In Workout.main()");
    }
}