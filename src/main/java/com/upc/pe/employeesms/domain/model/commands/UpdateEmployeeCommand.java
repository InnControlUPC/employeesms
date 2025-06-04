package com.upc.pe.employeesms.domain.model.commands;


import com.upc.pe.employeesms.domain.model.valueobjects.ContractInformation;

public record  UpdateEmployeeCommand(Long id, String email, Double salary,
                                     ContractInformation contractInformation) {
}
