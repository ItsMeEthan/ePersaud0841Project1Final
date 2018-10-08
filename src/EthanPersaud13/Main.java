package EthanPersaud13;

public class Main {

    public static void main(String[] args) {
        //print out two different tests to make sure the code works with multiple selections
        System.out.println("isPalindrome?(this will be true) "+EthanPersaud12.isPalindrome("racecar"));
        System.out.println("isPalindrome?(this will be false)"+EthanPersaud12.isPalindrome("fool"));
        System.out.println("isPrime?(true): "+EthanPersaudprimePrinter.primePrinter(23));
        System.out.println("isPrime?(false): "+EthanPersaudprimePrinter.primePrinter(24));
        System.out.println("DateStr: "+datesStr.dateChange("10/03/2001"));
        System.out.println("DateStr: "+datesStr.dateChange("11/13/2001"));
        System.out.println("sumUpTo(10): "+EthanPersaudSumUpTo.sumUpTo(10));
        System.out.println("sumUpTo(99): "+EthanPersaudSumUpTo.sumUpTo(99));
        System.out.println("Are you happy? "+EthanPersaudSmileyFaceFrownyFace.areYouHappy("yes"));
        System.out.println("Are you happy? "+EthanPersaudSmileyFaceFrownyFace.areYouHappy("no"));
    }
}
