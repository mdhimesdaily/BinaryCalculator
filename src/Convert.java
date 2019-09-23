import java.util.Scanner;

class Convert {

    int convertToDecimal(String binaryString){
        int decimal=Integer.parseInt(binaryString,2);
        return decimal;
    }

    int convertToBinary(int decimalNumber){
        int binary= Integer.parseInt(Integer.toBinaryString(decimalNumber));
        return binary;
    }
}
