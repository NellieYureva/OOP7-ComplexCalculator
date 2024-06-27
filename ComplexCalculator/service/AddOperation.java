package ComplexCalculator.service;


import ComplexCalculator.model.ComplexNumber;

public class AddOperation implements ComplexOperation {
    
    @Override
    public ComplexNumber calculator(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }   

    
}
