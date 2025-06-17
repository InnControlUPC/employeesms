package com.github.inncontrol.employees.interfaces.rest.resources;


import java.util.Date;

public record EmployeeResource(
        Long employeeId,
        Double salary,
        Date initiationContract,
        Date terminationContract,
        Long profileId
) {
}
