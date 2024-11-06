import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import org.junit.runner.notification.Failure;
import java.lang.Exception;

public class testRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(unitTests.class);
        int fails = 0;
        try{
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
                fails++;
            }
            if (fails > 0)
                throw new Exception();
            System.out.println(result.wasSuccessful());
            }
        catch(Exception e){
                System.out.println(e.toString());
                System.exit(1);
        }
        System.exit(0);
    }
}