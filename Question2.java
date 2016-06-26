import java.util.Scanner;
import java.text.DecimalFormat;
public class Question2 {  
    public static void main(String[] args) {
        
        System.out.println("Welcome to SIM Calculator");
        int option = Integer.MAX_VALUE;
        String number;
        int duration;
        float inRateflt;
        int inRateint;
        float outRateflt;
        int outRateint;
        int a;
        Scanner kb = new Scanner(System.in);
        SimCalculator simCalcYODA = new SimCalculator(4,5,"072","Yodacom");
        SimCalculator simCalcMYN = new SimCalculator(3,7,"082","MYN");
		  DecimalFormat formatter = new DecimalFormat("0.00");
        
        
        while (option != 5) {
            System.out.println("Choose option:");
            System.out.println("1. Calculate cost of call using MYN SIM");
            System.out.println("2. Change call rates for MYN SIM");
            System.out.println("3. Calculate cost of call using Yodacom SIM");
            System.out.println("4. Change call rates for Yodacom SIM");
            System.out.println("5. Quit");
            
            option = kb.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Enter number to call:");
                    number = kb.next();
                    System.out.println("Enter duration in seconds:");
                    duration = kb.nextInt();
                    a = simCalcMYN.checkCallCost(number,duration);
                    System.out.println("Cost of call would be: R"+formatter.format(a/100f));
                    break;
                case 2:
                    System.out.println("Enter new in-network rate: (R/sec)");
                    inRateflt = kb.nextFloat();
                    inRateint = (int)inRateflt*100; 
                    System.out.println("Enter new out-of-network rate: (R/sec)");
                    outRateflt = kb.nextFloat();
                    outRateint = (int)outRateflt*100;
                    System.out.println("Success!");
                    simCalcMYN.setRates(inRateint,outRateint);
                    break;
                case 3:
                    System.out.println("Enter number to call:");
                    number = kb.next();
                    System.out.println("Enter duration in seconds:");
                    duration = kb.nextInt();
                    a = simCalcYODA.checkCallCost(number,duration);
                    System.out.println("Cost of call would be: R"+formatter.format(a/100f));
                    break;
                case 4:
                    System.out.println("Enter new in-network rate: (R/sec)");
                    inRateflt = kb.nextFloat();
                    inRateint = (int)(inRateflt*100); 
                    System.out.println("Enter new out-of-network rate: (R/sec)");
                    outRateflt = kb.nextFloat();
                    outRateint = (int)(outRateflt*100);
                    System.out.println("Success!");
                    simCalcYODA.setRates(inRateint,outRateint);
                    break;

            }
            
            }
        }    
    }