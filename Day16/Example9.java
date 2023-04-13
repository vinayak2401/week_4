 class Alphabet {
   public static void main(String[] args) {
     String str = "Hey, This is Vinayak!!";
     String words[] = str.split(" ");
     for (int i = 0; i < words.length; i++) {
       String word=words[i];
       System.out.println("\nAlphabets in word " +word +" are");
       for(int j=0;j<word.length();j++){
         if (word.charAt(j)>='A' && word.charAt(j)<='Z'||word.charAt(j)>='a' &&word.charAt(j)<='z') {
           System.out.print(word.charAt(j)+" ");
         }
       }
     }
   }
 }