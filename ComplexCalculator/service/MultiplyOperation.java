package ComplexCalculator.service;

import ComplexCalculator.model.ComplexNumber;

public class MultiplyOperation implements ComplexOperation {
   
    @Override
    public ComplexNumber calculator(ComplexNumber a, ComplexNumber b) {
        double c1 = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double c2 = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(c1, c2);
    }
    
}
