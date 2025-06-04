package com.upc.pe.employeesms.domain.services;



import com.upc.pe.employeesms.domain.model.aggregates.Employee;
import com.upc.pe.employeesms.domain.model.commands.CreateEmployeeCommand;
import com.upc.pe.employeesms.domain.model.commands.UpdateEmployeeCommand;

import java.util.Optional;

public interface  EmployeeCommandService {
    Long handle(CreateEmployeeCommand command);
    Optional<Employee>handle(UpdateEmployeeCommand command);
}
