module com.mycompany.java23project {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.java23project to javafx.fxml;
    exports com.mycompany.java23project;
}
