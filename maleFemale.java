import java.util.*;

import org.graalvm.compiler.lir.aarch64.AArch64ControlFlow.StrategySwitchOp.SwitchClosure;

public class maleFemale {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String gender = sc.next();
        char ans;
        ans = gender.charAt(0);
        sc.close();
        switch(ans)
        {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Unspecified Gender\n");
        }
    }
}
