class CharacterFrequency {
    public static void main(String[] args) {
        String input = "Hey! This is Vinayak!!!";

        // Remove all spaces from the input string
        input = input.replaceAll("\\s", "");

        // Create an array to store character frequencies
        int[] freqArray = new int[256];

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Increment the frequency of the character in the freqArray
            freqArray[c]++;
        }

        // Print out the frequency of each character
        for (int i = 0; i < freqArray.length; i++) {
            if (freqArray[i] != 0) {
                System.out.println("'" + (char)i + "' occurs " + freqArray[i] + " times");
            }
        }
    }
}

/*class Example1 {   public static void main(String args[]) {     String str = "hi hello welcome to bitLabs";     char ch[] = new char[str.length()];     for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    int count = 1;
    for (int i = 0; i < ch.length; i++) {
      for (int j = i + 1; j < ch.length; j++) {
        if (ch[i] == ch[j]) {
          count++;
          ch[j] = ' ';
        }
      }
      if (ch[i] != ' ') {
        System.out.println(ch[i] + " : " + count);
      }
      count = 1;
    }   }
}*/