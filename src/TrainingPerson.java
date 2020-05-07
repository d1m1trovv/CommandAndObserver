import java.util.ArrayList;
import java.util.List;

public class TrainingPerson implements Observable{

    private List<Observer> viewers = new ArrayList<>();
    private String personState;

    @Override
    public void subscribe(Observer observer) {
        this.viewers.add(observer);
        observer.setTrainer(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.viewers.remove(observer);
    }

    @Override
    public void notifyViewers() {
        for(Observer viewer : viewers){
            viewer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.personState;
    }

    public void setPersonState(String personState) {
        this.personState = personState;
        this.notifyViewers();
    }
}
