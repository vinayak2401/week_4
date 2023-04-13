 class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Hi Hello Welcome to bitLabs";
        String[] words = sentence.split(" ");

        
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        System.out.println("Reversed sentence: " + reversed);
    }
}