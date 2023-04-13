class PalindromeCheck {
  public static void main(String[] args) {
    String input = "malayalam";

    int i = 0;
    int j = input.length() - 1;
    int count = 0;
    while (i < j) {
      if (input.charAt(i) == input.charAt(j)) {
        count += 2;
        i++;
        j--;
      } else {
        break;
      }
    }

    if (count == input.length() || count == input.length() - 1) {
      System.out.println(input + " is Palindrome");
    } else {
      System.out.println(input + " is Not Palindrome");
    }
  }
}
