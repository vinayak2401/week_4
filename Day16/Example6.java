class FullString {
  public static void main(String[] args) {
    String str = "Hello Welcome To bitLabs,333 **&%";
    int upCount = 0;
    int lowCount = 0;
    int digits = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        upCount++;
      } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        lowCount++;
      } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        
        digits = str.charAt(i);
      }
    }
    System.out.println("Number of uppercase letters: " + upCount);
    System.out.println("Number of lowercase letters: " + lowCount);
    System.out.println("Number of digits: " + digits);
  }
}