package man;

/**
 * Created by Славик on 22.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Create a man
        Human man = new Human();
         /*Create 3 states:
          - mushroom glade
          - riverside
          - hunting grounds*/
        State mushroomGlade = new MushroomGlade();
        State river = new RiverSide();
        State huntingGrounds = new HuntingGrounds();

        //action in riverside state
        man.setState(mushroomGlade);
        man.doing();

        //action in mushroom glade state
        man.setState(river);
        man.doing();

        //action in hunting grounds state
        man.setState(huntingGrounds);
        man.doing();
    }
}

