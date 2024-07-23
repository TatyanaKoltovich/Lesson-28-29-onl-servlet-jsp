package by.tms.lesson2829onl.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Operation {
    private double num1;
    private double num2;
    private double result;
    private String type;

    public Operation(double num1, double num2, String type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }
}
