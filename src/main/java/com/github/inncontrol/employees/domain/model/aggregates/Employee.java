package com.github.inncontrol.employees.domain.model.aggregates;

import com.github.inncontrol.employees.domain.model.valueobjects.ContractInformation;
import com.github.inncontrol.employees.domain.model.valueobjects.ProfileId;
import com.github.inncontrol.employees.domain.model.valueobjects.SalaryEmployee;
import com.github.inncontrol.employees.shared.domain.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Employee extends AuditableAbstractAggregateRoot<Employee> {

    @Embedded
    private ContractInformation contract;

    @Embedded
    private SalaryEmployee salary;

    @Embedded
    private ProfileId profileId;

    public Employee() {
    }

    public Employee(ContractInformation contract, SalaryEmployee salary) {
        this.contract = contract;
        this.salary = salary;
    }

    public Employee(ProfileId profileId, Double salary, ContractInformation contract) {
        this();
        this.salary = new SalaryEmployee(salary);
        this.profileId = profileId;
        this.contract = contract;
    }


    public Employee updateInformation(Double salary, ContractInformation contract) {
        this.salary = new SalaryEmployee(salary);
        this.contract = contract;

        return this;
    }


    public Double getContractRemuneration() {
        return salary.salary() * contract.getMonthsWorked();
    }

    public Long getProfileId() {
        return this.profileId.profileId();
    }

    public Date getInitiationContract() {
        return this.contract.initiationDate();
    }

    public Date getTerminateContract() {
        return this.contract.terminationDate();
    }

    public Double getSalary() {
        return this.salary.salary();
    }

    public Employee updateSalary(Double salary) {
        this.salary = this.salary.updateSalary(salary);
        return this;
    }
}
