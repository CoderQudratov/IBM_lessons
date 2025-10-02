import java.util.Scanner;

public class ExceptionTrial {
    public static void main(String[] args) {
        //Create a Scanner object to read user input
        Scanner scanner =new Scanner(System.in);

        //Initalize an array to store up 5 strings
        String strArr[]=new  String[5];

        //Variable to track curent index  for adding strings
        int strIdx=0;

        //Infinitive loop to keep the program running until user choes to exit
        while (true){
            //Display menu to the opions th the user
            System.out.println(
                    "Press 1 to add String, " +
                            "\n2 to get String from a particular index, " +
                            "\n3 to get the length string in any index, " +
                            "\n4 to get all the strings in the array " +
                            "\nany other key to exit");
            //Read user choise
            String userAction = scanner.nextLine();
         //Option 1: Add a string to array
            if (userAction.equals("1")){
                //check if array already full
                if (strIdx==5){
                    System.out.println("There are array already full");
                }else {
                    //prompt the user to enter a string
                    System.out.println("Enter the String");
                    String inputStr=scanner.nextLine();

                    //Add the string  to the array  and increment  th index
                    strArr[strIdx++]=inputStr;
                }
            }
            // Option 2: Retrieve a string from a specific index
            else if(userAction.equals("2")){
               try {
                   //prompt the user to enter the index
                   System.out.println("Enter th index  you want retrieve");
                   int retIdx=Integer.parseInt(scanner.nextLine());
                   System.out.println("String at index "+retIdx+": "+strArr[retIdx]);
               }catch (NumberFormatException e){
                   System.out.println("invalid input! Please  enter a valid  integer");
               }catch (ArrayIndexOutOfBoundsException e){
                   System.out.println("Invalid index! Please enter an index  between 0 and "+(strArr.length-1));
               }
            }
            //Option 3: Get the length of a string at a specific  index
            else if (userAction.equals("3")) {
                try {
                    //Promtp the user to enter th index
                    int retIdx =Integer.parseInt(scanner.nextLine());
                    System.out.println("Length of at string index "+retIdx+": "+strArr[retIdx].length());
                }catch (NumberFormatException e){
                    System.out.println("Invalid input! Please enter a valid integer.");
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Invalid index! Please enter an index between 0 and " + (strArr.length -1));
                }catch (NullPointerException e){
                    System.out.println("No string exists at the specifed index!");
                }

            }
            // Option 4:Get all the string in the array
            else if (userAction.equals("4")) {
                for (int i = 0; i < 5; i++) {
                  if (strArr[i]!=null){
                      System.out.println("Index "+i+": "+strArr[i]);
                  }else {
                      System.out.println("Index " + i + ": (null)");
                  }
                }
            }else {
                break;
            }

        }
        scanner.close();


    }
}
