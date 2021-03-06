package xxx.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import xxx.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}