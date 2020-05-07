public class LayDownCommand implements Command{

    private Exercises exercises;

    public LayDownCommand(Exercises exercises){
        this.exercises = exercises;
    }

    @Override
    public void execute() {
        this.exercises.layDown();
    }
}
