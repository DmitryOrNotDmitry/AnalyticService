package ru.dmitry.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.dmitry.demo.repos.IOperationRepository;
import ru.dmitry.demo.repos.IPlayerRepository;
import ru.dmitry.demo.entity.Operation;
import ru.dmitry.demo.entity.Player;

@Component
public class DataInserter implements CommandLineRunner {

    @Autowired
    private IOperationRepository operationRepo;

    @Autowired
    private IPlayerRepository playerRepo;

    @Override
    public void run(String... args) throws Exception {
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        playerRepo.save(p1);
        playerRepo.save(p2);

        operationRepo.save(new Operation(p1, 1000));
        operationRepo.save(new Operation(p2, 100.12));
        operationRepo.save(new Operation(p1, 75));
    }
}
