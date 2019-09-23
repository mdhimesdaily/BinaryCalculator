import java.util.Scanner;

class Convert {

    int convertToDecimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number");
        String binaryString=scanner.nextLine();
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);
        return decimal;
    }

    int convertToBinary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimalNumber = scanner.nextInt();
        int binary= Integer.parseInt(Integer.toBinaryString(decimalNumber));
        System.out.println(binary);
        return binary;
    }
}
