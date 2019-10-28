import java.util.ArrayList;

public class Adventure {

    private Room current;   //instance variable goes everywhere!

    private ArrayList<Treasure> myBag;

    public Adventure() {   //constructor  (set up the adventure map!)
        //rooms
        Room entry=new Room("entry");
        Room hall=new Room("hall");
        Room armory=new Room("armory");
        Room lair=new Room("lair");
        //neighbors
        entry.addNeighbor("north",hall);    //entry has 1 neighbor
        hall.addNeighbor("west", armory);   //hall has 3 neighbors
        hall.addNeighbor("east", lair);
        hall.addNeighbor("south", entry);
        armory.addNeighbor("east", hall);   //armory has 1 neighbor
        lair.addNeighbor("west", hall);     //lair has 1 neighbor
        //treasures
        armory.setTreasure(new Treasure("sword"));
        lair.setTreasure(new Treasure("ruby"));
        //monsters
        lair.setMonster(new Monster("dragon"));
        //my things
        myBag = new ArrayList<Treasure>();

        current = entry;
    }

    public static void main(String[] args) {    //in general, only the main method is static

        //Adventure adventure = new Adventure();  //make an adventure
        //adventure.run();                        //run it
        new Adventure().run();                    // this is equivalent

    }

    public void run() {    //can get rid of private
        while(true){
            StdOut.println(current);
            handleCommand();
        }
    }

    public void handleCommand() {
        String command=StdIn.readLine();
        if (command.equals("look")) {
            current.look();
        }
        else if (command.equals("inventory")) {
            StdOut.println(myBag);
        }
        else if (command.equals("get")) {
            current.get(myBag);
        }
        else if (command.equals("attack")){
            attack();
        }
        else {
            current=current.go(command);
        }
    }

    public void attack() {
        if (myBag.contains(new Treasure("sword"))){
            current.killTheMonster();
        }
        else {
            current.killThePlayer();
            System.exit(0);
        }
    }
}
