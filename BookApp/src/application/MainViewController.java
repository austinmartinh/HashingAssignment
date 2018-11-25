package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainViewController implements Initializable {
	@FXML Button addBookButton;
	
	
	
	public void changeSceneToAddBookScene(ActionEvent event) throws IOException {
		Parent BookAddFacility = FXMLLoader.load(getClass().getResource("BookAdd.fxml"));
		Scene BookAddFacilityview = new Scene(BookAddFacility);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(BookAddFacilityview);
		window.show();
	}
	
	public void changeSceneToAddCharacterScene(ActionEvent event) throws IOException {
		Parent BookAddFacility = FXMLLoader.load(getClass().getResource("CharacterAdd.fxml"));
		Scene BookAddFacilityview = new Scene(BookAddFacility);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(BookAddFacilityview);
		window.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	

}
