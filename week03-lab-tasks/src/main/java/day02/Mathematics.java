package day02;

public class Mathematics {
    public boolean isPrime(int number){
        for(int i = 2;i<number;++i){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
