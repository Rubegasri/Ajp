package movie.xamp;

import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<User,Integer> {
    
}
