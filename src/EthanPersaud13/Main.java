package EthanPersaud13;

public class Main {

    public static void main(String[] args) {
        //print out two different tests to make sure the code works with multiple selections
        System.out.println("isPalindrome?(this will be true) "+ePersaudLib.isPalindrome("racecar"));
        System.out.println("isPalindrome?(this will be false)"+ePersaudLib.isPalindrome("fool"));
        System.out.println("isPrime?(true): "+ePersaudLib.primePrinter(23));
        System.out.println("isPrime?(false): "+ePersaudLib.primePrinter(24));
        System.out.println("DateStr: "+ePersaudLib.dateChange("10/03/2001"));
        System.out.println("DateStr: "+ePersaudLib.dateChange("11/13/2001"));
        System.out.println("sumUpTo(10): "+ePersaudLib.sumUpTo(10));
        System.out.println("sumUpTo(99): "+ePersaudLib.sumUpTo(99));
    }
}
