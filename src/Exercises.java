public class Exercises {

    public TrainingPerson trainingPerson;
    private String state;

    public void setTrainingPerson(TrainingPerson trainingPerson){
        this.trainingPerson = trainingPerson;
    }

    public void standUp(){
        System.out.println("The training person is Stand-Up");
        this.trainingPerson.setPersonState("Stand-up");
        this.setState("Stand-Up");
    }

    public void layDown(){
        System.out.println("The training person is Lay-down");
        this.trainingPerson.setPersonState("Lay-down");
        this.setState("Lay-Down");
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}
