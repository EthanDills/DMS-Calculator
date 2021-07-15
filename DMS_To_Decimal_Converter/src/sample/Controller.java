package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller{
    //input fields
    @FXML
    private TextField degreesInput;
    @FXML
    private TextField minutesInput;
    @FXML
    private TextField secondsInput;
    @FXML
    private TextField decimalInput;

    //output fields
    @FXML
    private TextField degreesOutput;
    @FXML
    private TextField minutesOutput;
    @FXML
    private TextField secondsOutput;
    @FXML
    private TextField decimalOutput;

    // TODO account for incorrect user input

    public void DMSToDecimal() {
        Double dInput = Double.parseDouble(this.degreesInput.getText());
        Double mInput = Double.parseDouble(this.minutesInput.getText());
        Double sInput = Double.parseDouble(this.secondsInput.getText());

        sInput /= 3600;
        mInput /= 60;
        dInput = dInput + mInput + sInput;
        double number = (Math.round(dInput * 1000));
        number /= 1000;
        Double newNum = number;

        // do whatever output here
        this.decimalOutput.setText(newNum.toString());
    }

    public void decimalToDMS() {
        Double decimalInput = Double.parseDouble(this.decimalInput.getText());

        Double degrees =  Math.floor(decimalInput); // rounds down the double
        Double minutesAndSeconds = (decimalInput % 1) * 60; // multiplies the decimal by 60 to give us minutes & seconds.
        Double minutes = Math.floor(minutesAndSeconds); // rounds down the previous decimal to give us just the minutes.
        double seconds = Math.round((minutesAndSeconds % 1) * 60);
        Double newSecs = seconds;

        // do whatever output here
        this.degreesOutput.setText(degrees.toString());
        this.minutesOutput.setText(minutes.toString());
        this.secondsOutput.setText(newSecs.toString());

    }
}
