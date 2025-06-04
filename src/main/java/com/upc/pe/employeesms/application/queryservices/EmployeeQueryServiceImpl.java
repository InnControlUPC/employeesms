package com.upc.pe.employeesms.application.queryservices;

import com.upc.pe.employeesms.domain.model.aggregates.Employee;
import com.upc.pe.employeesms.domain.model.queries.GetAllEmployeeQuery;
import com.upc.pe.employeesms.domain.model.queries.GetEmployeeByIdQuery;
import com.upc.pe.employeesms.domain.model.queries.GetEmployeeByProfileIdQuery;
import com.upc.pe.employeesms.domain.model.valueobjects.ProfileId;
import com.upc.pe.employeesms.domain.services.EmployeeQueryService;
import com.upc.pe.employeesms.infrastructure.persistence.jpa.EmployeeRepository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeQueryServiceImpl implements EmployeeQueryService {

    private final EmployeeRepository employeeRepository;

    public EmployeeQueryServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> handle(GetAllEmployeeQuery query) {
        return this.employeeRepository.findAll();
    }


    @Override
    public Optional<Employee> handle(GetEmployeeByIdQuery query) {
        return this.employeeRepository.findById(query.id());
    }



    @Override
    public Optional<Employee> handle(GetEmployeeByProfileIdQuery query) {
        return this.employeeRepository.findByProfileId(new ProfileId(query.profileId()));
    }
}
