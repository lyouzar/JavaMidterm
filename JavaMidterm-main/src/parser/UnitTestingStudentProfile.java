package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {

    public static void main(String[] args) {
        // Implement unit tests for all user-defined methods in this package, here.

        Student student = new Student();

        Assert.assertEquals(student.getFirstName(),"Meziane");

    }
}
