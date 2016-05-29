package man;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Potaychuk Sviatoslav on 24.05.2016.
 */
public class Hunting implements Observed {

    private State state;
    private String hunterMsg;

    Hunting(String hunterMsg) {
        this.state = new HuntingGrounds();
        this.hunterMsg = hunterMsg;
    }

    private List<Observer> list = new ArrayList<>();

    @Override
    public void addObsrver(Observer o) {
        list.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void seeABeast() {
        for (Observer observer:list) {
            observer.handleEvent(new State() {
                @Override
                public void doing() {
                    System.out.println(hunterMsg);
                }
            } );
        }
    }
}
