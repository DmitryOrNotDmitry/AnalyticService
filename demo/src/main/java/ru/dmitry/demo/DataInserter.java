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
        playerRepo.save(new Player("Player 1"));
        playerRepo.save(new Player("Player 2"));

        operationRepo.save(new Operation(0, 1000));
        operationRepo.save(new Operation(1, 100.12));
        operationRepo.save(new Operation(0, 75));
    }
}
