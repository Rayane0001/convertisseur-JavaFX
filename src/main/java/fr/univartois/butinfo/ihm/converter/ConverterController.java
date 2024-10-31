package fr.univartois.butinfo.ihm.converter;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class ConverterController {

    @FXML
    private Label montantDollars;

    @FXML
    private TextField montantDollarsEntre;

    @FXML
    private Label montantEuros;

    @FXML
    private TextField montantEurosEntre;

    @FXML
    private Label montantLivres;

    @FXML
    private TextField montantLivresEntre;

    @FXML
    private Label montantYens;

    @FXML
    private TextField montantYensEntre;

    @FXML
    private Label welcomeText;

    @FXML
    void recupMontantDollars(ActionEvent event) {
        String text = montantDollarsEntre.getText();
        double value = Double.parseDouble(text);

        // Convertir en euros
        double valeurEnEuros = value * 0.93;
        montantEurosEntre.setText(String.format("%.2f", valeurEnEuros));

        // Convertir en livres
        double valeurEnLivres = valeurEnEuros / 1.16;
        montantLivresEntre.setText(String.format("%.2f", valeurEnLivres));

        // Convertir en yens
        double valeurEnYens = valeurEnEuros / 0.0060;
        montantYensEntre.setText(String.format("%.2f", valeurEnYens));
    }

    @FXML
    void recupMontantEuros(ActionEvent event) {
        String text = montantEurosEntre.getText();
        double value = Double.parseDouble(text);

        // Convertir en dollars
        double valeurEnDollars = value / 0.93;
        montantDollarsEntre.setText(String.format("%.2f", valeurEnDollars));

        // Convertir en livres
        double valeurEnLivres = value / 1.16;
        montantLivresEntre.setText(String.format("%.2f", valeurEnLivres));

        // Convertir en yens
        double valeurEnYens = value / 0.0060;
        montantYensEntre.setText(String.format("%.2f", valeurEnYens));
    }

    @FXML
    void recupMontantLivres(ActionEvent event) {
        String text = montantLivresEntre.getText();
        double value = Double.parseDouble(text);

        // Convertir en euros
        double valeurEnEuros = value * 1.16;
        montantEurosEntre.setText(String.format("%.2f", valeurEnEuros));

        // Convertir en dollars
        double valeurEnDollars = valeurEnEuros / 0.93;
        montantDollarsEntre.setText(String.format("%.2f", valeurEnDollars));

        // Convertir en yens
        double valeurEnYens = valeurEnEuros / 0.0060;
        montantYensEntre.setText(String.format("%.2f", valeurEnYens));
    }

    @FXML
    void recupMontantYens(ActionEvent event) {
        String text = montantYensEntre.getText();
        double value = Double.parseDouble(text);

        // Convertir en euros
        double valeurEnEuros = value * 0.0060;
        montantEurosEntre.setText(String.format("%.2f", valeurEnEuros));

        // Convertir en dollars
        double valeurEnDollars = valeurEnEuros / 0.93;
        montantDollarsEntre.setText(String.format("%.2f", valeurEnDollars));

        // Convertir en livres
        double valeurEnLivres = valeurEnEuros / 1.16;
        montantLivresEntre.setText(String.format("%.2f", valeurEnLivres));
    }
}