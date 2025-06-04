package com.upc.pe.employeesms.interfaces.rest.transform;

import com.upc.pe.employeesms.domain.model.valueobjects.ContractInformation;
import com.upc.pe.employeesms.interfaces.rest.resources.ContractInformationResource;

public class CreateContractInformationFromResourceAssembler {

    public static ContractInformation toContractFromResource(ContractInformationResource resource){

        return new ContractInformation(resource.initationDate(),resource.terminationDate());
    }
}
