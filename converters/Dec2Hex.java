package converters;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Dec2Hex
{
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static String convDec(String[] args) {

        if (args.length == 0) {return "Missing Argument";}
        if(!Pattern.matches("-?\\d+", args[0])) {return "Invalid Argument";}
        int num = Integer.parseInt(args[0]);
        char[] ch ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        StringBuilder hexadecimal= new StringBuilder();
        if (logger.isLoggable(Level.INFO)) {logger.info(String.format("Converting the Decimal Value %d to Hex...", num));}

        while(num != 0)
        {
            rem=num%16;
            hexadecimal.insert(0, ch[rem]);
            num= num/16;
        }

        return ("Hexadecimal representation is: " + hexadecimal);
    }

    public static void main(String[] args)    {
        if (logger.isLoggable(Level.INFO)) {logger.info(convDec(args));}
    }
}
