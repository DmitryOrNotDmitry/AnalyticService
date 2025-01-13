package ru.dmitry.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.dmitry.demo.entity.Operation;
import ru.dmitry.demo.repos.IOperationRepository;

@Slf4j
@Controller
@RequestMapping("/operations")
@SessionAttributes("operation")
public class OperationController {

    @Autowired
    private IOperationRepository operationRepo;

    @GetMapping
    public String operations() {
        return "createOrder";
    }

    @PostMapping("/newOperation")
    public String createOperation(Operation operation) {
        operationRepo.save(operation);

        return "redirect:/";
    }

}
