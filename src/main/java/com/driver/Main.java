package com.driver;
import com.driver.A;
import com.driver.B;

public class Main {
  
    public static void main(String args[]){
        B obj=new B();
        System.out.println(obj.meth());
    }
}

// class A {

//     public String meth(){
//         return "Invoking method from class A";
//     }
    
// }

// class B extends A{

//     @Override
//     public String meth(){
//         return "Method is overridden in Extended class B";
//     }
// }
