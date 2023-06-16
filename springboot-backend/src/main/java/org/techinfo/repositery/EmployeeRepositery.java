package org.techinfo.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;
import org.techinfo.model.Employee;

@Repository
public interface EmployeeRepositery extends JpaRepository<Employee, Long>{

}
