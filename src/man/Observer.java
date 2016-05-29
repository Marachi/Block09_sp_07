package man;

/**
 * Created by Potaychuk Sviatoslav on 24.05.2016.
 */
public interface Observer {

    /**
     * Thist method sets a state in implementation
     * @param state must have been setted
     */
    void handleEvent(State state);
}
