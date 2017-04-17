import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static final String SEPARATOR = "@";
    public static final String COLON = ":";
    
    /*
     * Complete the function below.
     *
 	 * Note: The questions in this test build upon each other. We recommend you
	 * copy your solutions to your text editor of choice before proceeding to
	 * the next question as you will not be able to revisit previous questions.
	 */

    static String printHoldingsWithWeight(String inputString) {
    String[] strng=inputString.split(":");
    String strng1=strng[0];
    String strng2=strng[1];
    String output="";
    int i;
    int j;
    int n1=strng1.length();
    int n2=strng2.length();
    int count1=0;
    int count2=0;
    Double b1;
    Double b2;
    Double b3=0.00;
    Double c1;
    Double c2;
    Double c3=0.00;
    String p4="";
    String p5="";
    String p6="";
    String a8="";
    String p1="";
    String p2="";
    String p3="";
    String a4="";
    String p7="";
    String p8="";
    String p9="";
    String a12="";
    String pre1="0";
    String pre2=".00";
   

    
    for(j=0;j<n1;j++)
    {
        if(strng1.charAt(j)=='@')
        {
            count1++;
        }
       
    
    }
    count1=count1 + 1;
    
    for(i=0;i<n2;i++)
    {
        if(strng2.charAt(i)=='@')
        {
            count2++;
        }
    }
    count2=count2 + 1;
       
    if(count1<3)                     //Portfolio loop
    {
            String[] small=strng1.split("@");
            String small1=small[0];
            String small2=small[1];
            
            String[] comma=small1.split(",");
            p1=comma[0];
            p2=comma[1];
            p3=comma[2];
            b1=Double.parseDouble(p3);
            
            comma=small2.split(",");
            p4=comma[0];
            p5=comma[1];
            p6=comma[2];
            b2=Double.parseDouble(p6);
            
            
    }
    
    else                                //portfolio loop
    
    {
            String[] small=strng1.split("@");
            String small1=small[0];
            String small2=small[1];
            String small3=small[2];
            
            String[] comma=small1.split(",");
            p1=comma[0];
            p2=comma[1];
            p3=comma[2];
            b1=Double.parseDouble(p3);
             
            comma=small2.split(",");
            p4=comma[0];
            p5=comma[1];
            p6=comma[2];
            b2=Double.parseDouble(p6);
             
            comma=small3.split(",");
            p7=comma[0];
            p8=comma[1];
            p9=comma[2];
            b3=Double.parseDouble(p9);
             
        
    } 
    
    if(count2<3)      // Benchamark loop
    {
            String[] parts=strng2.split("@");
            String part1=parts[0];
            String part2=parts[1];
            
            String[] comma=part1.split(",");
            String a1=comma[0];
            String a2=comma[1];
            String a3=comma[2];
            a4=comma[3];
            c1=Double.parseDouble(a4);
             
            comma=part2.split(",");
            String a5=comma[0];
            String a6=comma[1];
            String a7=comma[2];
            a8=comma[3];
            c2=Double.parseDouble(a8);
            
            
    }
    else                           // Benchmark loop
    
    {
            String[] parts=strng2.split("@");
            String part1=parts[0];
            String part2=parts[1];
            String part3=parts[2];
            
            String[] comma=part1.split(",");
            String a1=comma[0];
            String a2=comma[1];
            String a3=comma[2];
            a4=comma[3];
            c1=Double.parseDouble(a4);
             
            comma=part2.split(",");
            String a5=comma[0];
            String a6=comma[1];
            String a7=comma[2];
            a8=comma[3];
            c2=Double.parseDouble(a8);
             
            comma=part3.split(",");
            String a9=comma[0];
            String a10=comma[1];
            String a11=comma[2];
            a12=comma[3];
            c3=Double.parseDouble(a12);
             
           
        
    } 

    if(count1<3 && count2<3)       //output loop
    {
        double val1= b1*c1;
        double val2= b2*c2;
        double total1=val1+val2;
        double pnav1=((val1/total1)*100);
        double pnav2=((val2/total1)*100);
        String VAL1=Double.toString(val1);
        String VAL2=Double.toString(val2);
        NumberFormat formatter=new DecimalFormat("#0.00");
        String PNAV1=formatter.format(pnav1);
        String PNAV2=formatter.format(pnav2);
        output="["+p4+", "+p5+", "+p6+", "+a8+""+pre1+", "+VAL2+""+pre1+", "+PNAV2+"], "+"["+p1+", "+p2+", "+p3+", "+a4+""+pre1+", "+VAL1+""+pre1+", "+PNAV1+"]";
        return output;
        
    }
    
    else                      //output loop
    {
        double val1= b1*c1;
        double val2= b2*c2;
        double val3= b3*c3;
        double total1=val1+val2+val3;
        double pNav1=((val1/total1)*100);
        double pNav2=((val2/total1)*100);
        double pNav3=((val3/total1)*100);
        NumberFormat formatter=new DecimalFormat("#0.00");
        String PNAV1=formatter.format(pNav1);
        String PNAV2=formatter.format(pNav2);
        String PNAV3=formatter.format(pNav3);
        String VAL1=Double.toString(val1);
        String VAL2=Double.toString(val2);
        String VAL3=Double.toString(val3);
        output="["+p4+", "+p5+", "+p6+", "+a8+""+pre2+", "+VAL2+""+pre1+", "+PNAV2+"], "+"["+p7+", "+p8+", "+p9+", "+a12+""+pre2+", "+VAL3+""+pre1+", "+PNAV3+"], "+"["+p1+", "+p2+", "+p3+", "+a4+""+pre2+", "+VAL1+""+pre1+", "+PNAV1+"]";  
        return output;
        
    }
    
    }


    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String res;
        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }
        res = printHoldingsWithWeight(_input);
        System.out.println(res);
    }
}
