package com.github.inncontrol.employees.interfaces.rest.resources;


public record  UpdateEmployeeResource(
                                     String email,
                                     Double salary,
                                     ContractInformationResource contractinformationResource) {
}
