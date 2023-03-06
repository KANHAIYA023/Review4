package Com.Review4;

public class FindPrimeNumber {
    static void findPrime(int number []){
        int n = 17;
        int count = 0;
        for (int i=0; i<number.length; i++){
            count = 0;
            for (int j=1; j<=n; j++){
                if (number[i]%j ==0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(number[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int number [] =  {5,7,2,1,9,6,17};
        findPrime(number);
    }
}
