/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapomnil;

/**
 *
 * @author user
 */
public class Student {
    String name;
    int age;
    String grop;
    public static String GROUP = "ЭЭ";
    
    public Student(String name, int age, String grop){
        this.name=name;
        this.age=age;
        this.grop=grop;            
    }
    public void sayName(){
        System.out.println(name);
    }
}
