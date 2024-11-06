package converters;

import java.util.logging.Logger;

class Dec2Hex
{
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static String convDec(String[] args) {

        int num = Integer.parseInt(args[0]);
        char[] ch ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        StringBuilder hexadecimal= new StringBuilder();
        logger.info("Converting the Decimal Value " + num + " to Hex...");

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
