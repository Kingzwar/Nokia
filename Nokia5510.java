import java.util.Scanner;

public class Nokia{
    public static void main(String[] agrs){

            while(true){
        System.out.println("1. Contacts");
        System.out.println("2. Message");
        System.out.println("3. Games");
        System.out.println("4. Settings");
        System.out.println("5. Exit");

    Scanner input = new Scanner(System.in);

      System.out.print("Enter number: ");
      int number = input.nextInt();


        switch(number){
            case 1 -> {System.out.println("open contact");

                    while (true) {
                    String openContact = """
                                            1.Name
                                            2. Address

                                        """;
                  System.out.println(openContact);
                  System.out.print("Enter a number: ");
                  int numberOne = input.nextInt();
                  
                switch(numberOne){
                    case 1 -> System.out.println("Name");

                    case 2 -> System.out.println("Address");
                }
                    if (numberOne == 0) {
                        break;
                    }
                }
                
                
                }
           

            case 2 -> System.out.println("open message");

            case 3 -> System.out.println("open game");

            case 4 -> System.out.println("open settings");

            case 5 -> System.out.println("Exit");

            case 0 -> System.out.println("Return");

            default -> System.out.println("Invalid number");

            }
                if (number == 0) {
                    break;
                }
        }
    }
}
