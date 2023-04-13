class DuplicateChar {
  public static void main(String[] args) {
    String str = "hi Hello Welcome to bitLabs";
    char chararr[] = str.toCharArray();

    for (int i = 0; i < chararr.length; i++) {
      char currentChar = chararr[i];
      int Duplicate = 0;

      for (int j = 0; j < i; j++) {
        char lastChar = chararr[j];
        if (currentChar == lastChar) {
          Duplicate = 1;
          break;
        }
      }

      if (Duplicate == 1) {
        System.out.println(currentChar);
      }
    }
  }
}