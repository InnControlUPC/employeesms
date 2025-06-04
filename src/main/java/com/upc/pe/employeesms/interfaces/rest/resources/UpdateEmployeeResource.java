package com.upc.pe.employeesms.interfaces.rest.resources;


public record  UpdateEmployeeResource(
                                     String email,
                                     Double salary,
                                     ContractInformationResource contractinformationResource) {
}
