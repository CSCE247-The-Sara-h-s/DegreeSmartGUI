package degreesmart.project;

import java.io.IOException;
import javafx.fxml.FXML;

public class StudentGraduationPlanController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}