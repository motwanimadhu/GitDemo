package javapractice;

public class Testing {
    public static void main(String[] args)
    {
        String inputString = "Hridik";
        String outputString = "";
        for(int i=inputString.length()-1;i>=0;i--)
        {
            outputString = outputString +inputString.charAt(i);
        }
        System.out.println(outputString);
    }
}
