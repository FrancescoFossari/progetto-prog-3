
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
public class MainSceneController implements Initializable{


    @FXML
    private TableView<riga> GG;

    @FXML
    private TableColumn<riga, String> Cnome;

    @FXML
    private TableColumn<riga, String> Ccose;

    @FXML
    private TableColumn<riga, String> Ccitta;

    @FXML
    private TextField InputNome;

    @FXML
    private TextField InputCose;

    @FXML
    private TextField InputCitta;

     @FXML
    private Label Lettera;

   

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       
        Cnome.setCellValueFactory(new PropertyValueFactory<riga, String>("nome"));
        Ccose.setCellValueFactory(new PropertyValueFactory<riga, String>("cose"));
        Ccitta.setCellValueFactory(new PropertyValueFactory<riga, String>("citta"));
        GG.getItems();
    }

    @FXML
    void submit(ActionEvent event) {
        ObservableList<riga> TT = GG.getItems();
      

                riga row = new riga("","","");

                row.setNome(InputNome.getText()); 
                row.setCose(InputCose.getText());
                row.setCitta(InputCitta.getText());

                TT.add(row);

                GG.setItems(TT);
                GG.refresh();
        
    }


    @FXML
    void randomChar(ActionEvent event) {
        Random random = new Random();
        int randomInt = random.nextInt(26);
        char randomLetter = (char) ('A' + randomInt);
       
        Lettera.setText(String.valueOf(randomLetter));
    
    }
}

