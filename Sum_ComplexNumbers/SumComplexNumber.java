public class SumComplexNumbers {

    public static void main(String[] args) {

        ComplexNumber number_1 = new ComplexNumber(1,2);
        ComplexNumber number_2 = new ComplexNumber(2,3);

        ComplexNumber result = sum(number_1, number_2);

        System.out.println("The sum is: " + result.toString());
        
    }

    private static ComplexNumber sum(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber sumComplexNumber = new ComplexNumber();

        double sumReal = n1.getReal() + n2.getReal();
        double sumImaginary = n1.getImaginary() + n2.getImaginary();

        sumComplexNumber.setReal(sumReal);
        sumComplexNumber.setImaginary(sumImaginary);

        return sumComplexNumber;
    }

}
