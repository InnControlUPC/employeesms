package com.upc.pe.employeesms.interfaces.rest.resources;


public record  CreateEmployeeResource(String firstName,
                                      String lastName,
                                      String phoneNumber,
                                      String email,
                                        Double salary,
                                      ContractInformationResource contractInformationResource
) {
}