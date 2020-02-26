import java.util.*;

public class Lift {

    //Lift attributes
    private String name;
    private String variation;
    private int intensity;
    private String notes;
    private ArrayList<Set> sets = new ArrayList<Set>();

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVariation() {
        return variation;
    }
    public void setVariation(String variation) {
        this.variation = variation;
    }
    public int getIntensity() {
        return intensity;
    }
    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
    public ArrayList<Set> getSets() {
        return sets;
    }
    public void setSets(ArrayList<Set> sets) {
        this.sets = sets;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    //Show all non-null Lift attributes
    public void show() {
        System.out.println("We are in the Lift.show() method.");
        if (this.name != null) System.out.println("Name: " + this.name);
        if (this.variation != null) System.out.println("Variation: " + this.variation);
        if (this.intensity != 0) System.out.println("Intensity: " + this.intensity);
        if (this.notes != null) System.out.println("Notes: " + this.notes);
        if (this.sets.size() > 0) {
            for (int i = 0; i < this.sets.size(); i++) {
                Set curSet = this.sets.get(i);
                curSet.show();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("In Lift.main().");
    }
}