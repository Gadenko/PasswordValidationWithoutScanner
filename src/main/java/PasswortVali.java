

public class PasswortVali {
    public static void main(String[] args) {

        String password1 = "Asdg34#######";
        String message = "";
        boolean validPasswordLenght = isValidPasswordLength(password1);
        boolean validPasswordUpperCase = isValidPasswordUpperCase(password1);
        boolean validPasswordLowerCase = isValidPasswordLowerCase(password1);
        boolean validPasswordNumbers = isValidPasswordNumbers(password1);
        boolean validPasswordSpecialChars = isValidPasswordSpecialChars(password1);
        boolean validPassword = validPasswordLenght&&validPasswordUpperCase&&validPasswordLowerCase&&
                validPasswordNumbers&&validPasswordSpecialChars;
        System.out.println(password1 + "is valid password:" + validPassword);
        System.out.println(message);

    }
    public static boolean isValidPasswordLength(String password) {
        boolean isValid = true;
        if (password.length() < 8) {
            System.out.println("Your password is to small use more then 8.");
            isValid = false;
        }
        return isValid;
    }
    public static boolean isValidPasswordUpperCase(String password){
        boolean isValid = true;
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars )) {
            System.out.println("Password must have atleast one uppercase character");
            isValid = false;
        }
        return isValid;
    }
    public static boolean isValidPasswordLowerCase(String password) {
        boolean isValid = true;
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            System.out.println("Password must have atleast one lowercase character");
            isValid = false;
        }
        return isValid;
    }
    public static boolean isValidPasswordNumbers(String password) {
        boolean isValid = true;
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers)) {
            System.out.println("Password must have atleast one number");
            isValid = false;
        }
        return isValid;
    }
    public static boolean isValidPasswordSpecialChars(String password) {
        boolean isValid = true;
        String specialChars = "(.*[@,#,$,%].*$)";
        if (!password.matches(specialChars)) {
            System.out.println("Password must have atleast one special character among @#$%");
            isValid = false;
        }
        return isValid;
    }
}




