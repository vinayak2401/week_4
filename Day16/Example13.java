
class LongestWord {

  public static void main(String[] args) {
    
    String inputString = "Hi Hello Welcome to bitLabs";

    int maxLength = 0;
    int currentLength = 0;
    String longestWord = "";
    String currentWord = "";

    for (int i = 0; i < inputString.length(); i++) {
      char currentChar = inputString.charAt(i);
      if (currentChar != ' ') {
        currentWord += currentChar;
        currentLength++;
      } else {
        if (currentLength > maxLength) {
          maxLength = currentLength;
          longestWord = currentWord;
        }
        currentWord = "";
        currentLength = 0;
      }
    }

    
    if (currentLength > maxLength) {
      maxLength = currentLength;
      longestWord = currentWord;
    }

    System.out.println("The longest word in the string is: " + longestWord);
  }

}