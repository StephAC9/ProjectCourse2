package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewAdmin implements Initializable,ControlledScenes {
    private ScenesController myController;
    private String fxmlFileName="manageadmin.fxml";

    @FXML private Button returnBtn;
    @FXML private Label userName;
    @FXML private Label principalName;
    @FXML private Label principalEmail;
    @FXML private Label principalTel;
    @FXML private Label itManagerName;
    @FXML private Label itMangerEmail;
    @FXML private Label itManagerTel;
    @FXML private Label secretaryName;
    @FXML private Label secretaryEmail;
    @FXML private Label secretaryTel;
    @FXML private Label humanResName;
    @FXML private Label humanResEmail;
    @FXML private Label humanResTel;
    @FXML private MenuButton updateAdmin;
    @FXML private MenuItem principal;
    @FXML private MenuItem It_System;
    @FXML private MenuItem humanRessources;
    @FXML private MenuItem secretary;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML private void updatePrincipal()throws IOException{
        myController.popUpStage(fxmlFileName);

    }

    @FXML private void updateIt_System()throws IOException{
        myController.popUpStage(fxmlFileName);

    }
    @FXML private void updateHumanRessources()throws IOException{
        myController.popUpStage(fxmlFileName);

    }
    @FXML private void updateSecretary()throws IOException{
        myController.popUpStage(fxmlFileName);

    }


    @FXML private void handleReturnBtn()throws IOException{
        myController.setScenes(SchoolAppFramework.adminSceneID);
    }

    @Override
    public void setScreenParent(ScenesController screenController) {
        myController=screenController;

    }
}
