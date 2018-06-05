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
    int a = 3;
    Films c =new Films("Иллюзионист", 1996, Films.norm);
    Films b =new Films("Престиж", 2001, Films.good);
    if(c.getReiting()>b.getReiting()){
        System.out.println(c.getName()+" лучше");
    }else{
        System.out.println(b.getName()+" лучше");
    }
    }
}
