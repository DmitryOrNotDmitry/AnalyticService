package ru.dmitry.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.dmitry.demo.entity.Player;

@Repository
public interface IPlayerRepository extends CrudRepository<Player, Long> {
}
