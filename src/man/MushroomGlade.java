package man;

/**
 * Created by Potaychuk Sviatoslav on 24.05.2016.
 */
class MushroomGlade implements State {

    @Override
    public void doing() {
        System.out.println("I'm gathering mushrooms now!");
    }
}
