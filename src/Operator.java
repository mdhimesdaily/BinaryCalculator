public class Operator {

    //This class handles all mathmatical operations that occur

    Integer Addition(int first_number, int second_number) {

        return first_number + second_number;
    }

    Integer Subtraction(int first_number, int second_number) {

        return first_number - second_number;
    }

    Integer Division(int first_number, int second_number) {

        if(first_number < second_number) {
            return 0;
        }

        return first_number / second_number;
    }

    Integer Multiplication(int first_number, int second_number) {

        return first_number * second_number;
    }

}
