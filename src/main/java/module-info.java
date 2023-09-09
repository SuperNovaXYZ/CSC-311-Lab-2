module com.example.csc_311_loanapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.csc_311_loanapp to javafx.fxml;
    exports com.example.csc_311_loanapp;
}
