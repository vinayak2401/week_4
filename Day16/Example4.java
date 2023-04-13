class CountLetters {
    public static void main(String[] args) {
        String str = "Hello Welcome To bitLabs";
        int upCount = 0;
        int lowCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isUpperCase(c)) {
                upCount++;
            } else if (Character.isLowerCase(c)) {
                lowCount++;
            }
        }
        
        System.out.println("Number of uppercase letters: " + upCount);
        System.out.println("Number of lowercase letters: " + lowCount);
    }
}