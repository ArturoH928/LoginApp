module com.login.loginapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.login.loginapp to javafx.fxml;
    exports com.login.loginapp;
}