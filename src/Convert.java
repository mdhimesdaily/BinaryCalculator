import java.util.Scanner;

public class Convert {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary string");
        String binaryString=scanner.nextLine();
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);
    }
}
