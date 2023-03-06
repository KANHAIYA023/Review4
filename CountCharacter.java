package Com.Review4;

public class CountCharacter {
    static void countCharacter(String str){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            count = 0;
            for (int j=i; j<str.length(); j++){
                if (str.charAt(i) == str.charAt(j) ){
                    count++;
                }
            } System.out.println(str.charAt(i) + " " + count);

        }
    }
    public static void main(String[] args) {
        String str = "Absbsbbd";
        countCharacter(str);

    }
}
