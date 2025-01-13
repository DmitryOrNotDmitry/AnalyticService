package ru.dmitry.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.dmitry.demo.entity.Operation;
import ru.dmitry.demo.entity.Player;
import ru.dmitry.demo.repos.IOperationRepository;
import ru.dmitry.demo.repos.IPlayerRepository;

import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/operations")
@SessionAttributes("operation")
public class OperationController {

    @Autowired
    private IOperationRepository operationRepo;

    @Autowired
    private IPlayerRepository playerRepo;

    @GetMapping
    public String operations() {
        return "createOrder";
    }

    @PostMapping("/newOperation")
    public String createOperation(Operation operation) {
        Optional<Player> p = playerRepo.findById(operation.getPlayer().getId());
        if (p.isPresent()) {
            operation.setPlayer(p.get());
            operationRepo.save(operation);
        }

        return "redirect:/";
    }

}
