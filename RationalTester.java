

//********************************************************************
//  RationalTester.java       Java Foundations
//
//  Driver to exercise the use of multiple Rational objects.
//********************************************************************

public class RationalTester
{
    //-----------------------------------------------------------------
    //  Creates some rational number objects and performs various
    //  operations on them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
    	System.out.println("====Rational Number====");
    	
        RationalNumber r1 = new RationalNumber(6, 8); //6/8
        RationalNumber r2 = new RationalNumber(1, 3); //1/3
        RationalNumber r3, r4, r5, r6, r7;

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        if (r1.isLike(r2))
            System.out.println("r1 and r2 are equal.");
        else
            System.out.println("r1 and r2 are NOT equal.");

        r3 = r1.reciprocal();
        System.out.println("The reciprocal of r1 is: " + r3);

        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);

        System.out.println("r1 + r2: " + r4);
        System.out.println("r1 - r2: " + r5);
        System.out.println("r1 * r2: " + r6);
        System.out.println("r1 / r2: " + r7);
        
        System.out.println("Compare to: " + r1.compareTo(r3)); 
        System.out.println("Compare to: " + r1.compareTo(r1)); 
        System.out.println("Compare to: " + r1.compareTo(r4));
        
        System.out.println("\n");
        
        // Priority and Task ==============================================================================================================================
        
        System.out.println("====Priority====");
        
        Task newtask1 = new Task("ElectricBoogaloo", 5); //Process
        Task newtask2 = new Task("EE", 5);
        Process newProcess = new Process("BoogieWoogie");
        Process newProcess2 = new Process("Hoo");
        
        newtask1.setStatus(Task.Status.IN_PROCESS);
        newtask2.setStatus(Task.Status.NOT_STARTED);
        
        newProcess.setPriority(1);
        System.out.println("Process1 CompareTo: "+ newProcess.compareTo(newProcess2));
        newProcess.setPriority(0);
        System.out.println("Process1 CompareTo: " + newProcess.compareTo(newProcess2));
        
        
        newProcess2.setPriority(1); //Setting newProcess2 priority
        System.out.println("Process2 CompareTo: " + newProcess.compareTo(newProcess2));
        newProcess2.setPriority(0); //Resetting newProcess2 priority
        System.out.println("Process2 CompareTo: " + newProcess.compareTo(newProcess2));
        
        System.out.println(newtask1.getName()); //Displaying names
        System.out.println(newtask2.getName());// ^
        
        System.out.println(newtask1.getPriority()); //displaying priorities
        System.out.println(newtask2.getPriority()); // ^
        
        System.out.println("Newtask1 compare to (with priority 5): " + newtask1.compareTo(newtask2)); //Should return one since both priorities are true meaning they have the same priorities
        newtask1.setPriority(4); //Resetting the priority in newtask1
        System.out.println("Newtask1 compare to (with priority 4): " + newtask1.compareTo(newtask2)); //will return 0 since priorities do not match
        
        //Testing toStrings
        System.out.println("Process: " + newProcess.toString());
        System.out.println("Process2: " + newProcess2.toString());
        System.out.println("Task1 toString: " + newtask1.toString());
        System.out.println("task2 toString: " + newtask2.toString());
        
    }
}
