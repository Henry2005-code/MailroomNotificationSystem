package com.example.demo;

//BulldogMailroomEmailingSystem

//Imports neccessities

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.function.*;
import java.io.*;
import java.util.prefs.Preferences;

public class TestRun extends Application{

    @Override

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Bulldog Mailroom Emailing System Application");

        // Create the Bulldog Mailroom Emailing System Application grid pane
        GridPane gridPane = createBulldogMailroomEmailingSystem();
        // Add UI controls to the Bulldog Mailroom Emailing System Application grid pane
        addUIControls(gridPane);
        // Create a scene with Bulldog Mailroom Emailing System Application grid pane
        Scene scene = new Scene(gridPane, 800, 500);
        // Sets application logo in the primary stage
        //primaryStage.getIcons().add(new Image("logo.png"));
        // Set the scene in primary stage
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private GridPane createBulldogMailroomEmailingSystem() {
        // Instantiate a new Grid Pane
        GridPane gridPane;
        gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 40px on each side
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        gridPane.setHgap(10);

        // Set the vertical gap between rows
        gridPane.setVgap(10);

        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);

        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {

        // Add Header
        Label headerLabel = new Label("Bulldog Mailroom Emailing System Application");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        gridPane.add(headerLabel, 0, 0, 2, 1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

        // Add firstName Label
        Label firstNameLabel = new Label("First Name : ");
        gridPane.add(firstNameLabel, 0, 1);

        // Add firstName Field
        TextField firstNameField = new TextField();
        firstNameField.setPrefHeight(40);
        gridPane.add(firstNameField, 1, 1);


        // Add lastName Label
        Label lastNameLabel = new Label("Last Name : ");
        gridPane.add(lastNameLabel, 0, 2);

        // Add last Name Field
        TextField lastNameField = new TextField();
        lastNameField.setPrefHeight(40);
        gridPane.add(lastNameField, 1, 2);

        // Add mail From Label
        Label mailFromLabel = new Label("Mail From : ");
        gridPane.add(mailFromLabel, 0, 3);

        // Add mail From Field
        TextField mailFromField = new TextField();
        mailFromField.setPrefHeight(40);
        gridPane.add(mailFromField, 1, 3);

        // Add send Email Button
        Button sendEmailButton = new Button("Send Email");
        sendEmailButton.setPrefHeight(40);
        sendEmailButton.setDefaultButton(true);
        sendEmailButton.setPrefWidth(100);
        gridPane.add(sendEmailButton, 0, 4, 2, 1);
        GridPane.setHalignment(sendEmailButton, HPos.CENTER);
        GridPane.setMargin(sendEmailButton, new Insets(20, 0, 20, 0));

        //Add exit button
        Button exitApp = new Button("Exit");
        exitApp.setPrefHeight(40);
        exitApp.setDefaultButton(true);
        exitApp.setPrefWidth(100);
        gridPane.add(exitApp, 0, 16, 2, 1);
        GridPane.setHalignment(exitApp, HPos.CENTER);
        GridPane.setMargin(exitApp, new Insets(20, 0, 20, 0));
    }

        public static void main(String[] args)
    {
        launch(args);
    }
}
