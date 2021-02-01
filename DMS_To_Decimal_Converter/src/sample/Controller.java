package sample;

import javafx.fxml.FXML;

public class Controller{
    //input fields
    @FXML
    private double degreesInput;
    @FXML
    private double minutesInput;
    @FXML
    private double secondsInput;
    @FXML
    private double decimalInput;

    //output fields
    @FXML
    private double degreesOutput;
    @FXML
    private double minutesOutput;
    @FXML
    private double secondsOutput;
    @FXML
    private double decimalOutput;

    public void DMSToDecimal() {
        this.secondsInput /= 3600;
        this.minutesInput /= 60;
        this.degreesInput = this.degreesInput + this.minutesInput + this.secondsInput;
        double number = (Math.round(this.degreesInput * 1000));
        number /= 1000;

        // do whatever output here
        System.out.println("Decimal Output: " + number);
    }

    public void decimalToDMS() {
        this.degreesOutput = Math.floor(this.decimalInput); // rounds down the double
        double minutesAndSeconds = (this.decimalInput % 1) * 60; // multiplies the decimal by 60 to give us minutes & seconds.
        this.minutesOutput = Math.floor(minutesAndSeconds); // rounds down the previous decimal to give us just the minutes.
        this.secondsOutput = Math.round((minutesAndSeconds % 1) * 60);

        // do whatever output here
//        System.out.println("Degrees: " + degrees);
//        System.out.println("Minutes: " + minutes);
//        System.out.println("Seconds: " + seconds);
    }
}
