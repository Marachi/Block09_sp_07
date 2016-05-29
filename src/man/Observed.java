package man;

/**
 * Created by Potaychuk Sviatoslav on 24.05.2016.
 */
public interface Observed {

    /**
     * This method adds observer
     * @param o is observer
     */
    void addObsrver(Observer o);

    /**
     * This method removes observer
     * @param o is observer
     */
    void removeObserver(Observer o);

    /**
     * This method notifies observers
     */
    void seeABeast();
}
