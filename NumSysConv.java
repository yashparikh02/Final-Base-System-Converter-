/* Yash Parikh APCS Period 2 9/14/19 */

import java.util.Scanner;
import java.lang.Character;
import java.lang.*;

class NumSysConv {

  public void convertBases(String[][] conversionEntry){
    
    
    for (int i=0; i < conversionEntry[2].length; i++){ // go case by case
    
    int oldBase = Integer.parseInt(conversionEntry[1][0]);
    String convString = conversionEntry[0][0];
    int newBase = Integer.parseInt(conversionEntry[2][i]);
    int baseTen = 0;
    int remainder;
    String convValue = "";
    int newDividend;
    
    if (oldBase == newBase){
     continue;

    }
    else {
for (int pos = 0; pos < convString.length(); pos++){
        int value =(int) convString.charAt(pos); //
        if (value >47 && value < 58){
          baseTen = baseTen + ((value % 16) * (int) (Math.pow(oldBase, (convString.length() - pos - 1))));
          } // end the numerical side

        else {
            baseTen = baseTen + (((value % 32)+9) * (int) (Math.pow(oldBase, (convString.length() - pos - 1))));
          } //end the letter conversion side of it. 

    }//END POS LOOP TO MAKE BASE 10
  remainder = baseTen % newBase; // Accounting for first case before we start getting a variable newDividend
  newDividend = baseTen / newBase; // allows for newDividend to be set the first time. 
  /*System.out.println(remainder);
  System.out.println(newDividend); */
  if (remainder < 10){
            convValue = remainder + "" + convValue;
    }

      else{
          remainder = remainder + 55;
          char hex = (char) remainder;
          convValue = hex + "" + convValue;
    }

    while(newDividend != 0) //iterate through now that the first case is done, instead of making two nested for loops. 
    {
      remainder = newDividend % newBase;  //get the second value add it to string
        newDividend = newDividend / newBase;
  /*System.out.println(remainder);
  System.out.println(newDividend); */
      if (remainder < 10){ //numeric stuff
            convValue = remainder + "" + convValue; // add it in reverse order
    }

      else{
          remainder = remainder + 55; //Make it alphabet value
          char hex = (char) remainder; // cast as Char
          convValue = hex + "" + convValue;  // now we can add it in
    }
        }

    System.out.println("The base " + newBase + " representation of your input " + convString + " is: " + convValue); //PRINT THIS CONVERSION BEFORE LOOPING AGAIN
//

  }//end this for loop for this nnumber's conversion



    }

      
System.out.println("Thanks for using the converter, hope you enjoyed it. Made by Yash Parikh");
System.out.println(" ");

} // end the method

} // end Class