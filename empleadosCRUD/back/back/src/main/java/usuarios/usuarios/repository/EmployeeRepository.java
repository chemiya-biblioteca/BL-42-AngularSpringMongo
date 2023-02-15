package usuarios.usuarios.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import usuarios.usuarios.model.Employee;



@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
