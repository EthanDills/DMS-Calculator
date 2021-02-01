package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("DMS Calculator");
        primaryStage.setScene(new Scene(root, 450, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
//        decimalToDMS(10.413);
//        DMSToDecimal(10, 24, 47);
    }
//
//    public static void decimalToDMS(double number) {
//        double degrees = Math.floor(number); // rounds down the double
//        double minutesAndSeconds = (number % 1) * 60; // multiplies the decimal by 60 to give us minutes & seconds.
//        double minutes = Math.floor(minutesAndSeconds); // rounds down the previous decimal to give us just the minutes.
//        double seconds = Math.round((minutesAndSeconds % 1) * 60);
//
//        // do whatever output here
//        System.out.println("Degrees: " + degrees);
//        System.out.println("Minutes: " + minutes);
//        System.out.println("Seconds: " + seconds);
//    }
//
//    public static void DMSToDecimal(double degrees, double minutes, double seconds) {
//        seconds /= 3600;
//        minutes /= 60;
//        degrees = degrees + minutes + seconds;
//        double number = (Math.round(degrees * 1000));
//        number /= 1000;
//
//        // do whatever output here
//        System.out.println("Decimal Output: " + number);
//    }
}
