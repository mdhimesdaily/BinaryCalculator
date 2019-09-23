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

    public Integer plusclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        System.out.println(entry1);
        operatorClicked = "+";
        field.clear();
        return Integer.parseInt(entry1);
    }

    public Integer minusclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "-";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public Integer multclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "x";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public Integer divclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "/";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public Integer sqclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "sq";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public Integer sqrtclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.convertToDecimal(field.getText()));
        operatorClicked = "sqrt";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public void equalsclick(){
        Operator operation = new Operator();
        Convert converter = new Convert();
        int entry2 =  converter.convertToDecimal(field.getText());

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

