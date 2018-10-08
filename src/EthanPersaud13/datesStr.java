package EthanPersaud13;

public class datesStr {
    public static String dateChange(String input)
    {
        //set up 3 outputs which will break up original code, and set index for while loop
        int index=0;
        String output="";
        String output2="";
        String output3="";
        String DateStr="";
        //while loop rearranges dates and puts them together in the correct output dd/mm/yyyy in DateStr
        //index jumps to ll to stop the while loop after it completes the cycle once since input length is 10
        while(index<input.length())
        {
            output=output + input.substring(0,2);
            output2=output2 + input.substring(3,5);
            output3=output3 + input.substring(6,10);
            DateStr=DateStr+output2+"-"+output+"-"+output3;
            index=index+11;
        }
        //prints correct value
        return DateStr;
    }
}
