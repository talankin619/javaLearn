/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapomnil;
import  static java.lang.Math.*;
/**
 *
 * @author user
 */
public class Zapomnil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a =  Integer.parseInt(args[0]);
        int b =  Integer.parseInt(args[1]);
        int c =  Integer.parseInt(args[2]);
        
        System.out.println(ae(a, b, c));
    }
    static int ae(int a, int b, int c){
        int root=0;
        int D = (int)pow(b,2) - 4*a*c;
        System.out.println(4*a*c);
        System.out.println(pow(b,2));
        System.out.println("D: "+D);
        if(D>0) {
            root = ((int)pow(-b,2) - (int)sqrt(D))/2/a;      
        }
        int k = 0;
       
        return root;
    }
    
}
