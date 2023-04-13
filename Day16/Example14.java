class SmallestWord {

    public static void main(String[] args) {
        
        String inputString = "Hi Hello Welcome to bitLabs";

        int minLength = Integer.MAX_VALUE;
        int currentLength = 0;
        String smallestWord = "";
        String currentWord = "";

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar != ' ') {
                currentWord += currentChar;
                currentLength++;
            } else {
                if (currentLength < minLength) {
                    minLength = currentLength;
                    smallestWord = currentWord;
                }
                currentWord = "";
                currentLength = 0;
            }
        }

        
        if (currentLength < minLength) {
            minLength = currentLength;
            smallestWord = currentWord;
        }

        System.out.println("The smallest word in the string is: " + smallestWord);
    }

}