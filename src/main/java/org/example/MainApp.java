package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

        // Insert operation
        System.out.println("Inserting employee...");
        employeeDAO.insertEmployee(1, "John Doe", "HR");
        employeeDAO.insertEmployee(2, "Alice Smith", "Finance");

        // Update operation
        System.out.println("Updating employee...");
        employeeDAO.updateEmployee(1, "John Smith");

        // Delete operation
        System.out.println("Deleting employee...");
        employeeDAO.deleteEmployee(2);
    }
}
