package Com.Review4;

public class RemoveSpecialChar {
    static void removeSpecialCharacter(String str){
        char ch [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i=0; i<str.length(); i++){
            for (int j=0; j< ch.length; j++){
            if (str.charAt(i) == ch[j]){
                System.out.print(str.charAt(i));
            }
        }
        }
    }
    public static void main(String[] args) {
        String str = "kanha&vishu#is*%going+/@to!*vistar";
        removeSpecialCharacter(str);
    }
}
