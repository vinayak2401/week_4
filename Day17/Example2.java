class SwapCase {
  public static void main(String[] args) {

    String inputString = "hi Hello Welcome to bitLabs";

    char[] charArray = inputString.toCharArray();

    for (int i = 0; i < charArray.length; i++) {
      char c = charArray[i];
      if (Character.isUpperCase(c)) {
        charArray[i] = Character.toLowerCase(c);
      } else if (Character.isLowerCase(c)) {
        charArray[i] = Character.toUpperCase(c);
      }
    }

    
    String swappedString = new String(charArray);
    System.out.println("Swapped case string: " + swappedString);
  }
}
