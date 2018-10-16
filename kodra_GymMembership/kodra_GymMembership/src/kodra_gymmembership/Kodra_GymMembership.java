package kodra_gymmembership;

import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @author Besian Kodra
 */
public class Kodra_GymMembership 
{
    public static void main(String[] args) 
    {
        User use = new User();
        use.getInput();
        use.displayUserInfo();
        
        System.out.println("\n");
    }
}
