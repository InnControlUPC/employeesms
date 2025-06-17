package com.github.inncontrol.employees.infrastructure.persistence.jpa.EmployeeRepository;


import com.github.inncontrol.employees.domain.model.aggregates.Employee;
import com.github.inncontrol.employees.domain.model.valueobjects.ProfileId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Optional<Employee> findByProfileId(ProfileId profileId);
   // List<Employee>findByByInitiationDate(Date initializationDate);
}
