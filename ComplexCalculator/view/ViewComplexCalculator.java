package ComplexCalculator.view;

import java.util.Scanner;

import ComplexCalculator.controller.Calculator;
import ComplexCalculator.controller.ComplexCreateOperanion;
import ComplexCalculator.model.ComplexNumber;
import ComplexCalculator.service.ComplexOperation;
import ComplexCalculator.service.CreateOperation;

public class ViewComplexCalculator {
    CreateOperation createOperation = new ComplexCreateOperanion();

    ComplexOperation addOperation = createOperation.addOperation();
    ComplexOperation multiplyOperation = createOperation.multiplyOperation();
    ComplexOperation divideOperation = createOperation.divideOperation();
   
    
    public void start() {
        
        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Введите, какое действие надо выполнить ( +, -, / ): ");
                String command = scanner.nextLine();
                while (true) {             
                    
                    if (command.equals("+")) {
                        viewCalculator(addOperation );                    
                        break;
                    }
                    if (command.equals("-")) {
                        viewCalculator(multiplyOperation);                  
                        break;
                    }

                    if (command.equals("/")) {
                        viewCalculator(divideOperation);                   
                        break;
                                
                    
                    } else {
                        System.out.println("Выбрана не верная команда попробуйте еще раз!");
                    }               
                }

                System.out.println("Еще посчитать (Y/N)? ");
                String string = scanner.nextLine();
                    if (string.equals("Y")) {
                    continue;
                    
                    } else{
                       break;  
                    }                   
            }
            
        }
    }

    private void viewCalculator(ComplexOperation operation){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите 1-е действительное число: ");
            String real1 = scanner.nextLine();
            double a1 = Double.parseDouble(real1);
            System.out.println("Введите 1-е мнимое число: ");
            String imaginary1 = scanner.nextLine();
            double a2 = Double.parseDouble(imaginary1);
            System.out.println("Введите 2-е действительное число: ");
            String real2 = scanner.nextLine();
            double b1 = Double.parseDouble(real2);
            System.out.println("Введите 2-е мнимое число: ");
            String imaginary2 = scanner.nextLine();
            double b2 = Double.parseDouble(imaginary2);
            ComplexNumber num1 = new ComplexNumber(a1, a2);
            ComplexNumber num2 = new ComplexNumber(b1, b2);
            Calculator calc = new Calculator(operation);
            logViewOperation(num1, num2, operation);      
            ComplexNumber result = calc.calculateRezult(num1, num2);
            System.out.println(result);
            
        }
    } 

    private void logViewOperation(ComplexNumber a, ComplexNumber b, ComplexOperation operation){
        if(operation.equals(addOperation)){
            System.out.println("Выполнено сложение: " + a + " и " + b); 
        }
        
        else if(operation.equals(multiplyOperation)){
            System.out.println("Выполнено умножение: " + a + " и " + b); 
        }
        else if(operation.equals(divideOperation)){
            System.out.println("Выполнено деление: " + a + " и " + b); 
        }

    }
}
