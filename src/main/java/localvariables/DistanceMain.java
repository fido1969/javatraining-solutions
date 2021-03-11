package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(120.5, true);

        System.out.println(distance.getDistanceKm());
        System.out.println(distance.isExact());

        int wholeSectionOfDistanceKm = (int) distance.getDistanceKm();

        System.out.println(wholeSectionOfDistanceKm);
    }
}
