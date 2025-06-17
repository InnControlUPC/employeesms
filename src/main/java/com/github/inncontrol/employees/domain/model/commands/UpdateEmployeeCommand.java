package com.github.inncontrol.employees.domain.model.commands;


import com.github.inncontrol.employees.domain.model.valueobjects.ContractInformation;

public record  UpdateEmployeeCommand(Long id, String email, Double salary,
                                     ContractInformation contractInformation) {
}
