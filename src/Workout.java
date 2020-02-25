import java.util.*;

public class Workout {

    private String date;
    private String type;
    private String block;
    private ArrayList<Lift> lifts;
    private String notes;

    public void show() {
        System.out.println("In this Workout class, there is information about a specific workout, including lifts.");
    }

    public static void main(String[] args) {
        Workout thisWorkout = new Workout();
        thisWorkout.show();
    }
}