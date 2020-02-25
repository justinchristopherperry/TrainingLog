public class Log {
    public static void main(String[] args) {
        System.out.println("In this Log class, users will manage their workout log, which includes workouts and lifts.");

        Workout myWorkout = new Workout();
        myWorkout.show();

        Lift myLift = new Lift();
        myLift.show();
    }
}