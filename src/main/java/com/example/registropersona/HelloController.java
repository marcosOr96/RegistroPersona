package com.example.registropersona;


import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML private ImageView iconoTienda;
    @FXML private ImageView iconoCliente;
    @FXML private ImageView iconoCamara;
    @FXML private ImageView iconoMarca;
    @FXML private ImageView iconoModelo;
    @FXML private ImageView iconoPelicula;

    @FXML private AnchorPane pageTienda;
    @FXML private AnchorPane pageCliente;
    @FXML private AnchorPane pageCamara;
    @FXML private AnchorPane pageMarca;
    @FXML private AnchorPane pageModelo;
    @FXML private AnchorPane pagePelicula;

    @FXML private ComboBox<String> comboBoxDI;
    @FXML private ComboBox<String> comboBoxCamara;
    @FXML private ComboBox<String> comboBoxPelicula;
    @FXML private ComboBox<String> comboBoxItem;

    ObservableList<String> comboDIContent=
            FXCollections.observableArrayList(
                    "C.C",
                            "C.E",
                            "T.I",
                            "PASAPORTE"
            );

    ObservableList<String> comboCamaraContent=
            FXCollections.observableArrayList(
                    "Canon",
                    "Samsung",
                    "LG",
                    "Xiaomi"
            );

    ObservableList<String> comboPeliculaContent=
            FXCollections.observableArrayList(
                    "Fuji",
                    "Cassio",
                    "Redmy"
            );

    ObservableList<String> comboItemContent=
            FXCollections.observableArrayList(
                    "Alquilado",
                    "En reparación",
                    "Disponible"
            );


    public void initialize(URL location, ResourceBundle resources) {
        comboBoxDI.setItems(comboDIContent);
        comboBoxCamara.setItems(comboCamaraContent);
        comboBoxPelicula.setItems(comboPeliculaContent);
        comboBoxItem.setItems(comboItemContent);
    }

    public void onTiendaButtonClicked(MouseEvent event){
        iconoTienda.setVisible(true);
        pageTienda.setVisible(true);

        pageCliente.setVisible(false);
        pageCamara.setVisible(false);
        pageMarca.setVisible(false);
        pageModelo.setVisible(false);
        pagePelicula.setVisible(false);
    }

    public void onClienteButtonClicked(MouseEvent event){
        iconoCliente.setVisible(true);
        pageCliente.setVisible(true);

        pageTienda.setVisible(false);
        pageCamara.setVisible(false);
        pageMarca.setVisible(false);
        pageModelo.setVisible(false);
        pagePelicula.setVisible(false);
    }

    public void onCamaraButtonClicked(MouseEvent event){
        iconoCamara.setVisible(true);
        pageCamara.setVisible(true);

        pageCliente.setVisible(false);
        pageTienda.setVisible(false);
        pageMarca.setVisible(false);
        pageModelo.setVisible(false);
        pagePelicula.setVisible(false);
    }

    public void onMarcaButtonClicked(MouseEvent event){
        iconoMarca.setVisible(true);
        pageMarca.setVisible(true);

        pageCliente.setVisible(false);
        pageCamara.setVisible(false);
        pageTienda.setVisible(false);
        pageModelo.setVisible(false);
        pagePelicula.setVisible(false);
    }

    public void onModeloButtonClicked(MouseEvent event){
        iconoModelo.setVisible(true);
        pageModelo.setVisible(true);

        pageCliente.setVisible(false);
        pageCamara.setVisible(false);
        pageMarca.setVisible(false);
        pageTienda.setVisible(false);
        pagePelicula.setVisible(false);
    }

    public void onPeliculaButtonClicked(MouseEvent event){
        iconoPelicula.setVisible(true);
        pagePelicula.setVisible(true);

        pageCliente.setVisible(false);
        pageCamara.setVisible(false);
        pageMarca.setVisible(false);
        pageModelo.setVisible(false);
        pageTienda.setVisible(false);
    }
}