package data;

import java.util.*;

public class Employer implements Cloneable{
    private String name;
    private Date date;
    private int age;
    
    public Employer(String name, Date date, int age) {
        this.name = name;
        this.date = date;
        this.age = age;
    }
    
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    
    public void setDate(Date s) { date = s; }
    public Date getDate() { return date; }
    public void changeDate(int secs) { date.setSeconds(secs); }
    
    public void setAge(int a) { age = a; }
    public int getAge() { return age; }
    
    @Override
    public String toString() {
        return "[" + name + ", " + date + ", " + age + "]";
    }    
    
    @Override
    public boolean equals(Object o) {
        return hashCode() == o.hashCode();
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(name, date, age);
    }
    
    public Employer clone() throws CloneNotSupportedException{
        Employer cloned = (Employer) super.clone();
        cloned.date = (Date) date.clone();
        return cloned;
    }
}