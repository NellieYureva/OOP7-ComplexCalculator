package ComplexCalculator.service;

import ComplexCalculator.model.ComplexNumber;

public class DivideOperation implements ComplexOperation {
    
    @Override
    public ComplexNumber calculator(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double c1 = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double c2 = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumber(c1, c2);
    } 
        
}
