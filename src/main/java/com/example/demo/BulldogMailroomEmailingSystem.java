//Names of Group Members:  Oreoluwa Owoseeni
//                         Henry Fowobaje
//                         Shalom Akinbulumo

//Course Project: Final Project for CSCI-120 (Computer Science II)

//Project Purpose: This Project is to build a notification system for the Fisk University Mailroom.
//                 In this way, we are aiming to reduce the number of packages that get left over
//                 Because the students are not aware of that their package has arrived

//Due Date: April 28, 2022

//Project package (from IntelliJ IDE)
package com.example.demo;


//BulldogMailroomException

//Imports Neccessities

//Imports for javafx

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Window;

//Imports for Java Mail API

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

//Java util imports
import java.util.Properties;
import java.util.ArrayList;
import java.util.function.*;
import java.util.prefs.Preferences;


//Java IO imports
import java.io.*;

//Java time Imports


// Created the program's Class
// Declared it public class
public class BulldogMailroomEmailingSystem extends Application
    {

    //Email for Mailroom

    //Must remain Final and Static

    //Email Address
    final static String emailFrom = "fiskmailroomnotify@gmail.com";

    //Email Username

    //Remains the same as the email address, to prevent the collision of domain names
    final static String emailUsername = "fiskmailroomnotify@gmail.com";

    //Email Password

    //Necessary for Password authentication
    final static String emailPassword = "fiskmailroom";

    //Variable 'students' is created

    //This is left static so we can use this anytime
    static ArrayList<Student> students;

    //Method for reading the 'Students.txt' or 'students.csv' file

    //This helps to keep the names and emails of the students in an array list, to allow for easy accessibility
    //The 'filename' variable here represents the name of the file, with its extension
    public void readStudents(String filename) throws IOException{

        //Our static variable of a Student Array is initialized
        students = new ArrayList<Student>();

        //Variable File Reader is created
        FileReader reader;

        //Our reader variable for File Reader is initialized
        reader = new FileReader(filename);

        //Variable for Buffered reader is created
        BufferedReader read;

        //Our read variable for Buffered Reader is created
        read= new BufferedReader(reader);

        //A string variable called line is created
        String line;

        // The first line containing data is read by the buffered reader
        line = read.readLine();

        //A while loop is created to split all the data in a line based on the comma symbol
        // The obtained items are used to create an instance of the student class
        while(line != null){

            // we split the line based on the comma and create student object from the specified file
            // A String array variable is created
            String[] items;

            //The variable is initialized to contain the individual elements of the string separated by a comma
            items = line.split(",");

            //A string variable called firstname is created
            String firstname;

            //The first element of the array is denoted firstname
            firstname = items[0];

            //A string variable called firstname is created
            String lastname;


            //The second element is denoted as lastname
            lastname = items[1];

            //A string variable called firstname is created
            String email;

            //The third element of the array is denoted email
            email = items[2];

            //A variable of Student type is created
            Student st;

            //A new instance of student class is created
            st = new Student(firstname, lastname, email);

            //This instance is added to the students array
            students.add(st);

            // The while loop continues as we read next line
            //It only stops at the end of the file
            line = read.readLine();
        }

        //We close our Buffered Reader
        read.close();

    //END OF readStudents method
    }


    //This method is created to retrieve the students' email at the time of emailing
    public String getEmail(String firstname, String lastname){

        //An integer variable is created
        int i;

        //A for loop is created to go through the elements of the 'students' array and search for the students' email
        for(i = 0; i < students.size(); i++){

            //if the firstname and lastname are the same as the elements of the array, the appropriate email is retrieved
            if(firstname.equalsIgnoreCase(students.get(i).firstname) &&
                    lastname.equalsIgnoreCase(students.get(i).lastname)) {
                break;
            }

        //END of for loop
        }
        //If the firstname and lastname are not found on the same line, it means there's either a typo,
        // or the student doesn't exist in the database
        if(i == students.size()){

            //Returns Null
            //Null value will be recalled later in code
            return null;

        }

        //Else, the appropriate email is retrieved
        else{

            //Returns appropriate String value
            return students.get(i).email;

        }

        //END OF getEmail method
    }

    //Method to add Students if they are not available
    public void addStudents(String firstName, String lastName, String email) throws IOException{

        //Creates String Variable
        String filename;

        //Initializes Variable using FilePath
        filename = "src/addresses.txt";

        //Creates FileReader Variable
        FileReader reader;

        //Initializes Reader Variable
        reader = new FileReader(filename); // First Reader

        //Creates Buffered Reader Variable
        BufferedReader bufferedReader;

        //Initializes Buffered Reader
        bufferedReader = new BufferedReader(reader);

        //Creates String Variable
        String details;

        //Initializes String variable "details"
        details = bufferedReader.readLine();

        //While Loop to Read Through Exisiting File and Add additional Students
        while(true){
            //System.out.println(details);

            //If Line is empty...
            if(details == null){

                //Create FileWriter Variable
                FileWriter fw;

                //Initializes FileWriter
                fw = new FileWriter(filename, true);

                //Creates Buffered Writer Variable
                BufferedWriter bw;

                //Initializes Buffered Writer
                bw = new BufferedWriter(fw);

                //Create PrintWriter Variable
                PrintWriter out;

                //Initializes PrintWriter variable
                out = new PrintWriter(bw);

                //Skips the side of the first Line
                out.println(" ");

                //Prints Necessary String on the Next Line
                out.print(firstName + "," + lastName + "," + email);

                //Closes PrintWrtiter
                out.close();

                //Stop Operation
                break;
            }

            //While Loop Continues as long as Operation isn't Stopped
            details = bufferedReader.readLine();

            //END of while loop
        }

        //END of add Students Method
    }

    @Override
    //Start method for javaFX implementation
    public void start(Stage primaryStage) throws Exception {

        //The readStudents class is called immediately
        readStudents("src/addresses.txt");

        //The title of the application is created
        primaryStage.setTitle("Bulldog Mailroom Notification System");

        // Create the Bulldog Mailroom Emailing System Application grid pane
        //Creates GridPane Variable
        GridPane gridPane;

        //Initiializes GridPane Variable to contain Bulldog Mailing system
        gridPane = loginPane();

        // Add UI controls to the Bulldog Mailroom Emailing System Application grid pane
        loginUIControls(gridPane);

        // Create a scene with Bulldog Mailroom Emailing System Application grid pane
        Scene scene = new Scene(gridPane, 800, 500);

        // Sets application logo in the primary stage
        primaryStage.getIcons().add(new Image("logo.png"));

        // Set the scene in primary stage
        primaryStage.setScene(scene);

        //Displays primary Stage
        primaryStage.show();

    //END OF THE start method
    }

    private GridPane loginPane() {
        // Instantiate a new Grid Pane
        // Gridpane variable is created
        GridPane gridPane;

        //Gridpane is initialized
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
        ColumnConstraints columnOneConstraints;
        columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains;
        columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);

        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        //Add Column constraints to GridPane
        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        //Return Statement
        return gridPane;

        //END of the GridPane method
    }

    private void loginUIControls(GridPane gridPane){
        // Add Header
        //A Label variable is created
        Label headerLabel;

        //The label is initialized
        headerLabel = new Label("Login Page");

        //Header Label Font
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        //Label is added to GridPane
        gridPane.add(headerLabel, 0, 0, 2, 1);

        //GridPane Horizontal Alignment
        GridPane.setHalignment(headerLabel, HPos.CENTER);

        //Gridpane Margin ALignment
        GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

        // Add emailAddress Label
        //A label variable is created
        Label emailAddressLabel;

        //The label is initialized
        emailAddressLabel = new Label("Email Address: ");

        //Label is added to GridPane
        gridPane.add(emailAddressLabel, 0, 1);

        //Adding TextFields
        // TextField Variable is created
        TextField emailAddressField;

        //Our TextField is initialized
        emailAddressField = new TextField();

        //TextField preferred Height is set
        emailAddressField.setPrefHeight(40);

        //TextField is added to GridPane
        gridPane.add(emailAddressField, 1, 1);

        // Add Username Label
        Label usernameLabel;

        //Initialize Username Label
        usernameLabel = new Label("Username: ");

        //Username label is added to gridPane
        gridPane.add(usernameLabel, 0, 2);

        // Add Username Field
        TextField usernameField;

        // Our TextField is Initialized
        usernameField = new TextField();

        //Username textfield preferred height is set
        usernameField.setPrefHeight(40);

        //Add TextField to GridPane
        gridPane.add(usernameField, 1, 2);

        // Password Label variable
        Label password;

        // mailFromLabel is initialized
        password = new Label("Password: ");

        //Add Label to GridPane
        gridPane.add(password, 0, 3);

        // Text Variable is created
        TextField passwordField;

        // Variable passwordField is initialized
        passwordField = new TextField();

        //Set Preferred Height of Password Field
        passwordField.setPrefHeight(40);

        //Add TextField to GridPane
        gridPane.add(passwordField, 1, 3);

        // Add send Email Button
        // Button Variable is created
        Button loginButton;

        //Variable sendEmailButton is initialized
        loginButton = new Button("Login");

        //Login button Preference Height
        loginButton.setPrefHeight(40);
        loginButton.setDefaultButton(true);

        //Preferred width of button
        loginButton.setPrefWidth(100);

        //Button is added to GridPane
        gridPane.add(loginButton, 0, 4, 2, 1);

        //Horizontal Alignment of Button is set
        GridPane.setHalignment(loginButton, HPos.CENTER);

        //Margin of Button is set
        GridPane.setMargin(loginButton, new Insets(20, 0, 20, 0));

        //addStudent Functionality
        //This Button Opens A new Window in the App
        loginButton.setOnAction(new EventHandler<ActionEvent>() {

            //Override
            @Override

            //Handle Method for addStudent
            public void handle(ActionEvent event) {

                //Fail Safes for Errors
                //If First name field is empty, break operation and alert
                if (emailAddressField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the email address!");
                    return;
                }

                ////If Last name field is empty, break operation and alert
                if (usernameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the Username");
                    return;
                }

                //If mailFrom field is empty, break operation and alert
                if (passwordField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the Password");
                    return;
                }

                //If First name field is empty, break operation and alert
                if (!(emailAddressField.getText().equalsIgnoreCase(emailFrom))) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Email Address Incorrect!");
                    return;
                }

                ////If Last name field is empty, break operation and alert
                if (!(usernameField.getText().equalsIgnoreCase(emailFrom))) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Username Incorrect. Should be the same as Email Address");
                    return;
                }

                //If mailFrom field is empty, break operation and alert
                if (!(passwordField.getText().equalsIgnoreCase(emailPassword))) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Password Incorrect!");
                    return;
                }

                //The readStudents class is called immediately
                try {
                    readStudents("src/addresses.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Opens the Bulldog Mailroom Notification System Application grid pane
                //Creates GridPane Variable
                GridPane gridPane;

                //Initializes GridPane Variable to contain Bulldog Mailing system
                gridPane = createBulldogMailroomEmailingSystem();

                // Add UI controls to the Bulldog Mailroom Emailing System Application grid pane
                addUIControls(gridPane);

                //Creates Parent Variable
                Parent content;

                //Initializes Parent variable as GridPane
                content = gridPane;

                // Create a scene with Add Student grid pane on a new window
                //Create Scene variable
                Scene scene;

                //Initialize scene
                scene = new Scene(content);

                //Creates stage
                Stage window;

                //Initializes window has a stage
                window = new Stage();

                // Sets application logo for new window
                window.getIcons().add(new Image("logo.png"));

                //Sets Title for new window
                window.setTitle("Bulldog Mailroom Notification System");

                //Set Scene for new window
                window.setScene(scene);

                //Displays new window
                window.show();
            }

        });


    }

    private GridPane createBulldogMailroomEmailingSystem() {

        // Instantiate a new Grid Pane
        // Gridpane variable is created
        GridPane gridPane;

        //Gridpane is initialized
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
        ColumnConstraints columnOneConstraints;
        columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains;
        columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);

        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        //Add Column constraints to GridPane
        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        //Return Statement
        return gridPane;

    //END of the GridPane method
    }

    //UI method is created to implement
    private void addUIControls(GridPane gridPane) {

        // Add Header
        //A Label variable is created
        Label headerLabel;

        //The label is initialized
        headerLabel = new Label("Bulldog Mailroom Emailing System Application");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        //Label is added to GridPane
        gridPane.add(headerLabel, 0, 0, 2, 1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

        // Add firstName Label
        //A label variable is created
        Label firstNameLabel;

        //The label is initialized
        firstNameLabel = new Label("First Name : ");

        //Label is added to GridPane
        gridPane.add(firstNameLabel, 0, 1);

        //Adding TextFields
        // TextField Variable is created
        TextField firstNameField;

        //Our TextField is initialized
        firstNameField = new TextField();
        firstNameField.setPrefHeight(40);

        //TextField is added to GridPane
        gridPane.add(firstNameField, 1, 1);


        // Add lastName Label
        Label lastNameLabel = new Label("Last Name : ");
        gridPane.add(lastNameLabel, 0, 2);

        // Add last Name Field
        TextField lastNameField;

        // Our TextField is Initialized
        lastNameField = new TextField();
        lastNameField.setPrefHeight(40);

        //Add TextField to GridPane
        gridPane.add(lastNameField, 1, 2);

        // Label variable
        Label mailFromLabel;

        // mailFromLabel is initialized
        mailFromLabel = new Label("Mail From: ");

        //Add Label to GridPane
        gridPane.add(mailFromLabel, 0, 3);

        // Text Variable is created
        TextField mailFromField;

        // Variable mailFromField is initilized
        mailFromField = new TextField();
        mailFromField.setPrefHeight(40);

        //Add TextField to GridPane
        gridPane.add(mailFromField, 1, 3);

        // Add send Email Button
        //Button Variable is created
        Button sendEmailButton;

        //Variable sendEmailButton is initialized
        sendEmailButton = new Button("Send Email");
        sendEmailButton.setPrefHeight(40);
        sendEmailButton.setDefaultButton(true);
        sendEmailButton.setPrefWidth(100);

        //Button is added to GridPane
        gridPane.add(sendEmailButton, 0, 4, 2, 1);
        GridPane.setHalignment(sendEmailButton, HPos.CENTER);
        GridPane.setMargin(sendEmailButton, new Insets(20, 0, 20, 0));

        //Add addStudent button
        //Create Button Variable
        Button addStudent;

        //Button variable is initialized
        addStudent = new Button("Add Student");
        addStudent.setPrefHeight(40);
        addStudent.setDefaultButton(true);
        addStudent.setPrefWidth(100);

        //Button is added to GridPane
        gridPane.add(addStudent, 0, 15, 1, 1);
        GridPane.setHalignment(addStudent, HPos.LEFT);
        GridPane.setMargin(addStudent, new Insets(20, 0, 20, 0));

        //Add exit button
        //Create Button Variable
        Button exitApp;

        //Button variable is initialized
        exitApp = new Button("Exit");
        exitApp.setPrefHeight(40);
        exitApp.setDefaultButton(true);
        exitApp.setPrefWidth(100);

        //Button is added to GridPane
        gridPane.add(exitApp, 6, 15, 1, 1);
        GridPane.setHalignment(exitApp, HPos.RIGHT);
        GridPane.setMargin(exitApp, new Insets(20, 0, 20, 0));

        //Set Mailing functionality
        //Create Properties variable
        Properties props;

        //Variable is initialized
        props = System.getProperties();

        //Using properties, set up smtp server
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.user", "username");
        props.put("mail.smtp.password", "password");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", true);

        //Create Session Variable
        Session session;

        //Variable is initiialized
        session = Session.getInstance(props, new javax.mail.Authenticator() {

            @Override

            //Method to confirm password. Works for authentication purposes
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailUsername, emailPassword);

                //END of PasswordAuthentication Method
            }

            //END of Session
        });

        //Set functionality for 'Send Email' Button
        sendEmailButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override

            //Handle Method
            public void handle(ActionEvent event) {

                //Fail Safes for Errors
                //If First name field is empty, break operation and alert
                if (firstNameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your First Name");
                    return;
                }

                ////If Last name field is empty, break operation and alert
                if (lastNameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your Last Name");
                    return;
                }

                //If mailFrom field is empty, break operation and alert
                if (mailFromField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter where the mail is from");
                    return;
                }

                //If email cannot be found, or is missing in database, break operation and alert
                if (getEmail(firstNameField.getText(), lastNameField.getText()) == null) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Email not found! Confirm First or Last name.");
                    return;
                }

                //Call in getEmail method
                //Create String variable
                String myEmail;

                //Call getEmail class and assigns the string as the created String Variable
                myEmail = getEmail(firstNameField.getText(), lastNameField.getText());

                //Capitalize First Name
                //Create String Variables
                String first;
                String firstName;

                //Assign firstNameField text to first String variable
                first = firstNameField.getText();

                // capitalize first letter of initialize String
                //Merge first letter of initialized string with corresponding Substring
                //Assign new String to second String variable
                firstName = first.substring(0, 1).toUpperCase() + first.substring(1);

                //Capitalize Last Name
                //Create String Variables
                String last;
                String lastName;

                //Assign lastNameField text to the first String variable
                last = lastNameField.getText();

                // capitalize first letter of initialized String
                //Merge first letter of initialized string with corresponding substring
                //Assign new String to second String variable
                lastName = last.substring(0, 1).toUpperCase() + last.substring(1);

                //Capitalize First letter of mailFrom field
                //Create String Variables
                String mail;
                String mailFrom;

                //Assign mailFromField text to the first String variable
                mail = mailFromField.getText();

                // capitalize first letter of initialized String
                //Merge first letter of initialized string with corresponding substring
                //Assign new String to second String variable
                mailFrom = mail.substring(0, 1).toUpperCase() + mail.substring(1);

                //Method to throw and catch exceptions in Email sending
                //Try tree
                try {
                    // Create a default MimeMessage object :
                    Message message;

                    //Message variable is initialized
                    message = new MimeMessage(session);

                    // Set Sender's Address
                    //Uses the static String initialized at the top
                    message.setFrom(new InternetAddress(emailFrom));

                    // Set Recipient Address
                    //myEmail String is called
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(myEmail));

                    // Set Email Subject
                    message.setSubject("You have a Package!");

                    // Now set the actual message
                    // Use already denoted names and mail/package senders
                    message.setText("Hi " + firstName + " " + lastName + ", " + " \r\n\r\nThis email " +
                            "is to inform you that you have a package from " + mailFrom + " at the Fisk University Mailroom." +
                            " Please do well to stop by and pick it up. \r\n\r\nWith love,\r\nFrom your Friends at the Mailroom.");

                    // Send message
                    Transport.send(message);

                    // Sent message confirmation
                    showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(),
                            "Email Successfully sent to", " "
                                    + firstName + " " + lastName);

                    //END of Try
                }
                //Catch For Exceptions
                catch (MessagingException e) {
                    System.out.println("Message Transmission failed. Try Again Later.");
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),
                            "Sending Error!", "Message Transmission Failed. Try Again Later");

                    //END of Catch
                }

                // END of handle method
            }

            // END of Send Email functionality
        });

        //addStudent Functionality
        //This Button Opens A new Window in the App
        addStudent.setOnAction(new EventHandler<ActionEvent>() {

            //Override
            @Override

            //Handle Method for addStudent
            public void handle(ActionEvent event) {

                //Creates GridPane Variable
                GridPane thisGrid;

                //Initializes GridPane Variable to contain Add Student Prompt Method
                thisGrid = addStudentPrompt();

                // Add UI controls to the Ad Student Prompt grid pane
                myUIControls(thisGrid);

                //Creates Parent Variable
                Parent content;

                //Initializes Parent variable as GridPane
                content = thisGrid;

                // Create a scene with Add Student grid pane on a new window
                //Create Scene variable
                Scene scene;

                //Initialize scene
                scene = new Scene(content);

                //Displays primary Stage
                //primaryStage.show();
                //create scene

                //Creates stage
                Stage window;

                //Initializes window has a stage
                window = new Stage();

                // Sets application logo for new window
                window.getIcons().add(new Image("logo.png"));

                //Sets Title for new window
                window.setTitle("Add Student");

                //Set Scene for new window
                window.setScene(scene);

                //Displays new window
                window.show();
            }

        });


        //Set functionality for 'Exit' Button
        exitApp.setOnAction(new EventHandler<ActionEvent>() {

            //Override
            @Override

            //Handle Method
            public void handle(ActionEvent event) {

                //Utilizes the Preference class to store user choices
                //Creates Preferences Variable
                Preferences prefs;

                //Initializes the Preferences variable
                prefs = Preferences.userRoot().node(getClass().getName());

                //Object of the static alert method
                //Create ALert variable
                Alert alert;

                //Alert variable is initialized
                alert = createAlertWithOptOut(AlertType.CONFIRMATION, "Exit",
                        null, "Are you sure you wish to exit?", "Do not ask again",
                        param -> prefs.put(null, param ? "Always" : "Never"), ButtonType.YES, ButtonType.NO);

                //If choice is YES, JVM closes
                if (alert.showAndWait().filter(t -> t == ButtonType.YES).isPresent()) {
                    System.exit(0);
                }

                //END of handle method
            }

            //END of Exit Button Functionality
        });
    }

        //Add Sudent Method
        //Return Value is a GridPane
        private GridPane addStudentPrompt(){

            // Instantiate a new Grid Pane
            // GridPane variable is created
            GridPane myGrid;

            //GridPane is initialized
            myGrid = new GridPane();

            // Position the pane at the center of the screen, both vertically and horizontally
            myGrid.setAlignment(Pos.CENTER);

            // Set a padding of 40px on each side
            myGrid.setPadding(new Insets(40, 40, 40, 40));

            // Set the horizontal gap between columns
            myGrid.setHgap(10);

            // Set the vertical gap between rows
            myGrid.setVgap(10);

            // Add Column Constraints

            // columnOneConstraints will be applied to all the nodes placed in column one.
            ColumnConstraints columnOneConstraints;
            columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
            columnOneConstraints.setHalignment(HPos.RIGHT);

            // columnTwoConstraints will be applied to all the nodes placed in column two.
            ColumnConstraints columnTwoConstrains;
            columnTwoConstrains = new ColumnConstraints(200, 200, Double.MAX_VALUE);

            columnTwoConstrains.setHgrow(Priority.ALWAYS);

            //Add Column constraints to GridPane
            myGrid.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

            //Return Statement
            return myGrid;

            //END of the Add STudent Prompt method
        }

        //UI method is created to implement the Add Student Method
        //Sets UI COntrols
        private void myUIControls (GridPane myGrid) {

            // Add Heading
            //A Label variable is created
            Label headingLabel;

            //The label is initialized
            headingLabel = new Label("Add a Student");

            //Label font is set using CSS
            headingLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));

            //Label is added to GridPane
            myGrid.add(headingLabel, 0, 0, 2, 1);

            //Label Horizontal Alignment is set
            GridPane.setHalignment(headingLabel, HPos.CENTER);

            //Label Margin is Set
            GridPane.setMargin(headingLabel, new Insets(20, 0, 20, 0));

            // Add firstName Label
            //A label variable is created
            Label addFirstNameLabel;

            //The label is initialized
            addFirstNameLabel = new Label("First Name : ");

            //Label is added to GridPane
            myGrid.add(addFirstNameLabel, 0, 1);

            //Adding TextFields
            // TextField Variable is created
            TextField addFirstNameField;

            //Our TextField is initialized
            addFirstNameField = new TextField();

            //Preferred Height for TextField is set
            addFirstNameField.setPrefHeight(40);

            //TextField is added to GridPane
            myGrid.add(addFirstNameField, 1, 1);

            // Add lastName Label
            Label addLastNameLabel = new Label("Last Name: ");

            //Label is added to GridPane
            myGrid.add(addLastNameLabel, 0, 2);

            // Add last Name Field
            TextField addLastNameField;

            // Our TextField is Initialized
            addLastNameField = new TextField();

            //Preferred Height for TExtfield is Set
            addLastNameField.setPrefHeight(40);

            //Add TextField to GridPane
            myGrid.add(addLastNameField, 1, 2);

            // Label variable
            Label addStudentEmailLabel;

            // mailFromLabel is initialized
            addStudentEmailLabel = new Label("Student Mail: ");

            //Add Label to GridPane
            myGrid.add(addStudentEmailLabel, 0, 3);

            // Text Variable is created
            TextField addStudentEmailField;

            // Variable mailFromField is initialized
            addStudentEmailField = new TextField();

            //Preferred Height of TextField is Set
            addStudentEmailField.setPrefHeight(40);

            //Add TextField to GridPane
            myGrid.add(addStudentEmailField, 1, 3);

            // Add send Email Button
            //Button Variable is created
            Button addMyStudent;

            //Variable sendEmailButton is initialized
            addMyStudent = new Button("Add Student");

            //Button Preferred Height is set
            addMyStudent.setPrefHeight(40);
            addMyStudent.setDefaultButton(true);

            //Button Preferred Width is set
            addMyStudent.setPrefWidth(100);

            //Button is added to GridPane
            myGrid.add(addMyStudent, 0, 4, 2, 1);

            //Horizontal Alignment of Button is Set
            GridPane.setHalignment(addMyStudent, HPos.CENTER);

            //Margin of Button is set
            GridPane.setMargin(addMyStudent, new Insets(20, 0, 20, 0));

            //Set functionality for 'Add Student' Button
            addMyStudent.setOnAction(new EventHandler<ActionEvent>() {

                //Override
                @Override

                //Handle Method
                public void handle(ActionEvent event) {

                    //If firstNameField is Empty, declares Alert
                    if (addFirstNameField.getText().isEmpty()) {
                        showAlert(Alert.AlertType.ERROR, myGrid.getScene().getWindow(), "Form Error!", "Please enter your First Name");
                        return;
                    }

                    ////If Last name field is empty, break operation and alert
                    if (addLastNameField.getText().isEmpty()) {
                        showAlert(Alert.AlertType.ERROR, myGrid.getScene().getWindow(), "Form Error!", "Please enter your Last Name");
                        return;
                    }

                    //If mailFrom field is empty, break operation and alert
                    if (addStudentEmailField.getText().isEmpty()) {
                        showAlert(Alert.AlertType.ERROR, myGrid.getScene().getWindow(), "Form Error!", "Please Enter the Student Email");
                        return;
                    }

                    //If email cannot be found, or is missing in database, break operation and alert!
                    //Calls in getEmail methof
                    if (getEmail(addStudentEmailField.getText(), addLastNameField.getText()) != null) {
                        showAlert(Alert.AlertType.ERROR, myGrid.getScene().getWindow(), "Form Error!", "Email Already Exists!");
                        return;
                    }


                    //Create String variable
                    String myEmail;

                    //Call getEmail class and assigns the string as the created String Variable
                    myEmail = addStudentEmailField.getText();

                    //Capitalize First Name
                    //Create String Variables
                    String first;
                    String firstName;

                    //Assign firstNameField text to first String variable
                    first = addFirstNameField.getText();

                    // capitalize first letter of initialize String
                    //Merge first letter of initialized string with corresponding Substring
                    //Assign new String to second String variable
                    firstName = first.substring(0, 1).toUpperCase() + first.substring(1);

                    //Capitalize Last Name
                    //Create String Variables
                    String last;
                    String lastName;

                    //Assign lastNameField text to the first String variable
                    last = addLastNameField.getText();

                    // capitalize first letter of initialized String
                    //Merge first letter of initialized string with corresponding substring
                    //Assign new String to second String variable
                    lastName = last.substring(0, 1).toUpperCase() + last.substring(1);

                    //Capitalize First letter of mailFrom field
                    //Create String Variables
                    //Method to throw and catch exceptions in Email sending
                    //Try tree

                    //Utilizes the Preference class to store user choices
                    //Creates Preferences Variable
                    Preferences prefs;

                    //Initializes the Preferences variable
                    prefs = Preferences.userRoot().node(getClass().getName());

                    //Object of the static alert method
                    //Create ALert variable
                    Alert alert;

                    alert = createAlertWithOptOut(AlertType.CONFIRMATION, "Add Student Confirmation",
                            null, "Are you sure you wish to add this student?", "Do not ask again",
                            param -> prefs.put(null, param ? "Always" : "Never"), ButtonType.YES, ButtonType.NO);

                    //If choice is YES, JVM closes
                    if (alert.showAndWait().filter(t -> t == ButtonType.YES).isPresent()) {

                        //Try Method
                        try {
                            //Runs our addStudents method
                            addStudents(firstName, lastName, myEmail);

                            //Then run the readStudents method recursively
                            readStudents("src/addresses.txt");
                        }

                        //Catch for any exceptions
                        catch (IOException e) {
                            //System.out.println("Message Transmission failed. Try Again Later.");
                            showAlert(Alert.AlertType.ERROR, myGrid.getScene().getWindow(),
                                    "Process Failed!", "Student Addition Failed! Try Again Later");
                        }

                    }

            }
        });
    }


        //ShowAlert Method
        private static void showAlert (Alert.AlertType alertType, Window owner, String title, String message){

            //Create Alert Variable
            Alert alert;

            //Initializes the alert variable
            alert = new Alert(alertType);

            //SET ALERT PARAMETERS
            alert.setTitle(title);
            alert.setHeaderText(null);
            alert.setContentText(message);
            alert.initOwner(owner);
            alert.show();

            //END of showAlert method
        }

        //Alert Method for Opt out option with preferences for storage
        public static Alert createAlertWithOptOut (AlertType type, String title,
                String headerText, String message, String optOutMessage,
                Consumer < Boolean > optOutAction, ButtonType...buttonTypes){

            //Alert variable is created
            Alert alert;

            //Alert variable is initialized
            alert = new Alert(type);
            // Need to force the alert to layout in order to grab the graphic,
            // as we are replacing the dialog pane with a custom pane
            alert.getDialogPane().applyCss();

            //Create Node variable
            Node graphic;

            //Initialize Node variable
            graphic = alert.getDialogPane().getGraphic();
            // Create a new dialog pane that has a checkbox instead of the hide/show details button
            // Use the supplied callback for the action of the checkbox

            alert.setDialogPane(new DialogPane() {
                @Override

                //OptOut Functionalities
                protected Node createDetailsButton() {

                    //Creates Checkbox variable
                    CheckBox optOut;

                    //CheckBox variable is initialized
                    optOut = new CheckBox();
                    optOut.setText(optOutMessage);
                    optOut.setOnAction(e -> optOutAction.accept(optOut.isSelected()));
                    return optOut;

                    //Node functionalities
                }

                //END of dialogPane handler
            });

            alert.getDialogPane().getButtonTypes().addAll(buttonTypes);
            alert.getDialogPane().setContentText(message);

            // Fool the dialog into thinking there is some expandable content
            // a Group won't take up any space if it has no children

            alert.getDialogPane().setExpandableContent(new Group());
            alert.getDialogPane().setExpanded(true);

            // Reset the dialog graphic using the default style
            alert.getDialogPane().setGraphic(graphic);
            alert.setTitle(title);
            alert.setHeaderText(headerText);
            return alert;
        }



        //MAIN METHOD
        public static void main (String[]args)
        {
            launch(args);

            //END of MAIN METHOD
        }

        //End of Program's Class
    }