package man;

/**
 * Created by Potaychuk Sviatoslav on 24.05.2016.
 */
public class Main {
    public static void main(String[] args) {


        //Create a man
        Human man = new Human();

         /*Create 2 states
          - mushroom glade
          - riverside
          */
        State mushroomGlade = new MushroomGlade();
        State river = new RiverSide();

        //Create an observer
        Hunting hunting = new Hunting("I'm hunting now!...");
        hunting.addObsrver(man);


        //action in riverside state
        man.setState(mushroomGlade);
       // hunting.seeABeast();
        man.doing();

        //action in mushroom glade state
        man.setState(river);
        man.doing();
        hunting.seeABeast();
        man.doing();

    }
}

