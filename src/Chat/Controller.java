package Chat;

import com.sun.xml.internal.ws.resources.SenderMessages;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField1;
    @FXML
    TextField textField2;

    public void sendMassage1() {
        textArea.appendText("Пользователь 1: " + textField1.getText() + "\n");
        textField1.clear();
        textField1.requestFocus();

    }

    public void sendMassage2() {
        textArea.appendText("Пользователь 2: " + textField2.getText() + "\n");
        textField2.clear();
        textField2.requestFocus();
    }
}
