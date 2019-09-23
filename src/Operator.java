public class Operator {

    //This class handles all mathematical operations that occur

    int addition(int first_number, int second_number) {

        return first_number + second_number;
    }

    int subtraction(int first_number, int second_number) {

        return first_number - second_number;
    }

    int division(int first_number, int second_number) {

        if(first_number < second_number) {
            return 0;

        } else if(second_number == 0) {
            return 255;

        }

        return first_number / second_number;
    }

    int multiplication(int first_number, int second_number) {

        return first_number * second_number;
    }

    int squareRoot(int first_number){
        return (int)StrictMath.round(Math.sqrt(first_number));
    }

    int square(int first_number){
        return first_number * first_number;
    }

}
