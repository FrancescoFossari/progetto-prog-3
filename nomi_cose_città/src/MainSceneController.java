
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
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

   

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       
        Cnome.setCellValueFactory(new PropertyValueFactory<riga, String>("nome"));
        Ccose.setCellValueFactory(new PropertyValueFactory<riga, String>("cose"));
        Ccitta.setCellValueFactory(new PropertyValueFactory<riga, String>("citta"));
        setupTable();
    }

    @FXML
    void submit(ActionEvent event) {
        ObservableList<riga> currentTableData = GG.getItems();
      

        for (riga categoria : currentTableData) {
                categoria.setNome(InputNome.getText()); 
                categoria.setCose(InputCose.getText());
                categoria.setCitta(InputCitta.getText());

                GG.setItems(currentTableData);
                GG.refresh();
                break;
            
        }
    }

    

    private void setupTable(){
        riga gg0 = new riga("","hhh","Buddy");
        riga gg1 = new riga("","Cat","Bella");
        riga gg2 = new riga("","Bear","Bob");
        riga gg3 = new riga("","Squid","Laila");
        GG.getItems().addAll(gg0,gg1,gg2,gg3);
    }

    @FXML
    void plusRow(ActionEvent event) {
    ObservableList<riga> TT = GG.getItems();

    riga row = new riga("","","");
    TT.add(row);
    
    }
}

