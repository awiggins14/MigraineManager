package org.launchcode.MigraineManager.data;

import org.launchcode.MigraineManager.models.Trigger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TriggerRepository extends CrudRepository<Trigger, Integer> {

    List<Trigger> findAllByUserId(int userId);

}
