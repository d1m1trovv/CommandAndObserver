public class MainClass {

        public static void main(String[] args){

            Exercises exercises = new Exercises();
            Command standUpCommand = new StandUpCommand(exercises);
            Command layDownCommand = new LayDownCommand(exercises);

            TrainingPerson trainingPerson = new TrainingPerson();
            exercises.setTrainingPerson(trainingPerson);
            Observer viewer1 = new Viewer("Ivan", "Sit-Down");
            Observer viewer2 = new Viewer("Georgi", "Sit-Down");
            Observer viewer3 = new Viewer("Dimitar", "Sit-Down");

            Controller controller = new Controller();
            controller.setTrainingPerson(trainingPerson);

            controller.Subscribe(viewer1);
            controller.Subscribe(viewer2);
            controller.Subscribe(viewer3);

            controller.setCommand(standUpCommand);
            controller.instructTrainingPerson();

            System.out.println("--------------------------------------------");

            controller.setCommand(layDownCommand);
            controller.instructTrainingPerson();
        }

}
