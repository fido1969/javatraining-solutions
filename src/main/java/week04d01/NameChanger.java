package week04d01;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        isValid(fullName);
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void changeFirstName(String firstName) {
        this.fullName = fullName.replace(fullName.substring(0, fullName.indexOf(" ")), firstName);
    }

    public void changeFamilyName(String familyName) {
        this.fullName = fullName.replace(fullName.substring(fullName.indexOf(" ")+1), familyName);
    }

    private void isValid(String fullName) {
        if (fullName == null || !fullName.contains(" ") || fullName.isBlank()) {
            throw new IllegalArgumentException(" Invalid name: " + fullName);
        }
    }
}
