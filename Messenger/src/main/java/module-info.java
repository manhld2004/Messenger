module gui.messenger {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui.messenger to javafx.fxml;
    exports gui.messenger;
}