class Convert {

    int convertToDecimal(String binaryString){
        return Integer.parseInt(binaryString,2);
    }

    int convertToBinary(int decimalNumber){
        return Integer.parseInt(Integer.toBinaryString(decimalNumber));
    }
}
