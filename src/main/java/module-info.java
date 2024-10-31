module org.example.ihmeval {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.univartois.butinfo.ihm.converter to javafx.fxml;
    exports fr.univartois.butinfo.ihm.converter;
}