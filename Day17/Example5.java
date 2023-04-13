class PalindromeWords {
  public static void main(String args[]) {
    String str = "madam drives racecar also teaches next level malayalam";
    String arr[] = str.split(" ");
    if (arr[0].contains("madam")) {
      int i = 0;
      int j = arr[0].length() - 1;
      int count = 0;

      while (i < j) {
        if (arr[0].charAt(i) == arr[0].charAt(j)) {
          count += 2;
          i++;
          j--;

        } else {
          break;
        }

      }

      if (count == arr[0].length() || count == arr[0].length() - 1) {
        System.out.println(arr[0]);
      }
    } else if (arr[1].contains("drives")) {
      int i = 0;
      int j = arr[1].length() - 1;
      int count = 0;

      while (i < j) {
        if (arr[1].charAt(i) == arr[1].charAt(j)) {
          count += 2;
          i++;
          j--;

        } else {
          break;
        }

      }

      if (count == arr[1].length() || count == arr[1].length() - 1) {
        System.out.println(arr[1]);
      }
    }
    if (arr[2].contains("racecar")) {
      int i = 0;
      int j = arr[2].length() - 1;
      int count = 0;

      while (i < j) {
        if (arr[2].charAt(i) == arr[2].charAt(j)) {
          count += 2;
          i++;
          j--;

        } else {
          break;
        }

      }

      if (count == arr[2].length() || count == arr[2].length() - 1) {
        System.out.println(arr[2]);
      }
    }

  }
}
