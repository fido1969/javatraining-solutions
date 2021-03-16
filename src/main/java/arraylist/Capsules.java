package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> capsulesColour = new ArrayList<>();

    public List<String> getCapsulesColour() {
        return capsulesColour;
    }

    public void addLast(String capsule) {
        capsulesColour.add(capsule);
    }

    public void addFirst(String capsule) {
        capsulesColour.add(0, capsule);
    }

    public void removeFirst() {
        capsulesColour.remove(0);
    }

    public void removeLast() {
        capsulesColour.remove(capsulesColour.get(capsulesColour.size() - 1));

    }

    public List<String> getColors() {
        return capsulesColour;
    }
}
