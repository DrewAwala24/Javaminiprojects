import java.util.Scanner;

public class Password {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

            //USERNAME
        System.out.println("-----ACCOUNT CREATION-----");
        System.out.println("---USER REGISTRATION---");
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();

        if (isValidUsername(username)){
            System.out.println("👍Username accepted");
        }
        else {
            System.out.println("Username Declined");
        }
        //error handling
        if (username.length()<10){
            System.out.println("must be atleast 10 characters");
        } else if (username.equals(username.toLowerCase())) {
            System.out.println("Must contain atleast an uppercase");
        } else if (username.equals(username.toUpperCase())) {
            System.out.println("must contain atleast a lowercase");
        } else if (username.contains(" ")) {
            System.out.println("Must not contain spaces");
        }


        //PASSWORD
        System.out.println("Password Requirements:");
        System.out.println("- At least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one lowercase letter");
        System.out.println("- Contains at least one digit");
        System.out.println("- Contains at least one special character (!@#$%^&*)");

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        boolean isValid = validatePassword(password);

        if (isValid){
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is invalid");
        }
        System.out.println("-----Sign Up Successful-----");
        System.out.println("Welcome "+username);
    }
    //method definition
    public static boolean validatePassword(String password){
        //atleast 8 charachters
        boolean isLongEnough = password.length()>=8;
        //atleast one uppercase
        boolean hasUppercase = !password.equals(password.toLowerCase());
        //atleast one lowercase
        boolean hasLowercase = !password.equals(password.toUpperCase());
        //has one digit
        boolean hasNumber = password.matches(".*[0-9].*");
        //has one special character
        boolean hasSpecial = password.matches(".*[!@#$%^&*]*.");

        return isLongEnough && hasUppercase && hasLowercase && hasNumber && hasSpecial;
    }

    public static boolean isValidUsername(String username){
        //one uppercase
        boolean hasUppercase = !username.equals(username.toLowerCase());
        //one lowercase
        boolean hasLowercase = !username.equals(username.toUpperCase());
        //atleast 10 characters
        boolean isLongEnough = username.length()>=10;
        //no spaces
        boolean noSpaces = !username.contains(" ");

        return hasLowercase && hasUppercase && isLongEnough &&noSpaces;
    }

}