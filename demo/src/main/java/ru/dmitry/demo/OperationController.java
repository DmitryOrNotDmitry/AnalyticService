package ru.dmitry.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.dmitry.entity.Operation;

@Slf4j
@Controller
@RequestMapping("/operations")
@SessionAttributes("operation")
public class OperationController {

    @GetMapping
    public String operations() {
        return "createOrder";
    }

    @PostMapping("/newOperation")
    public String createOperation(Operation operation) {

        log.info(String.valueOf(operation.getId()));

        return "redirect:/";
    }

}
