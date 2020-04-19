public class ComplexNumber {
    private double real;
    private double imaginary;



    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
   /*
    * Method named getReal without any parameters, it needs to return the value of real field.
* Method named getImaginary without any parameters, it needs to return the value of imaginary field.
* Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields.
    In other words, it needs to do a complex number add operation as described above.
            * Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber
    parameter to the corresponding instance
    variables.
            * Method named subtract with two parameters real and imaginary of type double,
    it needs to subtract parameters from fields, in other words,
    it needs to do a complex number subtract operation as described above.
            * Method named subtract with one parameter other of type ComplexNumber.
    It needs to subtract the other parameter from this complex number.
*/

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
        System.out.println(real + " + " + imaginary + "i");
    }

    public void add(ComplexNumber complexNumber){
        double real1 = complexNumber.getReal();
        double imaginary1 = complexNumber.getImaginary();

        this.real += real1;
        this.imaginary += imaginary1;
    }


    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
        System.out.println(real + " - " + imaginary + "i");
    }

    public void subtract(ComplexNumber complexNumber){
        double real2 = complexNumber.getReal();
        double imaginary2 = complexNumber.getImaginary();

        this.real -= real2;
        this.imaginary -= imaginary2;
    }

}
