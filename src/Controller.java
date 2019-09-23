import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

        private Object operatorClicked;
        private String entry1;
        @FXML private TextField field;

    void setMain(Main main){
    }

        public void zeroclick(){
            entry1= field.getText();
            if(entry1.length() < 5) {
                field.setText(entry1 + '0');
            }
        }

    public void oneclick() {
        entry1 = field.getText();
        if (entry1.length() < 5) {
            field.setText(entry1 + '1');
        }
    }

    public void plusclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        System.out.println(entry1);
        operatorClicked = "+";
        field.clear();
    }

    public void minusclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "-";
        field.clear();
    }

    public void multclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "x";
        field.clear();
    }

    public void divclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "/";
        field.clear();
    }

    public void sqclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "sq";
        field.clear();
    }

    public void sqrtclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "sqrt";
        field.clear();
    }

    public void equalsclick(){
        Operator operation = new Operator();
        Convert converter = new Convert();
        int entry2 =  converter.convertToDecimal(field.getText());
        System.out.println(entry2);
        if(operatorClicked.equals("+")){
            Integer result = operation.addition(Integer.parseInt(entry1), entry2);
            result = converter.convertToBinary(result);
            field.setText(String.valueOf(result));
        }

        else if(operatorClicked.equals("-")){
            Integer result = operation.subtraction(Integer.parseInt(entry1), entry2);
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.convertToBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }

        else if(operatorClicked.equals("x")){
            Integer result = operation.multiplication(Integer.parseInt(entry1), entry2);
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.convertToBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }

        else if(operatorClicked.equals("/")){
            Integer result = operation.division(Integer.parseInt(entry1), entry2);
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.convertToBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }
/*
        else if(operatorClicked.equals("sq")){
            Integer result = operation.Square(entry2);
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.convertToBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }

        else if(operatorClicked.equals("sqrt")){
            Integer result = operation.SquareRoot(entry2);
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.convertToBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }

        */

    }

    public void clearField(){
        field.clear();
    }

    }

