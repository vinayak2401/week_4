class Encryption {

  public static void main(String args[]) {
    String str = "Hi Hello Welcome to bitLabs";
    System.out.println("Before encryption string is : " + str);
    System.out.println("After encryption : ");
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        if (i % 2 == 0) {

          System.out.print(str.charAt(i));
        }
      }
    }
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        if (i % 2 == 1) {

          System.out.print(str.charAt(i));
        }
      }
    }
    
    System.out.println("\nAfter Decryption:");
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {

        System.out.print(str.charAt(i));
      } else {

        System.out.print(str.charAt(i));
      }
    }
  }
}