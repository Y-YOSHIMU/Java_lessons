import java.util.ArrayList;

class ToDos {
    
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";
        String toDo2 = "Study Java";
        String toDo3 = "Wash dishes";

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println(toDoList);

        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        System.out.println(sherlocksToDos.size());
        System.out.println(poirotsToDos.size());

        System.out.println("Poirot");

        // System.out.println("Sherlock's third to-do:");
        // System.out.println(sherlocksToDos.get(2));
        // System.out.println("\nPoirot's second to-do:");
        // System.out.println(poirotsToDos.get(1));

        // sherlocksToDos.set(1, "listen to Dr.watson for amusement");
        // poirotsToDos.set(3, "listen to Captain Hastings for amusement");

        sherlocksToDos.remove(0);
        poirotsToDos.remove(0);
        sherlocksToDos.remove("play violin");

        // System.out.println("Sherlock's to-do list:");
        // System.out.println(sherlocksToDos.toString() + "\n");
        // System.out.println("Poirot's to-do list:");
        // System.out.println(poirotsToDos.toString());

        System.out.println(sherlocksToDos.indexOf("solve the case"));
        System.out.println("PRINT THE ANSWER HERE");
    }
}