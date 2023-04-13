import java.util.Scanner;

class StudentDetails {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Name:");
    String name = s.nextLine();
    // ------------------------Name--------------------------------//
    if (name.length() >= 5 && name.length() <= 15) {
      char firstLetter = name.charAt(0);
      if (Character.isUpperCase(firstLetter)) {
        System.out.println("Valid name");
      } else {
        System.out.println("Name should start with upper case letter");
        return;
      }
    } else {
      System.out.println("Name should be atleast 5 characters and should not exceed 15 letters");
      return;
    }
    // -----------------------------Password---------------------------------//
    System.out.println("Enter the Password:");
    String password = s.nextLine();
    boolean hasUpperCase = false, hasLowerCase = false;
        if(password.length() >= 5 && password.length() <= 10) {
            for(int i=0; i<password.length(); i++) {
                char c = password.charAt(i);
                if(Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if(Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } 
            }
            if(hasUpperCase && hasLowerCase) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password should contain at least 1 uppercase, 1 lowercase, 1 digit and 1 special character.");
            }
        } else {
            System.out.println("Password should have 5-10 characters only.");
        }
    // ------------------------------Mobile Number--------------------------//
    System.out.println("Enter Mobile Number:");
    String mobileNumber = s.nextLine();
    if (mobileNumber.length() == 10) {
      char firstDigit = mobileNumber.charAt(0);
      if (firstDigit == '9' || firstDigit == '8' || firstDigit == '7' || firstDigit == '6') {
        System.out.println("Valid mobile number");
      } else {
        System.out.println("Mobile number should start with 9 or 8 or 7 or 6");
      }
    } else {
      System.out.println("Mobile number should be 10 digits");
    }
    // ------------------------------Email ID-------------------------------------//
    System.out.print("Enter email id: ");
    String email = s.nextLine();
    if (email.length() < 5 || email.length() > 20) {
      System.out.println("Email id length should be between 5-20 characters.");
    } else if (!(email.endsWith(".com") || email.endsWith(".in"))) {
      System.out.println("Email id should end with '.com' or '.in'.");
    } else {
      boolean hasAtSymbol = false;
      boolean hasDotSymbol = false;
      for (int i = 0; i < email.length(); i++) {
        char c = email.charAt(i);
        if (c == '@') {
          hasAtSymbol = true;
        } else if (c == '.') {
          hasDotSymbol = true;
        }
        
      }
      System.out.println("Valid Email id");
    }
  }
}