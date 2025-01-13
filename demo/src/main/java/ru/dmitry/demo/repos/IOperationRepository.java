package ru.dmitry.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.dmitry.demo.entity.Operation;

@Repository
public interface IOperationRepository extends CrudRepository<Operation, Long> {
}
