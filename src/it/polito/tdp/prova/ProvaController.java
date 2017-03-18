package it.polito.tdp.prova;

import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ProvaController {
	
	List<Pizza> pizze = new LinkedList<Pizza>();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> cmbxPizze;

    @FXML
    private TextField txtQuantita;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextField txtCosto;

    @FXML
    void doCalcolaImporto(ActionEvent event) {
    	//Pizza p = cmbxPizze.getValue();

    }

    @FXML
    void initialize() {
        assert cmbxPizze != null : "fx:id=\"cmbxPizze\" was not injected: check your FXML file 'Prova.fxml'.";
        assert txtQuantita != null : "fx:id=\"txtQuantita\" was not injected: check your FXML file 'Prova.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Prova.fxml'.";
        assert txtCosto != null : "fx:id=\"txtCosto\" was not injected: check your FXML file 'Prova.fxml'.";
        
        /*cmbxPizze.getItems().addAll(new String(pizze.get(0).getNome()), new String(pizze.get(1).getNome()),
        		new String(pizze.get(2).getNome()),
        		new String(pizze.get(3).getNome()), new String(pizze.get(4).getNome()), new String(pizze.get(5).getNome()));*/
        
        //cmbxPizze.getItems().addAll(0, 1, 2, 3, 4, 5);
       // cmbxPizze.setValue(pizze.get(0).getNome());
        
        pizze.add(new Pizza("Margherita", 5.50));
        pizze.add(new Pizza("Wurstel", 6.00));
        pizze.add(new Pizza("Funghi", 6.00));
        pizze.add(new Pizza("Prosciutto", 6.50));
        pizze.add(new Pizza("Greca", 6.50));
        pizze.add(new Pizza("Bufala", 8.00));
        
    }
}

