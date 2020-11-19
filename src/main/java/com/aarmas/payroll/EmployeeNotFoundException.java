package com.aarmas.payroll;

public class EmployeeNotFoundException extends RuntimeException{ //When an EmployeeNotFoundException is thrown, this extra tidbit of Spring MVC configuration is used to render an HTTP 404:
    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
