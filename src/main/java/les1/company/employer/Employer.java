package les1.company.employer;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class Employer<T> implements Worker {
    private String name;
    private int age;
    private T role;

    public Employer(String name, int age, T role){
        this.name = name;
        this.age = age;
        this.role = role;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){this.age = age;}
    public String getName(){return this.name;}
    public int getAge(){return age;}
    public  T getRole(){return  role;}

    public static void someMethod(){System.out.println("mathod1");}

    @Override
    public String toString(){
        List<String> g = new ArrayList<>();
        g.add(name);
        g.add(Integer.toString(age));
        g.add(role.toString());
        return g.toString();
    }
}
