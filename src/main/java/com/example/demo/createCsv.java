package com.example.demo;

import java.io.*;

//Imported java.io.filewriter

//Imported java.io.IOException

//Imported java.io.PrintWriter
import java.io.PrintWriter;

//Created the class createCSV

public class createCSV
{
    //Created the firstname String
    String firstName;

    //created the LastName String
    String lastName;

    //Created the emailAddress String
    String emailAddress;

    //Created the addStudent Constructor
    public createCSV(String firstName, String lastName, String emailAddress){

        //firstName Variable is the same as other firstName Variable
        this.firstName = firstName;

        //lastName variable is the same as other lastName Variable
        this.lastName = lastName;

        //emailAddress Variable is the same as other email address variable
        this.emailAddress = emailAddress;
    }

    //Created the toString method
    public String toString(){

        //Returns String of data memebers
        return "(" + firstName + ","  + lastName + "," + emailAddress + ")";
    }

    //defined the main class
    public static void main(String[] args) {

        //Created PrintWriter variable
        PrintWriter pw;

        //Try Method
        try {

            //Initialize PrintWriter variable
            pw = new PrintWriter(new File("src/addresses.txt"));

            //Create StringBuffer Variable
            StringBuffer csvHeader;

            //Initialize String buffer variable
            csvHeader = new StringBuffer("");

            //Create StringBuffer variable
            StringBuffer csvData;

            //Initialzie StringBuffer VAriable
            csvData  = new StringBuffer("");

            //Add Name to CSV File Header
            csvHeader.append("Name");

            //Add Comma Separator to Csv File Header
            csvHeader.append(",");

            //Add Age to CSV File Header
            csvHeader.append("Age");

            //Add Comma Separator to Csv File Header
            csvHeader.append(",");

            //Add Email Address to CSV File Header
            csvHeader.append("EmailAddress");

            //Add new line tab
            csvHeader.append("\n");


            // write header
            pw.write(csvHeader.toString());

            // write individual student data
            //Add Student first Name
            csvData.append("Henry");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Fowobaje");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("fowobaje2005@gmail.com");

            //Next Line tab for next student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Henry");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last NAme
            csvData.append("David");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("henrybusiness987@gmail.com");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Collins");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last NAme
            csvData.append("Ikpeyi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("CIkpeyi05@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Joshua");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Amosu");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("JOAmosu21@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Chukwuanogo");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Obiaga");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("CPObiaga27@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Shalom");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Akinbulomo");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("SOAkinbulomo07@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Oluwatamilore");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Oladejo");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("OPOladejo21@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Henry");

            //Enter Comma Separator
            csvData.append(',');

            //Enter LAst NAme
            csvData.append("David");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("henrybusiness987@gmail.com");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Prosper");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Nwankwo");

            //Enter Comma Separator
            csvData.append(',');

            //Enter EMail Address
            csvData.append("PCNwankwo24@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Ikechi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Africs");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("IMAfrics15@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Feyisayo");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Adeaga");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("FAAdeaga07@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Henry");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("David");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email address
            csvData.append("CEUba20@my.fisk.edu");

            ////Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Foluso");

            //Add Comma separator
            csvData.append(',');

