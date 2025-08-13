package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @GetMapping("/calculator")
    public String calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation) {

        double result;

        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                if (num2 == 0) return "<h1>Cannot divide by zero!</h1>";
                result = num1 / num2;
                break;
            default:
                return "<h1>Invalid operation!</h1>";
        }

        return "<h1>Result: " + result + "</h1>";
    }
}
