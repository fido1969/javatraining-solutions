package statements;

public class Investment {

    private double cost = 0.003;

    private int fund;

    private int interestRate;

    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getCost() {
        return cost;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public double getYield(int days) {
        return getFund() * getInterestRate() / 100.0 * days / 365;
    }

    public double close(int days) {
        double payCash = active == true ? getFund() + (getYield(days) * (1 - getCost())) : 0;
        active = false;
        return payCash;
    }
}

