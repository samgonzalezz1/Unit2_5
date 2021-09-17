public class Unit2_6ExternalStrings {
  
  public void litteralsAndObjectStrings() {
    
    //Difference between string @literal and string objects.
    String litteral1 = "Bob Smith";
    String objectInstance1 = new String("John Weston");
    String objectInstance2 = new String(litteral1); 
    
    System.out.println(litteral1);
    System.out.println(objectinstance1);
    System.out.println(objectInstance2);
  }
  
  public void concatinatingStrings() {
    
    // + joins, 
    //+= joins and redefines
    String litteral1 = "Bob Smith";
    String objectInstance1 = new String("John Weston");
    int bobsAge = 57;
    int johnsAge = 17;
    //here we can add the int and it is recast as a string 
    String bobInfo = litteral1 + "is" + bobsAge;
    //objectInstance1 = objectInstance1+johnsAge;
    objectInstance1 += johnsAge;
    
    System.out.println(bobInfo);
    System.out.println(objectInstance1);
  }
  
  public void escapeSequence() {
    
    // escape sequences start with a backslash -> \ 
    // \" prints a double quote
    // \\ prints backslash 
    // \n inserts a new line. like System.out.println
    
    String litteral1 = "Bob Smith"; 
    String objectInstance1 = new String("John Weston");
    //If I want to print something out in double quotes
    System.out.println("\"+litteral1+"\")
    
    //If I want to print something out in backslashes
    System.out.println("\\"+litteral1+"\\");
    
    //If I want to add more lines besides println
    System.out.println(objectInstance1+"\n"+"\n"+"\n"+"\n");
    System.out.println(litteral1);
  }
}