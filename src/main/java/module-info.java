module birds.ensisa {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    opens birds.ensisa to javafx.fxml, com.fasterxml.jackson.databind;
    exports birds.ensisa;
    exports birds.ensisa.model;
}
