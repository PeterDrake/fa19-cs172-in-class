import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<String> directions;
    private ArrayList<Room> neighbors;
    private Treasure treasure;
    private Monster monster;

    public void setTreasure(Treasure t) {
        treasure = t;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public void get(ArrayList<Treasure> bag) {
        if (monster!=null)
        {
            StdOut.println("You can't do that with unfriendlies about!");
        }
        else if (treasure!=null) {
            bag.add(treasure);
            treasure = null;
        }
    }

    public void look() {
        if (treasure!=null) {
            StdOut.println("There is a " + treasure + " here!");
        }
        if (monster!=null) {
            StdOut.println("There is a " + monster + " here!");
        }
    }

    public Room(String n){
        name=n;
        directions=new ArrayList<String>();
        neighbors= new ArrayList<Room>();
    }

    public String toString(){
        return name;
    }

    public Room go(String direction) {
        int i=directions.indexOf(direction);
        if(i==-1){
            return this;
        }
        return neighbors.get(i);
    }

    public void addNeighbor(String d, Room n) {
        directions.add(d);
        neighbors.add(n);
    }

    public void killTheMonster() {
        StdOut.println("The "+monster+" falls dead!");
        monster=null;
    }

    public void killThePlayer() {
        StdOut.println("The dragon breaths fire and fries you to a crisp!");
    }
}
