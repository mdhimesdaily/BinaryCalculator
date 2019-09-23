import com.sun.javafx.scene.layout.region.Margins;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

        private Object operatorClicked;
        private String entry1;
        @FXML private Label label;
        @FXML private TextField field;

    void setMain(Main main){
    }

        public void zeroclick(){
            entry1= field.getText();
            //if(entry1.length() < 5) {
                field.setText(entry1 + '0');
            //}
        }

    public void oneclick() {
        entry1 = field.getText();
        //if (entry1.length() < 5) {
            field.setText(entry1 + '1');
        //}
    }

    public Integer plusclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.ConverttoDecimal(field.getText()));
        operatorClicked = "+";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public Integer minusclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.ConverttoDecimal(field.getText()));
        operatorClicked = "-";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public Integer multclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.ConverttoDecimal(field.getText()));
        operatorClicked = "x";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public Integer divclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.ConverttoDecimal(field.getText()));
        operatorClicked = "/";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public Integer sqclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.ConverttoDecimal(field.getText()));
        operatorClicked = "sq";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public Integer sqrtclick(){
        Convert converter = new Convert();
        entry1= String.valueOf(converter.ConverttoDecimal(field.getText()));
        operatorClicked = "sqrt";
        field.clear();

        return Integer.parseInt(entry1);
    }

    public void equalsclick(){
        String entry2 =  field.getText();
        Operator operation = new Operator();
        Convert converter = new Convert();
        if(operatorClicked.equals("+")){
            Integer result = operation.Addition(Integer.parseInt(entry1), Integer.parseInt(entry2));
            result = converter.ConverttoBinary(result);
            field.setText(String.valueOf(result));
        }

        else if(operatorClicked.equals("-")){
            Integer result = operation.Subtraction(Integer.parseInt(entry1), Integer.parseInt(entry2));
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.ConverttoBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }

        else if(operatorClicked.equals("x")){
            Integer result = operation.Multiplication(Integer.parseInt(entry1), Integer.parseInt(entry2));
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.ConverttoBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }

        else if(operatorClicked.equals("/")){
            Integer result = operation.Division(Integer.parseInt(entry1), Integer.parseInt(entry2));
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.ConverttoBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }
/*
        else if(operatorClicked.equals("sq")){
            Integer result = operation.Square(Integer.parseInt(entry2));
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.ConverttoBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }

        else if(operatorClicked.equals("sqrt")){
            Integer result = operation.SquareRoot(Integer.parseInt(entry2));
            System.out.println(entry1);
            System.out.println(entry2);
            result = converter.ConverttoBinary(result);
            System.out.println(result);
            field.setText(String.valueOf(result));
        }

        */

    }

    public void clearField(){
        field.clear();
    }

    }

