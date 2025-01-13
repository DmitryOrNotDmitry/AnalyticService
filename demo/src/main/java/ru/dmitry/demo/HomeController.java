package ru.dmitry.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.dmitry.demo.entity.Operation;
import ru.dmitry.demo.repos.IOperationRepository;

@Slf4j
@Controller
@SessionAttributes("operation")
public class HomeController {

    @Autowired
    private IOperationRepository operationRepo;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("operations", operationRepo.findAll());

        model.addAttribute("operation", new Operation());

        return "index";
    }




}
