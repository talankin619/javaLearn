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
public class Films {
    private String name;
    private int year;
    private int reiting;
    
    
    public Films(String name, int year, int reiting){
        this.name=name;
        this.year=year;
        this.reiting=reiting;
    }
    public String getName(){
        return name;     
    }
    public void setName(String name){
        this.name=name;
    }
        public int getReiting(){
        return reiting;     
    }
    public void setReiting(int reiting){
        this.reiting=reiting;
    }
     public static int good = 5;
     public static int norm = 3;
     public static int bad = 1;
}
