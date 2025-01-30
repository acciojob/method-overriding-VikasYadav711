// package com.driver.test;

// import static org.junit.Assert.*;
// import org.junit.jupiter.api.Test;

// public class TestCases {
    
// }

package com.driver.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.driver.Main.A;
import com.driver.Main.B;

public class TestCases {
    
    @Test
    public void testMethodA() {
        A a = new A();
        assertEquals("Invoking method from class A", a.meth());
    }

    @Test
    public void testMethodB() {
        B b = new B();
        assertEquals("Method is overridden in Extended class B", b.meth());
    }
}
