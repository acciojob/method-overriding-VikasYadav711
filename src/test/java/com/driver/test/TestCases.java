// package com.driver.test;

// import static org.junit.Assert.*;
// import org.junit.jupiter.api.Test;

// public class TestCases {
    
// }

package com.driver.test;

import com.driver.A;  // Import class A
import com.driver.B;  // Import class B

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void testMethod() {
        // Create object of B (which inherits from A)
        B obj = new B();

        // Call overridden method
        String result = obj.meth();

        // Assert that the overridden method works
        assertEquals("Method is overridden in Extended class B", result);
    }
}
