/* Yash Parikh APCS Period 2 9/14/19 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
 // go from letters to binary and then take each word into a jagged two d array. 

class NumSysMenu {

//DECLARING VARIABLES
Scanner sc;
int input1;
String original; 
String base1;
public boolean moreBases = true; 
String conversionEntry[][] = new String[3][];
int counter = 0;
ArrayList<String> manualinputList = new ArrayList<>(Arrays.asList());
NumSysConv converter = new NumSysConv();

public NumSysMenu(){ //constructor for scanner
this.sc = new Scanner(System.in);

}

public void mainMenu(){  //MENU 1, convert or quit
System.out.println("Welcome. Type 1 to convert, or type 2 to quit");
input1 = sc.nextInt();

//THIS THING  HERE


if (input1 == 1){
  convertMenu1(); //send them onwards
}

if (input1 == 2){ //bye
  System.out.println("Thanks for using the application!");
  System.exit(0);
}
if ((input1 != 2) && (input1 != 1)) {
  System.out.println("Try again, please enter a valid input");
  input1 = sc.nextInt(); //catch any other answer
}
}
public void convertMenu1(){ // input level 1
  System.out.println("Enter value to be converted");
  conversionEntry[0] = new String[1];
  conversionEntry[0][0] = sc.next();  // add this to the first value
  System.out.println("Okay, you entered:" +conversionEntry[0][0]); //UI is important
  convertMenu2();
  // System.out.println("Enter original radix");

  //System.out.println("enter one of the conversions you want. If you are done adding bases to conver to, please type DONE, otherwise type in ALL to get the default of 2,8,10, and 16 (except for the one you entered)");

}
public void convertMenu2(){
  System.out.println("Enter original radix");
  conversionEntry[1] = new String[1];
  base1 = sc.next(); 
  conversionEntry[1][0]= base1; 
  System.out.println("Okay, you entered: " + base1);//UI is important
  convertMenu3(); // send it forwards with the base so I can cross check that later
}

public void convertMenu3(){
  System.out.println("Convert to:"); 
  
  System.out.println("COMMON BASES [2,8,10,16] - Type 'ALL' - except if one of these was the original base");
  
  System.out.println("CUSTOM - enter bases seperated by an enter - Type DONE once finished adding individually");q1
//loops need to be basically I check their entry, add it if it's not DONE. If it is Done, then I send onto conversion mechanism.


while (moreBases = true){
  String input= sc.next();


if (input.matches("DONE")){ //ENDING PART
  //INSERT NUM SYSTEM CONVERISON THING
  System.out.println("Converting, please wait");
  moreBases= false;
/*  for (int printer= 0; printer < conversionEntry[2].length; printer++){
  System.out.println(Arrays.toString(conversionEntry[printer]));
   }*/
  converter.convertBases(conversionEntry);

}


else if (input.matches("ALL")){ // ALL OPTION EQUIVALENT

    conversionEntry[2]= new String[4]; //third array starts as size four
    conversionEntry[2][0] = "2";  //initialize the values here for the third array
    conversionEntry[2][1] = "8";
    conversionEntry[2][2] = "10";
    conversionEntry[2][3] = "16"; 
  System.out.println("Converting into the following bases" + Arrays.toString(conversionEntry[2]));
  // SEND IT TO THE THING NOW

   converter.convertBases(conversionEntry);
}

else {	
  manualinputList.add(input);
  conversionEntry[2] = manualinputList.toArray(new String[manualinputList.size()]);
  }
  System.out.println("you've requested " +Arrays.toString(conversionEntry[2]) + "! Add another base, or type in DONE to conver the value to these other bases.");

}//end while loop

 } // end convertmenu3 method
} //end class

//piblic conv obj

/**
    for (int printer= 0; printer < conversionEntry[2].length; printer++){
     System.out.println(Arrays.toString(conversionEntry[printer]));
   }
   */ // TO PRINT THE ARRAY WHEN I WANT TO CHECK SOMETHING


 /* ArrayList<String> conversionList = new ArrayList<>(Arrays.asList(conversionEntry[2]));
  conversionList.add(input);
  System.out.println(conversionList); */