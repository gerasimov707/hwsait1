package compass.hw_sait_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {
    @GetMapping("/calculator")
    public String greetings() {
        return "Welcome to calculator";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") float a,
                       @RequestParam("num2") float b) {
        return a + "+ " + b + "= " + (a + b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") float a,
                        @RequestParam("num2") float b) {
        return a + "- " + b + "= " + (a - b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") float a,
                           @RequestParam("num2") float b) {
        return a + "* " + b + "= " + (a * b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") float a,
                         @RequestParam("num2") float b) {
        if (b == 0) {
            return "na 0 delit nelzya";
        } else {
            return a + "/ " + b + "= " + (a / b);
        }
    }
}
