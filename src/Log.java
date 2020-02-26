import java.util.ArrayList;

public class Log {

    public static Workout getWorkout(){

        //Create new workout object
        Workout newWorkout = new Workout();

        //Set example metadata
        newWorkout.setDate("02-25-19");
        newWorkout.setType("Weightlifting");
        newWorkout.setBlock("Recovery");
        newWorkout.setNotes("Light and sharp workout at Woodward Crossfit, programmed by Cari and coached by Billy.");

        //Instantiate array of example lifts
        ArrayList<Lift> newLifts = new ArrayList<Lift>();
        
        //Get an example lift
        Lift newLift = getLift();
        newLifts.add(newLift);
        newWorkout.setLifts(newLifts);

        return newWorkout;
    }
    
    public static Lift getLift() {

        //Creae new Lift object
        Lift newLift = new Lift();

        //Set example metadata
        newLift.setName("Snatch");
        newLift.setVariation("from hip");
        newLift.setIntensity(65);
        newLift.setNotes("Used straps, felt great. Progress has been made.");

        //Instantiate array of example sets
        ArrayList<Set> newSets = new ArrayList<Set>();

        //Get an example set
        Set newSet = getSet();
        newSets.add(newSet);
        newLift.setSets(newSets);
        
        return newLift;
    }

    public static Set getSet() {

        //Create example set
        Set newSet = new Set(70, 2);

        return newSet;
    }

    public static void main(String[] args) {
        System.out.println("Welcome! Here, you can log your workouts to your workout log.");

        // Let's create and display new Workout object.
        Workout myWorkout = getWorkout();
        myWorkout.show();
    }
}