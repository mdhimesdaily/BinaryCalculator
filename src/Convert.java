import java.util.Scanner;

//This class converts numbers to decimal from binary and vice versa
public class Convert {

    Integer ConverttoDecimal(String binaryString){
        int decimal=Integer.parseInt(binaryString,2);
        return decimal;
    }

    Integer ConverttoBinary(Integer decimalNumber){
        int binary= Integer.parseInt(Integer.toBinaryString(decimalNumber));
        return binary;
    }
}
