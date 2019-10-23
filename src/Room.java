import java.util.ArrayList;

public class Room {
    String name;
    ArrayList<String> directions;
    ArrayList<Room> neighbors;

    Room(String n){
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
}
