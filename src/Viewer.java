public class Viewer implements Observer{

    private String viewerState;
    private String name;
    private Observable trainingPerson;

    public Viewer(String name, String state){
        this.name = name;
        this.viewerState = state;
    }

    @Override
    public void update() {
        if(trainingPerson == null){
            System.out.println("No subscription");
            return;
        }

        String trainingPersonState = trainingPerson.getUpdate();
        System.out.println("Viewer " + this.name +
                " goes from " + this.viewerState +
                " to " + trainingPersonState);
    }

    @Override
    public void setTrainer(Observable observable) {
        this.trainingPerson = observable;
    }

    public String getViewerState() {
        return viewerState;
    }

    public void setViewerState(String viewerState) {
        this.viewerState = viewerState;
    }
}
