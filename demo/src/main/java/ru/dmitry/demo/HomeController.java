package ru.dmitry.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.dmitry.entity.Operation;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@SessionAttributes("operation")
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<Operation> operations = new ArrayList<>();
        operations.add(new Operation(0, 0,100));
        operations.add(new Operation(1, 1,150));
        operations.add(new Operation(2, 0,70));

        model.addAttribute("operations", operations);

        model.addAttribute("operation", new Operation());

        return "index";
    }




}
