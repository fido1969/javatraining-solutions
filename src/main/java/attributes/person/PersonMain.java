package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("Szabadkai János", "AB-123456");
        System.out.println(person.personToString());
        System.out.println();

        Address address = new Address("Hungary", "Kecskemét", "Damjanich utca 1", "6000");
        System.out.println(address.addressToString());
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------");

        person.moveTo(new Address("Hungary", "Kecskemét", "Damjanich utca 1", "6000"));
        System.out.println(person.personToString() + " - " + person.getAddress());
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println();

        person.correctData("Szabadkai Attila", "CD-789456");
        address.correctData("Hungary", "6000", "Kecskemét", "Magyar utca 27");
        System.out.println(person.personToString() + " - " + address.addressToString());


    }
}
