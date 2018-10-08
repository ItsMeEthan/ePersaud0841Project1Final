package EthanPersaud13;

public class ePersaudLib {
    //string 1
    public static String dateChange(String input) {
        //set up 3 outputs which will break up original code, and set index for while loop
        int index = 0;
        String output = "";
        String output2 = "";
        String output3 = "";
        String DateStr = "";
        //while loop rearranges dates and puts them together in the correct output dd/mm/yyyy in DateStr
        //index jumps to ll to stop the while loop after it completes the cycle once since input length is 10
        while (index < input.length()) {
            output = output + input.substring(0, 2);
            output2 = output2 + input.substring(3, 5);
            output3 = output3 + input.substring(6, 10);
            DateStr = DateStr + output2 + "-" + output + "-" + output3;
            index = index + 11;
        }
        //prints correct value
        return DateStr;
    }

    //math 1
    public static int sumUpTo(int sum) {
        //int n will do an arithmetic sequence with input sum number, and int i will stop the while statement after one cycle
        int n = 0;
        int i = 0;
        while (i < 1) {
            n = (sum * (sum + 1)) / 2;
            i = 1;
        }
        return n;
    }

    //math 2
    public static boolean primePrinter(int x) {
        //basic is x a multiple of 2
        if (x % 2 == 0) return false;
        //if not, then just check if odd values can be multiples.
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0)
                return false;
        }
        //if neither can be found then it is true that input is prime.
        return true;
    }

    //String 2
    public static boolean isPalindrome(String word) {
        //first make sure integer = the length of the string
        int x = word.length();
        for (int y = 0; y < (x / 2); ++y) {
            if (word.charAt(y) != word.charAt(x - y - 1)) {
                return false;
            }
        }

        return true;
    }

    //math 3
        public static void multiplicationTable(String[] args) {
        //set integer for starting number and base number
            int num = 13, i = 1;
            while(i <= 13)
            {
                //print out system in proper order.
                System.out.printf("%d * %d = %d \n", num, i, num * i);
                i++;
            }
        }
    }

