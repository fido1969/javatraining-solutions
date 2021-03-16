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

    public static void main(String[] args) {

        Capsules capsules = new Capsules();

        capsules.addLast("green");
        capsules.addLast("blue");
        capsules.addLast("red");
        System.out.println( capsules.getColors().toString());

        List<String> capselesClear = capsules.getColors();

        capselesClear.clear();//azonos referencia miatt mindkettő elemei törlődnek

        System.out.println( capsules.getColors().toString());

    }
}
