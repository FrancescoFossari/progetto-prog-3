import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
public class MainSceneController implements Initializable{

    @FXML
    private TableView<Tabella> GG;

    @FXML
    private VBox Vbox;

    @FXML
    private Label Lettera;

    @FXML
    private Button Nome;

    @FXML
    private Button Cose;

    @FXML
    private Button Citta;

    @FXML
    private Button Frutta;

    @FXML
    private Button RL;

    

   int cont = 0;
   boolean ColNome = false;
   boolean ColCosa = false;
   boolean ColCitta = false;
   boolean ColFrutta = false;
   boolean RandomCharButton = true;
   TableColumn<Tabella, String> Cnome = new TableColumn<>("Nome");
   TableColumn<Tabella, String> Ccose = new TableColumn<>("Cosa");
   TableColumn<Tabella, String> Ccitta = new TableColumn<>("Cittá");
   TableColumn<Tabella, String> Cfrutta = new TableColumn<>("Frutta");
   Label label1 = new Label("Nome: ");
   Label label2 = new Label("Cose: ");
   Label label3 = new Label("Cittá: ");
   Label label4 = new Label("Frutta: ");
   TextField Campo1 = new TextField();
   TextField Campo2 = new TextField();
   TextField Campo3 = new TextField();
   TextField Campo4 = new TextField();


    

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       
       // Cnome.setCellValueFactory(new PropertyValueFactory<Tabella, String>("nome"));
        //Ccose.setCellValueFactory(new PropertyValueFactory<Tabella, String>("cose"));
        //Ccitta.setCellValueFactory(new PropertyValueFactory<Tabella, String>("citta"));
        GG.getItems();
        GG.setVisible(false);
    }

    
    @FXML
    void colonna1(ActionEvent event) {
    double nuovaLarghezza;
    if(ColNome == false){
        
        Cnome.setCellValueFactory(new PropertyValueFactory<Tabella, String>("nome"));
        GG.getColumns().add(Cnome);

        nuovaLarghezza = GG.getWidth() + 150.0; 
        
        Vbox.getChildren().addAll(label1,Campo1);

        cont += 1;


        
        if (cont >= 2) {
            
            GG.setVisible(true);

        }

        GG.setMinWidth(nuovaLarghezza);
        GG.setPrefWidth(nuovaLarghezza);
        GG.setMaxWidth(Double.MAX_VALUE);
        Cnome.setMinWidth(nuovaLarghezza / cont); 

        
            ColNome = true;
        
    }else{
            GG.getColumns().remove(Cnome);
            Vbox.getChildren().removeAll(label1, Campo1);
            nuovaLarghezza = GG.getWidth() - 150.0; 
            GG.setMinWidth(nuovaLarghezza);
            GG.setPrefWidth(nuovaLarghezza);
            GG.setMaxWidth(Double.MAX_VALUE);
            Cnome.setMinWidth(nuovaLarghezza / cont); 
            ColNome = false;
         }

    }

    @FXML
    void colonna2(ActionEvent event) {

    double nuovaLarghezza;
    if(ColCosa == false){
         Ccose.setCellValueFactory(new PropertyValueFactory<Tabella, String>("cosa"));
         GG.getColumns().add(Ccose);

         nuovaLarghezza = GG.getWidth() + 150.0; 
        

        
        
        Vbox.getChildren().addAll(label2,Campo2);

        cont += 1;


        
        if (cont >= 2) {
            
            GG.setVisible(true);
        }

        GG.setMinWidth(nuovaLarghezza);
        GG.setPrefWidth(nuovaLarghezza);
        GG.setMaxWidth(Double.MAX_VALUE);
        Ccose.setMinWidth(nuovaLarghezza / cont);
        ColCosa = true;
    }else{
            GG.getColumns().remove(Ccose);
            Vbox.getChildren().removeAll(label2, Campo2);
            nuovaLarghezza = GG.getWidth() - 150.0; 
            GG.setMinWidth(nuovaLarghezza);
            GG.setPrefWidth(nuovaLarghezza);
            GG.setMaxWidth(Double.MAX_VALUE);
            Ccose.setMinWidth(nuovaLarghezza / cont); 
            ColCosa = false;
    }

        

         
    }

    @FXML
    void colonna3(ActionEvent event) {
    double nuovaLarghezza;
    if(ColCitta==false){
        Ccitta.setCellValueFactory(new PropertyValueFactory<Tabella, String>("citta"));
         GG.getColumns().add(Ccitta);

        nuovaLarghezza = GG.getWidth() + 150.0; 
        

       
        
        Vbox.getChildren().addAll(label3,Campo3);

        
        cont += 1; 

       
        if (cont >= 2) {
            
            GG.setVisible(true);
        }

        GG.setMinWidth(nuovaLarghezza);
        GG.setPrefWidth(nuovaLarghezza);
        GG.setMaxWidth(Double.MAX_VALUE);
        Ccitta.setMinWidth(nuovaLarghezza / cont);
        ColCitta = true;
    }else{
            GG.getColumns().remove(Ccitta);
            Vbox.getChildren().removeAll(label3, Campo3);
            nuovaLarghezza = GG.getWidth() - 150.0; 
            GG.setMinWidth(nuovaLarghezza);
            GG.setPrefWidth(nuovaLarghezza);
            GG.setMaxWidth(Double.MAX_VALUE);
            Ccitta.setMinWidth(nuovaLarghezza / cont); 
            ColCitta = false;
    }
         

        

        

    }

    @FXML
    void colonna4(ActionEvent event) {
    double nuovaLarghezza;
    if(ColFrutta==false){
         Cfrutta.setCellValueFactory(new PropertyValueFactory<Tabella, String>("frutta"));
         GG.getColumns().add(Cfrutta);

         nuovaLarghezza = GG.getWidth() + 150.0; 
        

        
       
        Vbox.getChildren().addAll(label4,Campo4);

        cont += 1;

        
       
        if (cont >= 2) {
            
            GG.setVisible(true);
        }

        GG.setMinWidth(nuovaLarghezza);
        GG.setPrefWidth(nuovaLarghezza);
        GG.setMaxWidth(Double.MAX_VALUE);

        Cfrutta.setMinWidth(nuovaLarghezza / cont);
        ColFrutta = true;
    }else{
            GG.getColumns().remove(Cfrutta);
            Vbox.getChildren().removeAll(label4, Campo4);
            nuovaLarghezza = GG.getWidth() - 150.0; 
            GG.setMinWidth(nuovaLarghezza);
            GG.setPrefWidth(nuovaLarghezza);
            GG.setMaxWidth(Double.MAX_VALUE);
            Cfrutta.setMinWidth(nuovaLarghezza / cont); 
            ColFrutta = false;
    }
         

    }

    @FXML
    void submit(ActionEvent event) {
        ObservableList<Tabella> TT = GG.getItems();
      
        Builder builder = new Builder();

        if (ColNome) {
             builder.setNome(Campo1.getText());
        }
        if (ColCosa) {
             builder.setCosa(Campo2.getText());
        }
        if (ColCitta) {
             builder.setCitta(Campo3.getText());
        }
        if (ColFrutta) {
             builder.setFrutta(Campo4.getText());
        }


        Tabella row = builder.build();

        TT.add(row);

        GG.setItems(TT);
        GG.refresh();

        if(!RandomCharButton){
             RL.setVisible(true);
        }
        
    }

  


    @FXML
    void randomChar(ActionEvent event) {
        Random random = new Random();
        int randomInt = random.nextInt(26);
        char randomLetter = (char) ('A' + randomInt);
       
        Lettera.setText(String.valueOf(randomLetter));
        RL.setVisible(false);
        RandomCharButton = false;


    }
    
}