            //Enetr LAst Name
            csvData.append("Adeyemi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("FVAdeyemi05@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Elijah");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last NAme
            csvData.append("Okoroh");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("EOOkoroh08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Philip");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Fowobaje");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("PAOlapade@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Angel");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Adetula");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("AAAdetula11@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Camari");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last NAme
            csvData.append("Nwokorie");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("CRNwokorie10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Elijah");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Okoroh");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("EOOkoroh08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Wisdom");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last NAme
            csvData.append("Dayok");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("WODayok11@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Omayorkun");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Oyefeso");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("OTOyefeso10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Emmanuel");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last NAme
            csvData.append("Adeyemi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email Address
            csvData.append("eiadeyemi05@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Kelechi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Nnorom");

            //Enter Comma Separator
            csvData.append(',');

            //ENter email address
            csvData.append("kcnnorom20@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Amarachuckwu");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Iyke-Osuji");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("aosuji31@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Oluwalayomi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Fadero");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email Address
            csvData.append("otfadero09@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Jowayne");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Hudson");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("jmhudson29@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Ayomide");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Adewale");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("ajadewale27@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Chibuikem");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Iheagwaram");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("csiheagwaram10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Dinesh");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Pandey");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("dpandey08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Rejin");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Nepal");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Email Address
            csvData.append("rnepal30@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Mariam");

            //Enter Comma Separator
            csvData.append(',');

            //ENter Last Name
            csvData.append("Olagoke");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("mmolagoke04@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Onyinye");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Ejiaka");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("ofejiaka04@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Aderinsola");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Oladunmade");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("aaoladunmade13@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Hephzibah");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr Last Name
            csvData.append("Agunbiade");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr email
            csvData.append("haagunbiade10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Akwesi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last name
            csvData.append("Peasare");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("aopeasare01@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Sopuruchi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter csvData
            csvData.append("Ndubuisi");

            //Enter Comma Separator
            csvData.append(',');

            //ENter email address
            csvData.append("sundubuisi08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Awantika");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Bastola");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr email
            csvData.append("abastola21@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Bethel");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Arthur");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("barthur28@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Chinaza");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Belolisa");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("csbelolisa09@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Ann");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Ebhonu");

            //Enter Comma Separator
            csvData.append(',');

            //ENter email
            csvData.append("aeebhounu08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Benzema");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last Name
            csvData.append("Kelechi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("fowobaje2005@gmail.com");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Karim");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr Last Name
            csvData.append("Adeyemi");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("henrybusiness987@gmail.com");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Robert");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr Last NAme
            csvData.append("Luiz");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("CIkpeyi05@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Okafor");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr LAst Name
            csvData.append("David");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("JOAmosu21@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("King");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Kingdom");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("CPObiaga27@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            //Add Student first Name
            csvData.append("Mike");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Fola");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("SOAkinbulomo07@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Buhari");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last NAme
            csvData.append("Ahmed");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("OPOladejo21@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');

            // write individual student data
            csvData.append("Musa");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Moses");

            //Enter Comma Separator
            csvData.append(',');

            //EMail
            csvData.append("henrybusiness987@gmail.com");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Victor");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Osihmen");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("PCNwankwo24@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Fekomi");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr Last name
            csvData.append("Davies");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("IMAfrics15@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Henry");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr last name
            csvData.append("Timothy");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("FAAdeaga07@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Oriyomi");

            //Enter Comma Separator
            csvData.append(',');

            //Eneter last name
            csvData.append("Joshua");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email address
            csvData.append("CEUba20@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');

            // write individual student data
            csvData.append("Thor");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Maddison");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr email
            csvData.append("FVAdeyemi05@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("James");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Olamide");

            //Enter Comma Separator
            csvData.append(',');

            //Entger email
            csvData.append("EOOkoroh08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Jamie");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("Carragher");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr email
            csvData.append("PAOlapade@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Israel");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last normal
            csvData.append("Aminu");

            //Enter Comma Separator
            csvData.append(',');

            //Eneter email
            csvData.append("AAAdetula11@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Kazeem");

            //Enter Comma Separator
            csvData.append(',');


            //Enter last Name
            csvData.append("love");

            //Enter comma sepataor
            csvData.append(',');

            //Enter email
            csvData.append("CRNwokorie10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Takehiro");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr last NAme
            csvData.append("Tomiyasu");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr email
            csvData.append("EOOkoroh08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Jordi");

            //Enter Comma Separator
            csvData.append(',');

            //Enetr last name
            csvData.append("Alba");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("WODayok11@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Matt");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last Number
            csvData.append("Telles");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("OTOyefeso10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Tierney");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last Name
            csvData.append("Kieran");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("eiadeyemi05@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Leon");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Frank");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("kcnnorom20@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Ruben");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Allan");

            //Enter Comma Separator
            csvData.append(',');

            //email after the break
            csvData.append("aosuji31@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Lahm");

            //Enter Comma Separator
            csvData.append(',');

            //Enter the white wine
            csvData.append("Ali");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("otfadero09@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Duncan");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last numb
            csvData.append("Tim");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("jmhudson29@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Lebron");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last name
            csvData.append("Pulisic");

            //Enter Comma Separator
            csvData.append(',');

            //Email
            csvData.append("ajadewale27@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Stephen");

            //Enter Comma Separator
            csvData.append(',');

            //last Name
            csvData.append("Woods");

            //Enter Comma Separator
            csvData.append(',');

            //Email
            csvData.append("csiheagwaram10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Bush");

            //Enter Comma Separator
            csvData.append(',');

            //Las Name
            csvData.append("Obama");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("dpandey08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Tiger");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Mark");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("rnepal30@my.fisk.edu");


            //Next Line tab for Student datacsvData.append('\n');


            // write individual student data
            csvData.append("Scottie");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last name
            csvData.append("Barnes");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("mmolagoke04@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');

            // write individual student data
            csvData.append("Cade");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last name
            csvData.append("Brown");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("ofejiaka04@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');



            // write individual student data
            csvData.append("Jalen");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last name
            csvData.append("Green");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("aaoladunmade13@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');

            // write individual student data
            csvData.append("Benjamin");

            //Enter Comma Separator
            csvData.append(',');
            csvData.append("Kent");

            //Enter Comma Separator
            csvData.append(',');


            //Enter with email
            csvData.append("haagunbiade10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Franz");


            //Enter Comma Separator
            csvData.append(',');

            //Enter last name
            csvData.append("Wagner");

            //Enter Comma Separator
            csvData.append(',');

            //Email
            csvData.append("aopeasare01@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');

            // write individual student data
            csvData.append("Thomas");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last Name
            csvData.append("Partey");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("sundubuisi08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');

            // write individual student data
            csvData.append("Xhaka");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last name
            csvData.append("Bellerin");

            //Enter Comma Separator
            csvData.append(',');

            //Enter emails
            csvData.append("abastola21@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Odegaard");

            //Enter Comma Separator
            csvData.append(',');

            //Last name
            csvData.append("Martinelli");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("barthur28@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Kante");

            //Enter Comma Separator
            csvData.append(',');

            //enetr last name
            csvData.append("Rudiger");

            //Enter Comma Separator
            csvData.append(',');

            //enetr email
            csvData.append("csbelolisa09@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("George");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last anem
            csvData.append("Bullis");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("aeebhounu08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Irena");

            //Use compartor acisetor
            csvData.append(',');

            //Enter last Numvber
            csvData.append("Bryant");

            //Cmma Separator
            csvData.append(',');

            //Enter email
            csvData.append("fowobaje2005@gmail.com");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Chisom");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last
            csvData.append("Okwor");

            //Enter Comma Separator
            csvData.append(',');

            //Entrer email
            csvData.append("henrybusiness987@gmail.com");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Sonia");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last Name
            csvData.append("Okekenwa");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("CIkpeyi05@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Dimowo");

            //Enter Comma Separator
            csvData.append(',');

            // Eneter last name
            csvData.append("Oiza");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("JOAmosu21@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Chidera");

            //Enter Comma Separator
            csvData.append(',');

            //enter last name
            csvData.append("Apakama");

            //Enter Comma Separator
            csvData.append(',');

            //enter email
            csvData.append("CPObiaga27@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Timothy");

            //Enter Comma Separator
            csvData.append(',');

            //enter last name
            csvData.append("Mazenge");

            //Enter Comma Separator
            csvData.append(',');

            //enetr email
            csvData.append("SOAkinbulomo07@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Jeremy");

            //Uses comma aseparator
            csvData.append(',');

            //Enter last Name
            csvData.append("Filler");

            //Enter Comma Separator
            csvData.append(',');

            //enetr email
            csvData.append("OPOladejo21@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Waya");
            //Enter Comma Separator
            csvData.append(',');

            //enter last name
            csvData.append("David");

            //Enter Comma Separator
            csvData.append(',');

            //enter email
            csvData.append("henrybusiness987@gmail.com");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Foller");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last name
            csvData.append("Peter");

            //Enter Comma Separator
            csvData.append(',');

            //enter email
            csvData.append("PCNwankwo24@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Wyoming");

            //Enter Comma Separator
            csvData.append(',');

            //enetr last name
            csvData.append("Wallace");

            //Enter Comma Separator
            csvData.append(',');

            //ENter email
            csvData.append("IMAfrics15@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');

            // write individual student data
            csvData.append("Hota");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Haque");

            //Enter Comma Separator
            csvData.append(',');

            //Email
            csvData.append("FAAdeaga07@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Hines");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last Name
            csvData.append("Faulk");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("CEUba20@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Bukayo");

            //Enter Comma Separator
            csvData.append(',');

            //last NAmne
            csvData.append("Saka");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("FVAdeyemi05@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Oxlade");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Chamberlain");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("EOOkoroh08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Ramsey");

            //Enter Comma Separator
            csvData.append(',');

            //Cale last Name
            csvData.append("Jacob");

            //Enter Comma Separator
            csvData.append(',');

            //Enter tophies
            csvData.append("PAOlapade@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Amina");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Zainab");

            //Enter Comma Separator
            csvData.append(',');

            //email adrress
            csvData.append("AAAdetula11@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Akin");

            //Enter Comma Separator
            csvData.append(',');

            //Next Line tab for Student data
            csvData.append("Akinleye");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("CRNwokorie10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Emile");

            //Comma separatpr
            csvData.append(',');

            //Enter Comma Separator
            csvData.append("Smith");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("EOOkoroh08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Aaron");

            //Enter Comma Separator
            csvData.append(',');

            //Enter last name
            csvData.append("Christian");

            //Enter Comma Separator
            csvData.append(',');

            //ENter email
            csvData.append("WODayok11@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Benedict");

            //Enter Comma Separator
            csvData.append(',');

            //enter last Name
            csvData.append("John");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("OTOyefeso10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("WHite");

            //Enter Comma Separator
            csvData.append(',');

            //enetr
            csvData.append("Benjamin");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("eiadeyemi05@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');

            // write individual student data
            csvData.append("Gabriel");

            //Enter Comma Separator
            csvData.append(',');

            //last name
            csvData.append("Joao");

            //Enter Comma Separator
            csvData.append(',');

            //emails
            csvData.append("kcnnorom20@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Stones");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Walker");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("aosuji31@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Cornelius");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Stewart");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("otfadero09@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');

            // write individual student data
            csvData.append("Dennis");


            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Emmanuel");


            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("jmhudson29@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');



            // write individual student data
            csvData.append("Scott");

            //Enter Comma Separator
            csvData.append(',');

            //last name
            csvData.append("Parker");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("ajadewale27@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Martin");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("King");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("csiheagwaram10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Vinesh");

            //Enter Comma Separator
            csvData.append(',');

            //last Name
            csvData.append("Vivek");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("dpandey08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Tony");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Stark");

            //Enter Comma Separator
            csvData.append(',');

            //email todyay
            csvData.append("rnepal30@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Cody");

            //Enter Comma Separator
            csvData.append(',');

            //enetr last name
            csvData.append("Rhodes");

            //Enter Comma Separator
            csvData.append(',');

            //Enter email
            csvData.append("mmolagoke04@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Roman");

            //Enter Comma Separator
            csvData.append(',');

            //enter last name
            csvData.append("Reigns");

            //Enter Comma Separator
            csvData.append(',');

            //entetaining email
            csvData.append("ofejiaka04@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Jimmy");

            //Enter Comma Separator
            csvData.append(',');

            //last name
            csvData.append("Uso");

            //Enter Comma Separator
            csvData.append(',');

            //Email
            csvData.append("aaoladunmade13@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Riddle");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Orton");

            //Enter Comma Separator
            csvData.append(',');

            //Email
            csvData.append("haagunbiade10@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Matt");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Randy");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("aopeasare01@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Bianca");

            //Enter Comma Separator
            csvData.append(',');

            //last Name
            csvData.append("Belair");

            //Enter Comma Separator
            csvData.append(',');

            //Emails
            csvData.append("sundubuisi08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Sonia");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Deville");

            //Enter Comma Separator
            csvData.append(',');

            //emails
            csvData.append("abastola21@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Lupita");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Nyongo");

            //Enter Comma Separator
            csvData.append(',');

            //email
            csvData.append("barthur28@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Depp");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Alice");

            //Enter Comma Separator
            csvData.append(',');

            //Emails
            csvData.append("csbelolisa09@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Bruce");

            //Enter Comma Separator
            csvData.append(',');

            //Last Name
            csvData.append("Banner");

            //Enter Comma Separator
            csvData.append(',');

            //Enter your email
            csvData.append("aeebhounu08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            // write individual student data
            csvData.append("Junior");

            //Enter Comma Separator
            csvData.append(',');

            //Enter Last Name
            csvData.append("Santos");

            //Enter Comma Separator
            csvData.append(',');

            //Emails
            csvData.append("aeebhounu08@my.fisk.edu");

            //Next Line tab for Student data
            csvData.append('\n');


            //Print Writer Writing
            pw.write(csvData.toString());

            //Print Writer closes
            pw.close();
        }

        //Catch Method
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }


}
