package ComplexCalculator.controller;

import ComplexCalculator.model.ComplexNumber;
import ComplexCalculator.service.ComplexOperation;

public class Calculator {
    private ComplexOperation operation;

    public Calculator(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculateRezult(ComplexNumber a, ComplexNumber b) {
        return operation.calculator(a, b);
    }
}
