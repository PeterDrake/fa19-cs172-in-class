public class Adventure {
    public static void main(String[] args) {
        Room entry=new Room("entry");
        Room hall=new Room("hall");
        Room armory=new Room("armory");
        Room lair=new Room("lair");
        entry.addNeighbor("north",hall);
        Room current=entry;
        while(true){
            StdOut.print(current);
            String command=StdIn.readLine();
            if(command.equals("north")){
                current=current.go("north");
            }
        }
    }
}
