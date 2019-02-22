
package formulageneral;

import java.util.Scanner;
public class Formulageneral {

    
    public static void main(String[] args) {
          Scanner x, y;
        double a,b,c,r;
        double p1, p2,p3,r1,r2;
        String w;
        
            System.out.println("Ingresa a: "); 
        x = new Scanner(System.in);
        a=x.nextInt();
        
             System.out.println("Ingresa b: "); 
        x = new Scanner(System.in);
        b=x.nextInt();
        
             System.out.println("Ingresa c: "); 
        x = new Scanner(System.in);
        c=x.nextInt();
        
     
        p1=((b*b)-(4*a*c));
        if(p1<0){
            p1=p1*-1;
            p1=Math.sqrt(p1);
            System.out.println("Resultado 1:  ");
            System.out.println((b*-1)/(2*a)+ "+ " + (p1/(2*a)) + "i");
            System.out.println("Resultado 1:  ");
            System.out.println((b*-1)/(2*a)+ "- " + (p1/(2*a)) + "i");
        }
        else{
            p1=Math.sqrt(p1);
            r1=((b*-1)/(2*a) + (p1/(2*a)));
            r2=((b*-1)/(2*a) - (p1/(2*a)));
            System.out.println("Resultado 1: " + r1);
            System.out.println("Resultado 2: " + r2);
        }
        
    }

}
