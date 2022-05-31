package compass.hw_sait_1.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String greetings(){
        return "Welcome to calculator";
    }
    public float plus(float a, float b) {
        return a+ b;
    }
    public float minus(float a, float b){
        return a- b;
    }
    public float multiply(float a, float b){
        return a* b;
    }
    public float divide(float a, float b){
        return a/ b;
    }

}
