// package com.driver.test;

// import static org.junit.Assert.*;
// import org.junit.jupiter.api.Test;

// public class TestCases {
    
// }
package com.driver.test;

import static org.junit.jupiter.api.Assertions.assertEquals;  // Using JUnit 5 assertions
import org.junit.jupiter.api.Test;
import com.driver.Main.A;
import com.driver.Main.B;

public class TestCases {
    
    @Test
    public void testMethodA() {
        A a = new A();  // Creating object of class A
        assertEquals("Invoking method from class A", a.meth());  // Testing the meth() method from class A
    }

    @Test
    public void testMethodB() {
        B b = new B();  // Creating object of class B
        assertEquals("Method is overridden in Extended class B", b.meth());  // Testing the overridden meth() method from class B
    }
}
