package com.upc.pe.employeesms.interfaces.rest.transform;

import com.upc.pe.employeesms.domain.model.commands.CreateEmployeeCommand;
import com.upc.pe.employeesms.interfaces.rest.resources.CreateEmployeeResource;

public class CreateEmployeeCommandFromResourceAssembler {
    public static CreateEmployeeCommand toCommandFromResource(CreateEmployeeResource resource){
        return new CreateEmployeeCommand(
                resource.firstName(),
                resource.lastName(),
                resource.phoneNumber(),
                resource.email(),
                resource.salary(),
                CreateContractInformationFromResourceAssembler.toContractFromResource(resource.contractInformationResource())

        );
    }
}
