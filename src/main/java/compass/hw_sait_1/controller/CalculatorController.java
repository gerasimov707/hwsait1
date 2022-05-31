package compass.hw_sait_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String greetings() {
        return calculatorService.greetings();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") float a,
                       @RequestParam("num2") float b) {
        return buildString(a,b,calculatorService.plus(a,b),"+");
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") float a,
                        @RequestParam("num2") float b) {
        return buildString(a,b,calculatorService.minus(a,b),"-");
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") float a,
                           @RequestParam("num2") float b) {
        return buildString(a,b,calculatorService.multiply(a,b),"*");
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") float a,
                         @RequestParam("num2") float b) {
        if (b == 0) {
            return "na 0 delit nelzya";
        } else {
            return buildString(a,b,calculatorService.divide(a,b),"/");
        }

        }private String buildString(float a, float b, float result,String operation){
            return String.format("%.1f %s %.1f= %.1f",a,operation,b,result);
    }
}
