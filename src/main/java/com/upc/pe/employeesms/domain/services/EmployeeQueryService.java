package com.upc.pe.employeesms.domain.services;

import com.upc.pe.employeesms.domain.model.aggregates.Employee;
import com.upc.pe.employeesms.domain.model.queries.GetAllEmployeeQuery;
import com.upc.pe.employeesms.domain.model.queries.GetEmployeeByIdQuery;
import com.upc.pe.employeesms.domain.model.queries.GetEmployeeByProfileIdQuery;

import java.util.List;
import java.util.Optional;

public interface  EmployeeQueryService {

    List<Employee>handle(GetAllEmployeeQuery query);
    Optional<Employee> handle(GetEmployeeByIdQuery query);
    Optional<Employee> handle(GetEmployeeByProfileIdQuery query);
}
