class Main {
  public static void main(String[] args) {
    String str = "mnmk";
    boolean flag = false;
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch1 = str.charAt(i);
      int freq = 1;
      for (int j = i + 1; j < str.length(); j++) {
        char ch2 = str.charAt(j);
        if (ch1 == ch2) {
          freq++;
        }
      }
      if (freq > 1) {
        System.out.println(ch1 + "=" + freq);
        flag = true;
        count = freq;
        break;
      }
    }

    if (flag) {
      boolean isEqual = true;
      for (int i = 0; i < str.length(); i++) {
        char ch1 = str.charAt(i);
        int freq1 = 1;
        if (ch1 != str.charAt(count - 1)) {
          for (int j = i + 1; j < str.length(); j++) {
            char ch2 = str.charAt(j);
            if (ch1 == ch2) {
              freq1++;
            }
          }
          if (freq1 != count) {
System.out.println("Other character = "+freq1);
            isEqual = false;
            break;
          }
        }
      }

      if (!isEqual) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } else {
      System.out.println("No");
    }
  }
}