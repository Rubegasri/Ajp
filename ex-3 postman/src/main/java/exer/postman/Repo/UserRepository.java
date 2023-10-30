package exer.postman.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import exer.postman.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}


