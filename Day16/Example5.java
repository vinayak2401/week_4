class CountLetters {
    public static void main(String[] args) {
        String str = "Hello Welcome To bitLabs";
        int upCount = 0;
        int lowCount = 0;
        
        for (int i = 0; i < str.length(); i++){
          if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
            upCount++;
          }
          else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
            lowCount++;
          }
        }
        System.out.println("Number of uppercase letters: " + upCount);
        System.out.println("Number of lowercase letters: " + lowCount);
    }
        }