class SpecialCharacters {
    public static void main(String[] args) {
        String str = "Hello, 123 World! # $ % ^ & *";
        
        for (int i = 0; i < str.length(); i++){
          if(str.charAt(i)>='A'&& str.charAt(i)<='Z'||str.charAt(i)>='a'&& str.charAt(i)<='z'){
          
          }
          else if(str.charAt(i)>='0'&& str.charAt(i)<='9'){
          
          }
          else if(str.charAt(i)!=' '){
        System.out.print(str.charAt(i));
          }  
            
                
          }
              
          
        }
    }
