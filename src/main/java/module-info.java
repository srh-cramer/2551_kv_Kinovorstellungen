module com.cramer._551_kv_kinovorstellungen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.cramer._551_kv_kinovorstellungen to javafx.fxml;
    exports com.cramer._551_kv_kinovorstellungen;
    exports com.cramer._551_kv_kinovorstellungen.controller;
    opens com.cramer._551_kv_kinovorstellungen.controller to javafx.fxml;
}