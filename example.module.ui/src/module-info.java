module example.module.ui {
    requires example.module.db;
    requires javafx.controls;
    requires javafx.fxml;

    opens example.module.ui to javafx.fxml;
    exports example.module.ui to javafx.graphics, javafx.fxml;

}