public class StandUpCommand implements Command{

    private Exercises exercises;

    public StandUpCommand(Exercises exercises){
        this.exercises = exercises;
    }

    @Override
    public void execute() {
        this.exercises.standUp();
    }
}
