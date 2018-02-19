package main;

import data.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
    
        Employer emp = new Employer("Ivan", new Date(2000), 30);
        try{
            Employer empc = emp.clone();
            
            System.out.println(emp);
            System.out.println(empc);            
            System.out.println("test equals:" + (emp.equals(empc) ? "yes" : "no"));
            
            emp.changeDate(1000);
            System.out.println(emp);
            System.out.println(empc);            
            System.out.println("test equals:" + (emp.equals(empc) ? "yes" : "no"));
        }
        catch(Exception e){}
    
        System.out.println("exit");
    }
}