package converters;

class Dec2Hex
{
public static int Arg1;

    public static String convDec(String[] args) {
        Arg1 = Integer.parseInt(args[0]);
        char[] ch ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        return ("Hexadecimal representation is: " + hexadecimal);
    }

    public static void main(String[] args)    {
        System.out.println(convDec(args));
    }
}
