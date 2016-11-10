package Reflect;
 
import java.lang.reflect.Constructor;
 
class Person4{
     
    public Person4() {
         
    }
    public Person4(String name){
        this.name=name;
    }
    public Person4(int age){
        this.age=age;
    }
    public Person4(String name, int age) {
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "["+this.name+"  "+this.age+"]";
    }
    private String name;
    private int age;
}
 
class Demo4{
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("Reflect.Person4");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Person4 per1=null;
        Person4 per2=null;
        Person4 per3=null;
        Person4 per4=null;
        //取得全部的构造函数
        Constructor<?> cons[]=demo.getConstructors();
        try{
            per1=(Person4)cons[3].newInstance();
            per2=(Person4)cons[2].newInstance("Rollen");
            per3=(Person4)cons[1].newInstance(20);
            per4=(Person4)cons[0].newInstance("Rollen",20);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
    }
}

