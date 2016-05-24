package man;

/**
 * Created by potaychuk on 24.05.2016.
 */
class Human {
    private State state;

    void doing(){
        state.doing();
    }

    void setState(State state) {
        this.state = state;
    }
}
