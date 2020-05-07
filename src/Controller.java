public class Controller {

    private Command command;
    private Observable trainingPerson;

    public Controller(){
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void setTrainingPerson(Observable trainingPerson){
        this.trainingPerson = trainingPerson;
    }

    public void instructTrainingPerson(){
        if (command.getClass().getSimpleName().equals("StandUpCommand")){
            System.out.println("Instructor says: Stand-Up");
        }
        else if (command.getClass().getSimpleName().equals("LayDownCommand")){
            System.out.println("Instructor says: Lay-Down");
        }
        this.command.execute();
    }

    public void Subscribe(Observer observer){
        trainingPerson.subscribe(observer);
    }

    public void Unsubscribe(Observer observer){
        trainingPerson.unsubscribe(observer);
    }
}
