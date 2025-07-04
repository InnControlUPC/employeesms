package com.github.inncontrol.employees.domain.services;



import com.github.inncontrol.employees.domain.model.aggregates.Employee;
import com.github.inncontrol.employees.domain.model.commands.CreateEmployeeCommand;
import com.github.inncontrol.employees.domain.model.commands.UpdateEmployeeCommand;

import java.util.Optional;

public interface  EmployeeCommandService {
    Long handle(CreateEmployeeCommand command);
    Optional<Employee>handle(UpdateEmployeeCommand command);
}
