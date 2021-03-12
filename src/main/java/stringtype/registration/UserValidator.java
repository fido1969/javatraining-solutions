package stringtype.registration;

public class UserValidator {

    public boolean isValidUserName(String userName) {

        return !userName.equals("null");
    }

    public boolean isValidPassWord(String passWord1, String passWord2) {

        return !(passWord1.length() < 8) && passWord1.equals(passWord2);
    }

    public boolean isValidEmail(String email) {

        return email != null
                && email.contains("@")
                && email.contains(".")
                && (email.indexOf(".") > email.indexOf("@") + 1)
                && email.indexOf("@") != 0 && email.lastIndexOf(".") != email.length() - 1;
    }
}
