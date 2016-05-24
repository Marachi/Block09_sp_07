package man;

/**
 * Created by Славик on 22.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        State mushroomGlade = new MushroomGlade();
        State river = new RiverSide();
        State huntingGrounds = new HuntingGrounds();
        Human human = new Human();
        human.setState(mushroomGlade);
        human.doing();
        human.setState(river);
        human.doing();
        human.setState(huntingGrounds);
        human.doing();
    }
}

