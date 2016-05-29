package man;

/**
 * Created by Potaychuk Sviatoslav on 24.05.2016.
 */
class HuntingGrounds implements State {

    @Override
    public void doing() {
        System.out.println("I'm hunting now!");
    }
}
