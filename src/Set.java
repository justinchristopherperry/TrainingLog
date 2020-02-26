public class Set {

    private int load;
    private int reps;

    public int getLoad() {
        return load;
    }
    public void setLoad(int load) {
        this.load = load;
    }
    public int getReps() {
        return reps;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }

    Set(int load, int reps) {
        this.load = load;
        this.reps = reps;
    }

    public void show() {
        System.out.println("In the Set.show() method.");
        if (this.load > 0) System.out.println("Load: " + this.load + "kgs");
        if (this.reps > 0) System.out.println("Reps: " + this.reps);
    }

    public static void main(String[] args) {
        System.out.println("In Set.main() method.");
    }
}