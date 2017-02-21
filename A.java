package practice;

class B {  
    static  int num = 1;  
   private String name;  
 
   public String getName(String name) {  
       return name;  
   }  
 
   public void setName(String name) {  
       this.name = name;  
   }  
 
   public void show() {  
       System.out.println("name:" + name + " num:" + num);  
   }  
}  
 
public class A {  
   public static void main(String[] args) {  
       B a = new B();  
       a.setName("classA");  
       
       a.num++;  
 
       B b = new B();  
       b.setName("classB");  
 
       a.show();  
       b.show();  
   }  
}  
