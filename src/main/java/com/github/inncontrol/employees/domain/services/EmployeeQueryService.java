package com.github.inncontrol.employees.domain.services;

import com.github.inncontrol.employees.domain.model.aggregates.Employee;
import com.github.inncontrol.employees.domain.model.queries.GetAllEmployeeQuery;
import com.github.inncontrol.employees.domain.model.queries.GetEmployeeByIdQuery;
import com.github.inncontrol.employees.domain.model.queries.GetEmployeeByProfileIdQuery;

import java.util.List;
import java.util.Optional;

public interface  EmployeeQueryService {

    List<Employee>handle(GetAllEmployeeQuery query);
    Optional<Employee> handle(GetEmployeeByIdQuery query);
    Optional<Employee> handle(GetEmployeeByProfileIdQuery query);
}
