package math;

import java.util.Random;

public class Warrior {

    private Point position;
    private String name;
    private int stamina;
    private double skill;

    Random random = new Random();

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        stamina = random.nextInt(81) + 20;
        skill = random.nextDouble();
    }

    public Point getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void move(Warrior warrior) {

        if (warrior == null) {
            throw new NullPointerException("Invalid parameter!");
        }

        int newX = this.position.getX();
        int newY = this.getPosition().getY();

        if (this.position.getX() - warrior.position.getX() > 0) {
            newX--;
        } else {
            newX++;
        }

        if (this.position.getY() - warrior.position.getY() > 0) {
            newY--;
        } else {
            newY++;
        }
        this.position = new Point(newX, newY);
    }

    public double distance(Warrior warrior) {
        return this.getPosition().distance(warrior.getPosition());
    }

    public void attack(Warrior warrior) {
        if (random.nextDouble() < this.skill) {
            warrior.stamina -= random.nextInt(3) + 1;
        }
    }

    public boolean isAlive() {
        return stamina > 0;
    }

    public String toString() {
        return this.getName() + ": (" + this.getPosition().getX() + "," + this.getPosition().getY() + ") " + this.getStamina();
    }
}
