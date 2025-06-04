package com.upc.pe.employeesms.interfaces.rest.transform;


import com.upc.pe.employeesms.domain.model.aggregates.Employee;
import com.upc.pe.employeesms.interfaces.rest.resources.EmployeeResource;

public class EmployeeResourceFromEntityAssember {

    public static EmployeeResource toResourceFromEntity(Employee entity){

        return new EmployeeResource(
                entity.getId(),
                entity.getSalary(),
                entity.getInitiationContract(),
                entity.getTerminateContract(),
                entity.getProfileId()
        );
    }
}
