package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();
        positions.add(new Position("Manager", 800_000));
        positions.add(new Position("Leader", 500_000));
        positions.add(new Position("Shiftleade", 140_000));

        for (Position position : positions) {
            if (position.getBonus() > 150_000) {
                System.out.println(position.toString());
            }
        }
    }
}
