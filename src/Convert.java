import java.util.Scanner;

class Convert {

    Integer ConverttoDecimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number");
        String binaryString=scanner.nextLine();
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);
        return decimal;
    }

    Integer ConverttoBinary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        Integer decimalNumber = scanner.nextInt();
        int binary= Integer.parseInt(Integer.toBinaryString(decimalNumber));
        System.out.println(binary);
        return binary;
    }
}
