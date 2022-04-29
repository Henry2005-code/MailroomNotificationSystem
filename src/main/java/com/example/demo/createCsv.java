package com.example.demo;//Imported java.io package
import java.io.*;

//Imported java.io.filewriter

//Imported java.io.IOException

//Imported java.io.PrintWriter
import java.io.PrintWriter;

//Created the class addStudent 
public class createCsv
  {
    //Created the firstname String
    String firstName;

    //created the LastName String
    String lastName;

    //Created the emailAddress String
    String emailAddress;
  
    //Created the addStudent Constructor
    public createCsv(String firstName, String lastName, String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }
  
    //Created the toString method
    public String toString(){
        return "(" + firstName + ","  + lastName + "," + emailAddress + ")";
    }
  
    //defined the main class
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter(new File("src/addresses.txt"));

            StringBuffer csvHeader = new StringBuffer("");
            StringBuffer csvData = new StringBuffer("");
            csvHeader.append("Name");
            csvHeader.append(",");
            csvHeader.append("Age");
            csvHeader.append(",");
            csvHeader.append("EmailAddress");
            csvHeader.append("\n");
            // write header
            pw.write(csvHeader.toString());

          // write individual student data
            csvData.append("Henry");
            csvData.append(',');
            csvData.append("Fowobaje");
            csvData.append(',');
            csvData.append("fowobaje2005@gmail.com");
            csvData.append('\n');

          // write individual student data
            csvData.append("Henry");
            csvData.append(',');
            csvData.append("David");
            csvData.append(',');
            csvData.append("henrybusiness987@gmail.com");
            csvData.append('\n');

          // write individual student data
            csvData.append("Collins");
            csvData.append(',');
            csvData.append("Ikpeyi");
            csvData.append(',');
            csvData.append("CIkpeyi05@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Joshua");
            csvData.append(',');
            csvData.append("Amosu");
            csvData.append(',');
            csvData.append("JOAmosu21@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Chukwuanogo");
            csvData.append(',');
            csvData.append("Obiaga");
            csvData.append(',');
            csvData.append("CPObiaga27@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Shalom");
            csvData.append(',');
            csvData.append("Akinbulomo");
            csvData.append(',');
            csvData.append("SOAkinbulomo07@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Oluwatamilore");
            csvData.append(',');
            csvData.append("Oladejo");
            csvData.append(',');
            csvData.append("OPOladejo21@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Henry");
            csvData.append(',');
            csvData.append("David");
            csvData.append(',');
            csvData.append("henrybusiness987@gmail.com");
            csvData.append('\n');

          // write individual student data
            csvData.append("Nwankwo");
            csvData.append(',');
            csvData.append("Prosper");
            csvData.append(',');
            csvData.append("PCNwankwo24@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Ikechi");
            csvData.append(',');
            csvData.append("Africs");
            csvData.append(',');
            csvData.append("IMAfrics15@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Feyisayo");
            csvData.append(',');
            csvData.append("Adeaga");
            csvData.append(',');
            csvData.append("FAAdeaga07@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Henry");
            csvData.append(',');
            csvData.append("David");
            csvData.append(',');
            csvData.append("CEUba20@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Foluso");
            csvData.append(',');
            csvData.append("Adeyemi");
            csvData.append(',');
            csvData.append("FVAdeyemi05@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Elijah");
            csvData.append(',');
            csvData.append("Okoroh");
            csvData.append(',');
            csvData.append("EOOkoroh08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Philip");
            csvData.append(',');
            csvData.append("Fowobaje");
            csvData.append(',');
            csvData.append("PAOlapade@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Angel");
            csvData.append(',');
            csvData.append("Adetula");
            csvData.append(',');
            csvData.append("AAAdetula11@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Camari");
            csvData.append(',');
            csvData.append("Nwokorie");
            csvData.append(',');
            csvData.append("CRNwokorie10@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Elijah");
            csvData.append(',');
            csvData.append("Okoroh");
            csvData.append(',');
            csvData.append("EOOkoroh08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Wisdom");
            csvData.append(',');
            csvData.append("Dayok");
            csvData.append(',');
            csvData.append("WODayok11@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Omayorkun");
            csvData.append(',');
            csvData.append("Oyefeso");
            csvData.append(',');
            csvData.append("OTOyefeso10@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Emmanuel");
            csvData.append(',');
            csvData.append("Adeyemi");
            csvData.append(',');
            csvData.append("eiadeyemi05@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Kelechi");
            csvData.append(',');
            csvData.append("Nnorom");
            csvData.append(',');
            csvData.append("kcnnorom20@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Amarachuckwu");
            csvData.append(',');
            csvData.append("Iyke-Osuji");
            csvData.append(',');
            csvData.append("aosuji31@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Oluwalayomi");
            csvData.append(',');
            csvData.append("Fadero");
            csvData.append(',');
            csvData.append("otfadero09@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Jowayne");
            csvData.append(',');
            csvData.append("Hudson");
            csvData.append(',');
            csvData.append("jmhudson29@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Ayomide");
            csvData.append(',');
            csvData.append("Adewale");
            csvData.append(',');
            csvData.append("ajadewale27@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Chibuikem");
            csvData.append(',');
            csvData.append("Iheagwaram");
            csvData.append(',');
            csvData.append("csiheagwaram10@my.fisk.edu");
            csvData.append('\n');         

          // write individual student data
            csvData.append("Dinesh");
            csvData.append(',');
            csvData.append("Pandey");
            csvData.append(',');
            csvData.append("dpandey08@my.fisk.edu");
            csvData.append('\n');   

          // write individual student data
            csvData.append("Rejin");
            csvData.append(',');
            csvData.append("Nepal");
            csvData.append(',');
            csvData.append("rnepal30@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Mariam");
            csvData.append(',');
            csvData.append("Olagoke");
            csvData.append(',');
            csvData.append("mmolagoke04@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Onyinye");
            csvData.append(',');
            csvData.append("Ejiaka");
            csvData.append(',');
            csvData.append("ofejiaka04@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Aderinsola");
            csvData.append(',');
            csvData.append("Oladunmade");
            csvData.append(',');
            csvData.append("aaoladunmade13@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Hephzibah");
            csvData.append(',');
            csvData.append("Agunbiade");
            csvData.append(',');
            csvData.append("haagunbiade10@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Akwesi");
            csvData.append(',');
            csvData.append("Peasare");
            csvData.append(',');
            csvData.append("aopeasare01@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Sopuruchi");
            csvData.append(',');
            csvData.append("Ndubuisi");
            csvData.append(',');
            csvData.append("sundubuisi08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Awantika");
            csvData.append(',');
            csvData.append("Bastola");
            csvData.append(',');
            csvData.append("abastola21@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Bethel");
            csvData.append(',');
            csvData.append("Arthur");
            csvData.append(',');
            csvData.append("barthur28@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Chinaza");
            csvData.append(',');
            csvData.append("Belolisa");
            csvData.append(',');
            csvData.append("csbelolisa09@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Ann");
            csvData.append(',');
            csvData.append("Ebhonu");
            csvData.append(',');
            csvData.append("aeebhounu08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Benzema");
            csvData.append(',');
            csvData.append("Kelechi");
            csvData.append(',');
            csvData.append("fowobaje2005@gmail.com");
            csvData.append('\n');

          // write individual student data
            csvData.append("Karim");
            csvData.append(',');
            csvData.append("Adeyemi");
            csvData.append(',');
            csvData.append("henrybusiness987@gmail.com");
            csvData.append('\n');

          // write individual student data
            csvData.append("Robert");
            csvData.append(',');
            csvData.append("Luiz");
            csvData.append(',');
            csvData.append("CIkpeyi05@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Okafor");
            csvData.append(',');
            csvData.append("David");
            csvData.append(',');
            csvData.append("JOAmosu21@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("King");
            csvData.append(',');
            csvData.append("Kingdom");
            csvData.append(',');
            csvData.append("CPObiaga27@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Mike");
            csvData.append(',');
            csvData.append("Fola");
            csvData.append(',');
            csvData.append("SOAkinbulomo07@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Buhari");
            csvData.append(',');
            csvData.append("Ahmed");
            csvData.append(',');
            csvData.append("OPOladejo21@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Musa");
            csvData.append(',');
            csvData.append("Moses");
            csvData.append(',');
            csvData.append("henrybusiness987@gmail.com");
            csvData.append('\n');

          // write individual student data
            csvData.append("Victor");
            csvData.append(',');
            csvData.append("Osihmen");
            csvData.append(',');
            csvData.append("PCNwankwo24@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Fekomi");
            csvData.append(',');
            csvData.append("Davies");
            csvData.append(',');
            csvData.append("IMAfrics15@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Henry");
            csvData.append(',');
            csvData.append("Timothy");
            csvData.append(',');
            csvData.append("FAAdeaga07@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Oriyomi");
            csvData.append(',');
            csvData.append("Joshua");
            csvData.append(',');
            csvData.append("CEUba20@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Thor");
            csvData.append(',');
            csvData.append("Maddison");
            csvData.append(',');
            csvData.append("FVAdeyemi05@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("James");
            csvData.append(',');
            csvData.append("Olamide");
            csvData.append(',');
            csvData.append("EOOkoroh08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Jamie");
            csvData.append(',');
            csvData.append("Carragher");
            csvData.append(',');
            csvData.append("PAOlapade@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Israel");
            csvData.append(',');
            csvData.append("Aminu");
            csvData.append(',');
            csvData.append("AAAdetula11@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Kazeem");
            csvData.append(',');
            csvData.append("love");
            csvData.append(',');
            csvData.append("CRNwokorie10@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Takehiro");
            csvData.append(',');
            csvData.append("Tomiyasu");
            csvData.append(',');
            csvData.append("EOOkoroh08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Jordi");
            csvData.append(',');
            csvData.append("Alba");
            csvData.append(',');
            csvData.append("WODayok11@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Matt");
            csvData.append(',');
            csvData.append("Telles");
            csvData.append(',');
            csvData.append("OTOyefeso10@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Tierney");
            csvData.append(',');
            csvData.append("Kieran");
            csvData.append(',');
            csvData.append("eiadeyemi05@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Leon");
            csvData.append(',');
            csvData.append("Frank");
            csvData.append(',');
            csvData.append("kcnnorom20@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Ruben");
            csvData.append(',');
            csvData.append("Allan");
            csvData.append(',');
            csvData.append("aosuji31@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Lahm");
            csvData.append(',');
            csvData.append("Ali");
            csvData.append(',');
            csvData.append("otfadero09@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Duncan");
            csvData.append(',');
            csvData.append("Tim");
            csvData.append(',');
            csvData.append("jmhudson29@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Lebron");
            csvData.append(',');
            csvData.append("Pulisic");
            csvData.append(',');
            csvData.append("ajadewale27@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Stephen");
            csvData.append(',');
            csvData.append("Woods");
            csvData.append(',');
            csvData.append("csiheagwaram10@my.fisk.edu");
            csvData.append('\n');         

          // write individual student data
            csvData.append("Bush");
            csvData.append(',');
            csvData.append("Obama");
            csvData.append(',');
            csvData.append("dpandey08@my.fisk.edu");
            csvData.append('\n');   

          // write individual student data
            csvData.append("Tiger");
            csvData.append(',');
            csvData.append("Mark");
            csvData.append(',');
            csvData.append("rnepal30@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Scottie");
            csvData.append(',');
            csvData.append("Barnes");
            csvData.append(',');
            csvData.append("mmolagoke04@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Cade");
            csvData.append(',');
            csvData.append("Brown");
            csvData.append(',');
            csvData.append("ofejiaka04@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Jalen");
            csvData.append(',');
            csvData.append("Green");
            csvData.append(',');
            csvData.append("aaoladunmade13@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Benjamin");
            csvData.append(',');
            csvData.append("Kent");
            csvData.append(',');
            csvData.append("haagunbiade10@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Franz");
            csvData.append(',');
            csvData.append("Wagner");
            csvData.append(',');
            csvData.append("aopeasare01@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Thomas");
            csvData.append(',');
            csvData.append("Partey");
            csvData.append(',');
            csvData.append("sundubuisi08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Xhaka");
            csvData.append(',');
            csvData.append("Bellerin");
            csvData.append(',');
            csvData.append("abastola21@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Odegaard");
            csvData.append(',');
            csvData.append("Martinelli");
            csvData.append(',');
            csvData.append("barthur28@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Kante");
            csvData.append(',');
            csvData.append("Rudiger");
            csvData.append(',');
            csvData.append("csbelolisa09@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("George");
            csvData.append(',');
            csvData.append("Bullis");
            csvData.append(',');
            csvData.append("aeebhounu08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Irena");
            csvData.append(',');
            csvData.append("Bryant");
            csvData.append(',');
            csvData.append("fowobaje2005@gmail.com");
            csvData.append('\n');

          // write individual student data
            csvData.append("Chisom");
            csvData.append(',');
            csvData.append("Okwor");
            csvData.append(',');
            csvData.append("henrybusiness987@gmail.com");
            csvData.append('\n');

          // write individual student data
            csvData.append("Sonia");
            csvData.append(',');
            csvData.append("Okekenwa");
            csvData.append(',');
            csvData.append("CIkpeyi05@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Dimowo");
            csvData.append(',');
            csvData.append("Oiza");
            csvData.append(',');
            csvData.append("JOAmosu21@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Chidera");
            csvData.append(',');
            csvData.append("Apakama");
            csvData.append(',');
            csvData.append("CPObiaga27@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Timothy");
            csvData.append(',');
            csvData.append("Mazenge");
            csvData.append(',');
            csvData.append("SOAkinbulomo07@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Jeremy");
            csvData.append(',');
            csvData.append("Filler");
            csvData.append(',');
            csvData.append("OPOladejo21@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Waya");
            csvData.append(',');
            csvData.append("David");
            csvData.append(',');
            csvData.append("henrybusiness987@gmail.com");
            csvData.append('\n');

          // write individual student data
            csvData.append("Foller");
            csvData.append(',');
            csvData.append("Peter");
            csvData.append(',');
            csvData.append("PCNwankwo24@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Wyoming");
            csvData.append(',');
            csvData.append("Wallace");
            csvData.append(',');
            csvData.append("IMAfrics15@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Hota");
            csvData.append(',');
            csvData.append("Haque");
            csvData.append(',');
            csvData.append("FAAdeaga07@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Hines");
            csvData.append(',');
            csvData.append("Faulk");
            csvData.append(',');
            csvData.append("CEUba20@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Bukayo");
            csvData.append(',');
            csvData.append("Saka");
            csvData.append(',');
            csvData.append("FVAdeyemi05@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Oxlade");
            csvData.append(',');
            csvData.append("Chamberlain");
            csvData.append(',');
            csvData.append("EOOkoroh08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Ramsey");
            csvData.append(',');
            csvData.append("Jacob");
            csvData.append(',');
            csvData.append("PAOlapade@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Amina");
            csvData.append(',');
            csvData.append("Zainab");
            csvData.append(',');
            csvData.append("AAAdetula11@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Akin");
            csvData.append(',');
            csvData.append("Akinleye");
            csvData.append(',');
            csvData.append("CRNwokorie10@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Emile");
            csvData.append(',');
            csvData.append("Smith");
            csvData.append(',');
            csvData.append("EOOkoroh08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Aaron");
            csvData.append(',');
            csvData.append("Christian");
            csvData.append(',');
            csvData.append("WODayok11@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Benedict");
            csvData.append(',');
            csvData.append("John");
            csvData.append(',');
            csvData.append("OTOyefeso10@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("WHite");
            csvData.append(',');
            csvData.append("Benjamin");
            csvData.append(',');
            csvData.append("eiadeyemi05@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Gabriel");
            csvData.append(',');
            csvData.append("Joao");
            csvData.append(',');
            csvData.append("kcnnorom20@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Stones");
            csvData.append(',');
            csvData.append("Walker");
            csvData.append(',');
            csvData.append("aosuji31@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Cornelius");
            csvData.append(',');
            csvData.append("Stewart");
            csvData.append(',');
            csvData.append("otfadero09@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Dennis");
            csvData.append(',');
            csvData.append("Emmanuel");
            csvData.append(',');
            csvData.append("jmhudson29@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Scott");
            csvData.append(',');
            csvData.append("Parker");
            csvData.append(',');
            csvData.append("ajadewale27@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Martin");
            csvData.append(',');
            csvData.append("King");
            csvData.append(',');
            csvData.append("csiheagwaram10@my.fisk.edu");
            csvData.append('\n');         

          // write individual student data
            csvData.append("Vinesh");
            csvData.append(',');
            csvData.append("Vivek");
            csvData.append(',');
            csvData.append("dpandey08@my.fisk.edu");
            csvData.append('\n');   

          // write individual student data
            csvData.append("Tony");
            csvData.append(',');
            csvData.append("Stark");
            csvData.append(',');
            csvData.append("rnepal30@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Cody");
            csvData.append(',');
            csvData.append("Rhodes");
            csvData.append(',');
            csvData.append("mmolagoke04@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Roman");
            csvData.append(',');
            csvData.append("Reigns");
            csvData.append(',');
            csvData.append("ofejiaka04@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Jimmy");
            csvData.append(',');
            csvData.append("Uso");
            csvData.append(',');
            csvData.append("aaoladunmade13@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Riddle");
            csvData.append(',');
            csvData.append("Orton");
            csvData.append(',');
            csvData.append("haagunbiade10@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Matt");
            csvData.append(',');
            csvData.append("Randy");
            csvData.append(',');
            csvData.append("aopeasare01@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Bianca");
            csvData.append(',');
            csvData.append("Belair");
            csvData.append(',');
            csvData.append("sundubuisi08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Sonia");
            csvData.append(',');
            csvData.append("Deville");
            csvData.append(',');
            csvData.append("abastola21@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Lupita");
            csvData.append(',');
            csvData.append("Nyongo");
            csvData.append(',');
            csvData.append("barthur28@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Depp");
            csvData.append(',');
            csvData.append("Alice");
            csvData.append(',');
            csvData.append("csbelolisa09@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Bruce");
            csvData.append(',');
            csvData.append("Banner");
            csvData.append(',');
            csvData.append("aeebhounu08@my.fisk.edu");
            csvData.append('\n');

          // write individual student data
            csvData.append("Junior");
            csvData.append(',');
            csvData.append("Santos");
            csvData.append(',');
            csvData.append("aeebhounu08@my.fisk.edu");
            csvData.append('\n');
          
          
          
            
            pw.write(csvData.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
