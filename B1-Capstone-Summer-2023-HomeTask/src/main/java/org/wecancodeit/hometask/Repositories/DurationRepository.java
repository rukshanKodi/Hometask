package org.wecancodeit.hometask.Repositories;
import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.hometask.Models.DurationManager;


public interface DurationRepository extends CrudRepository<DurationManager,Long> {
    
}
