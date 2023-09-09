package com.example.csc_311_loanapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoanCalculatorController {
    @FXML
    private TextField loanAmountField;
    @FXML
    private TextField interestRateField;
    @FXML
    private TextField yearsField;
    @FXML
    private Label monthlyPaymentLabel;
    @FXML
    private Label totalPaymentLabel;

    @FXML
    protected void calculatePayment() {
        // Get input values
        double loanAmount = Double.parseDouble(loanAmountField.getText());
        double annualInterestRate = Double.parseDouble(interestRateField.getText());
        double numberOfYears = Double.parseDouble(yearsField.getText());

        // Perform loan calculation
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        double numberOfPayments = numberOfYears * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        // Display results
        monthlyPaymentLabel.setText(String.format("$%.2f", monthlyPayment));
        totalPaymentLabel.setText(String.format("$%.2f", totalPayment));
    }
}
