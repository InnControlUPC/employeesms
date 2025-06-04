package com.upc.pe.employeesms.domain.model.commands;


import com.upc.pe.employeesms.domain.model.valueobjects.ContractInformation;

public record CreateEmployeeCommand(String firstName, String lastName,
                                    String phoneNumber,
                                    String email,
                                    Double salary,
                                    ContractInformation contractInformation
) {
}
