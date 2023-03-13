module com.example.entregaexamenjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires jasperreports;
    requires java.desktop;
    requires java.sql;

    opens com.example.entregaexamenjavafx;
    exports com.example.entregaexamenjavafx to javafx.fxml;
    exports com.example.entregaexamenjavafx.model;
    opens com.example.entregaexamenjavafx.model;
}