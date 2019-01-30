package sample;


import javax.swing.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.util.*;
import java.text.*;



public class Main extends Application {

    public Button button;
    public TextField textMsg;
    public TextArea textArea;


    public void initialize() {
        OnChatStart();
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Мой чат -  2019  v.1.0");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();


    }


    public static void main(String[] args) {

        launch(args);


    }


   public void OnChatStart(){

       Date dateNow = new Date();
       SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
       textArea.appendText("\n Добро пожаловать! Cегодня - " + formatForDateNow.format(dateNow) + "\n");
       textArea.appendText(" -------------------------------------------------------------------------\n\n");
   }

    public void SendMsgChat(ActionEvent actionEvent) {



        if (textMsg.getText().length() > 0) {

            Date dateNow = new Date();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");
            textArea.appendText("[" + formatForDateNow.format(dateNow) + "] : " + textMsg.getText() + "\n");
            textMsg.setText(""); // чистем поле после
            textMsg.requestFocus();
            //textArea.setCaretPosition(textArea.getDocument().getLength());
            //textArea.appendText(textMsg.getText()+ "\n");
            //textMsg.setText("");
        } else {
            infoBox("А сообщение кто, Пушкин писать будет?!", "ОШИБКАААААААААААА!");
            textMsg.requestFocus();
            ;
            //textArea.setForeground(Color.red);
            // textArea.append("Ты забыл написать сообщение...\n");
        }
    }
        public void infoBox(String infoMessage, String titleBar)
        {
            JOptionPane.showMessageDialog(null, infoMessage, "Упс: " + titleBar, JOptionPane.ERROR_MESSAGE);
        }
    }

