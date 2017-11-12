import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.StageStyle;
import java.util.Scanner;




public class Factorial extends Application {


    public static void Factorial(String args[]) {

    }

    @Override
    public void start(Stage Primarystage) throws Exception {
        Text text = new Text();
        text.setFont(new Font(25));

        Label label = new Label("Enter number");
        label.setAlignment(Pos.TOP_CENTER);
        label.setFont(new Font(18));

        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 0);

        TextField textField = new TextField();
        HBox hi = new HBox();

        hi.getChildren().addAll(label, textField, text, submit);
        hi.setSpacing(10);

        Group group = new Group(hi);
        Scene scene = new Scene(group, 400, 200);

        Primarystage.initStyle(StageStyle.UTILITY);
        Primarystage.setTitle("finding a factorial,odd and Fibonacci numbers");
        Primarystage.setScene(scene);
        Primarystage.sizeToScene();
        Primarystage.show();


        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int n;
                textField.getText();

                Scanner scan2 = new Scanner(textField.getText());

                n = scan2.nextInt();
                int factorial = 1;

                for (int i = n; i > 1; i--) {

                    factorial = i * factorial;
                }
                System.out.println("Factorial number is" + factorial);

                int[] Odds = new int[n];
                for (int i = 0; i < n; i++) {
                    Odds[i] = 2 * i + 1;
                    System.out.println("odd numbern is " + Odds[i]);

                }
                int n1 = 0, n2 = 1;
                for (int i = 1; i <= n; i++) {

                    System.out.println("Fibonacci number is " + n1 + "");
                    n1 = n1 + n2;
                    n2 = n1 + n2;
                }

            }
        });
    }


}























