package corp.testing.example.core.task;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepositoryImpl extends CrudRepository<TaskEntityImpl, Integer> {
}