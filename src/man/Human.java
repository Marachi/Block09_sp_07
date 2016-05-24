package man;

/**
 * Created by potaychuk on 24.05.2016.
 */
class Human {

    /**
     *Human's state
     */
    private State state;

    /**
     * This method delegates state's method
     */
    void doing(){
        state.doing();
    }

    //setter
    void setState(State state) {
        this.state = state;
    }
}
