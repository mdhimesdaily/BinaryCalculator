import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

        private Object operatorClicked;
        private Integer entry1;
        @FXML private TextField field;

    void setMain(){
    }

    public void zeroclick(){
        String temp = field.getText();

        if(temp.equals("ERROR: Divide by Zero") || temp.equals("ERROR: Negative Number")) {
            field.clear();
        }

        if(temp.length() < 5) {
            field.setText(temp + '0');
        }
    }

    public void oneclick() {
        String temp = field.getText();

        if(temp.equals("ERROR: Divide by Zero") || temp.equals("ERROR: Negative Number")) {
            field.clear();
        }

        if(temp.length() < 5) {
            field.setText(temp + '1');
        }
    }

    public void plusclick(){
        if(!field.getText().isEmpty()) {
            Convert converter = new Convert();
            entry1 = converter.convertToDecimal(field.getText());
            System.out.println(entry1);
            operatorClicked = "+";
            field.clear();
        }
    }

    public void minusclick(){
        if(!field.getText().isEmpty()) {
            Convert converter = new Convert();
            entry1 = converter.convertToDecimal(field.getText());
            operatorClicked = "-";
            field.clear();
        }
    }

    public void multclick(){
        if(!field.getText().isEmpty()) {
            Convert converter = new Convert();
            entry1 = converter.convertToDecimal(field.getText());
            operatorClicked = "x";
            field.clear();
        }
    }

    public void divclick(){
        if(!field.getText().isEmpty()) {
            Convert converter = new Convert();
            entry1 = converter.convertToDecimal(field.getText());
            operatorClicked = "/";
            field.clear();
        }
    }

    public void sqclick(){
        if(!field.getText().isEmpty()) {
            Operator operation = new Operator();
            Convert converter = new Convert();
            entry1 = converter.convertToDecimal(field.getText());
            Integer result = operation.square(entry1);
            result = converter.convertToBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }
    }

    public void sqrtclick(){
        if(!field.getText().isEmpty()) {
            Operator operation = new Operator();
            Convert converter = new Convert();
            entry1 = converter.convertToDecimal(field.getText());
            Integer result = operation.squareRoot(entry1);
            result = converter.convertToBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }
    }

    public void equalsclick(){
        if(entry1 != null) {
            Operator operation = new Operator();
            Convert converter = new Convert();
            int entry2 = 0;
            if(!field.getText().isEmpty()){
                entry2 = converter.convertToDecimal(field.getText());
            }
            System.out.println(entry2);
            if (operatorClicked.equals("+")) {
                Integer result = operation.addition(entry1, entry2);
                result = converter.convertToBinary(result);
                System.out.println(result);
                field.setText(String.valueOf(result));
            } else if (operatorClicked.equals("-")) {

                if (entry1 > entry2) {

                    Integer result = operation.subtraction(entry1, entry2);
                    result = converter.convertToBinary(result);
                    System.out.println(result);
                    field.setText(String.valueOf(result));

                } else {

                    field.setText("ERROR: Negative Number");

                }
            } else if (operatorClicked.equals("x")) {
                Integer result = operation.multiplication(entry1, entry2);
                result = converter.convertToBinary(result);
                System.out.println(result);
                field.setText(String.valueOf(result));
            } else if (operatorClicked.equals("/")) {

                if (entry2 != 0) {

                    Integer result = operation.division(entry1, entry2);
                    result = converter.convertToBinary(result);
                    System.out.println(result);
                    field.setText(String.valueOf(result));

                } else {

                    field.setText("ERROR: Divide by Zero");

                }
            }
        }

        operatorClicked = "";
    }

    public void clearField(){
        field.clear();
    }

    }

