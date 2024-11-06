package converters;

class Dec2Hex
{

    public static String convDec(String[] args) {
        int num = Integer.parseInt(args[0]);
        char[] ch ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        StringBuilder hexadecimal= new StringBuilder();
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal.insert(0, ch[rem]);
            num= num/16;
        }

        return ("Hexadecimal representation is: " + hexadecimal);
    }

    public static void main(String[] args)    {
        System.out.println(convDec(args));
    }
}
