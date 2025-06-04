package com.upc.pe.employeesms.interfaces.rest.transform;

import com.upc.pe.employeesms.domain.model.commands.UpdateEmployeeCommand;
import com.upc.pe.employeesms.interfaces.rest.resources.UpdateEmployeeResource;

public class UpdateCommandFromResourceAssembler {
    public static UpdateEmployeeCommand toUpdateCommand(Long employeeId, UpdateEmployeeResource resource){
        return new UpdateEmployeeCommand(
                employeeId,
                resource.email(),
                resource.salary(),
                CreateContractInformationFromResourceAssembler.toContractFromResource(resource.contractinformationResource())
        );

    }
}
