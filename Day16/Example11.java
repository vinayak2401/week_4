class FirstWordLength {
  public static void main(String[] args) {
    String input = "Hey This is vinayak";

    String[] words = input.split(" ");

    int firstWordLength = 0;
    if (words.length > 0) {
      String firstWord = words[0];
      firstWordLength = firstWord.length();
    }

    System.out.println("Length of the first word: " + firstWordLength);
  }
}