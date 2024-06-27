package ComplexCalculator.controller;

import ComplexCalculator.service.AddOperation;
import ComplexCalculator.service.ComplexOperation;
import ComplexCalculator.service.CreateOperation;
import ComplexCalculator.service.DivideOperation;
import ComplexCalculator.service.MultiplyOperation;

public class ComplexCreateOperanion implements CreateOperation{

    @Override
    public ComplexOperation addOperation() {
        return new AddOperation();
    }

    @Override
    public ComplexOperation multiplyOperation() {
        return new MultiplyOperation();
    }

    @Override
    public ComplexOperation divideOperation() {
        return new DivideOperation();
    }
    
}
