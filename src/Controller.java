import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

        private Convert converter = new Convert();
        private  Operator operation = new Operator();

        private Object operatorClicked;
        private Integer entry1;
        @FXML private TextField field;

    void setMain() {

    }

    public void zeroclick() {

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


    public void plusclick() {

        if(field.getText().equals("ERROR: Divide by Zero") || field.getText().equals("ERROR: Negative Number")) {

            field.clear();

        } else if(!field.getText().isEmpty()) {

            entry1 = converter.convertToDecimal(field.getText());
            operatorClicked = "+";

            field.clear();
        }
    }


    public void minusclick() {

        if(field.getText().equals("ERROR: Divide by Zero") || field.getText().equals("ERROR: Negative Number")) {

            field.clear();

        } else if(!field.getText().isEmpty()) {

            entry1 = converter.convertToDecimal(field.getText());
            operatorClicked = "-";

            field.clear();
        }
    }


    public void multclick() {

        if(field.getText().equals("ERROR: Divide by Zero") || field.getText().equals("ERROR: Negative Number")) {

            field.clear();

        } else if(!field.getText().isEmpty()) {

            entry1 = converter.convertToDecimal(field.getText());
            operatorClicked = "x";

            field.clear();
        }
    }


    public void divclick() {

        if(field.getText().equals("ERROR: Divide by Zero") || field.getText().equals("ERROR: Negative Number")) {

            field.clear();

        } else if(!field.getText().isEmpty()) {

            entry1 = converter.convertToDecimal(field.getText());
            operatorClicked = "/";

            field.clear();
        }
    }


    public void sqclick() {

        if(field.getText().equals("ERROR: Divide by Zero") || field.getText().equals("ERROR: Negative Number")) {

            field.clear();

        } else if(!field.getText().isEmpty()) {

            Integer result = 0;

            entry1 = converter.convertToDecimal(field.getText());
            result = operation.square(entry1);
            result = converter.convertToBinary(result);

            field.setText(String.valueOf(result));
        }
    }


    public void sqrtclick() {

        if(field.getText().equals("ERROR: Divide by Zero") || field.getText().equals("ERROR: Negative Number")) {

            field.clear();

        } else if(!field.getText().isEmpty()) {

            Integer result = 0;

            entry1 = converter.convertToDecimal(field.getText());
            result = operation.squareRoot(entry1);
            result = converter.convertToBinary(result);

            field.setText(String.valueOf(result));
        }
    }

    public void equalsclick() {

        if(entry1 != null) {

            Integer entry2 = 0;
            Integer result = 0;

            if(!field.getText().isEmpty()){

                entry2 = converter.convertToDecimal(field.getText());
            }


            if (operatorClicked.equals("+")) {

                result = operation.addition(entry1, entry2);
                result = converter.convertToBinary(result);

                field.setText(String.valueOf(result));


            } else if (operatorClicked.equals("-")) {

                if (entry1 > entry2) {

                    result = operation.subtraction(entry1, entry2);
                    result = converter.convertToBinary(result);

                    field.setText(String.valueOf(result));

                } else {

                    field.setText("ERROR: Negative Number");

                }


            } else if (operatorClicked.equals("x")) {

                result = operation.multiplication(entry1, entry2);
                result = converter.convertToBinary(result);

                field.setText(String.valueOf(result));


            } else if (operatorClicked.equals("/")) {

                if (entry2 != 0) {

                    result = operation.division(entry1, entry2);
                    result = converter.convertToBinary(result);

                    field.setText(String.valueOf(result));

                } else {

                    field.setText("ERROR: Divide by Zero");

                }
            }
        }

        operatorClicked = "";
    }


    public void clearField() {
        field.clear();
    }

}

