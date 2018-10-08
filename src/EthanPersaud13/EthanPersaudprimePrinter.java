package EthanPersaud13;

public class EthanPersaudprimePrinter {
    public static boolean primePrinter(int x) {
        //basic is x a multiple of 2
        if (x%2==0) return false;
        //if not, then just check if odd values can be multiples
        for(int i=3;i*i<=x;i+=2) {
            if(x%i==0)
                return false;
        }
        return true;
    }
}
