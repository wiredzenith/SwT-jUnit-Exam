/*
Creadted by: Tomasz Klebek
Date: 09/03/2020

*/

package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EmployeeTest {

    @Test
    public void testTitle() throws Exception {

//        Employee employee = new Employee("mr",
//                "Tomasz",
//                "2560862C",
//                "0852302163",
//                "Full-Time",
//                87);

        assertThrows(Exception.class,() -> new Employee(
                "Mr",
                "Tomasz",
                "2560862C",
                "0852302163",
                "Full-Time",
                87));
    }


}
