module degreesmart.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens degreesmart.project to javafx.fxml;
    exports degreesmart.project;
}
