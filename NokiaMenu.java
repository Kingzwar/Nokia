import java.util.Scanner;

public class Nokia{
    public static void main(String[] args){

              
        String mainMenu = """
              ==============MainMenu================
                            1. PhoneBook
                            2. Messages
                            3. Chat
                            4. Call Register
                            5. Tones
                            6. Settings
                            7. Call divert
                            8. Music
                            9. Games
                            10. Calculator 
                            11. Reminders
                            12. Clocks
                            13. Profile
                            14. Services
                            15. SIM services
                         """;
            System.out.println(mainMenu);

    Scanner input = new Scanner(System.in);

      System.out.print("Enter number: ");
      int number = input.nextInt();

        switch(number){
            case 1 -> {System.out.println("PhoneBook");
                        String phoneBook = """ 
                                              1. Search
                                              2. Services Nos
                                              3. Add name
                                              4. Erase
                                              5. Edit
                                              6. Copy
                                              7. Assign tone
                                              8. Send b card
                                              9. Options
                                              10. Speed dials
                                              11. Voice tags
                                           """;
                            System.out.print(phoneBook);

                  System.out.print("Enter number: ");
                  int numberOne = input.nextInt();
                  
                switch(numberOne){
                    case 1 -> System.out.println("Search");

                    case 2 -> System.out.println("Services Nos");

                    case 3 -> System.out.println("Add name");

                    case 4 -> System.out.println("Erase");

                    case 5 -> System.out.println("Edit");

                    case 6 -> System.out.println("Copy");

                    case 7 -> System.out.println("Assign tone");

                    case 8 -> System.out.println("Send b card");
 
                    case 9 -> {System.out.println("Options");
 
                                        String options = """
                                                            1. Memory in use
                                                            2. Type of view
                                                            3. Memory status
                                                        """; 
                                                    System.out.print(options);

                                            System.out.print("Enter number: ");
                                            int choiceOne = input.nextInt();
                                        
                                        switch(choiceOne){
                                                case 1 -> System.out.println("Memory in use");

                                                case 2 -> System.out.println("Type of veiw");

                                                case 3 -> System.out.println("Memory status");

                                                default -> System.out.println("Invalid");
                                         }
                            }

                    case 10 -> System.out.println("Speed dials");

                    case 11 -> System.out.println("Voice tags");

                    default -> System.out.println("Invalid");
                      }
                }

            case 2 ->  {System.out.println("Messages");
                                String messages = """ 
                                              1. Write messages
                                              2. Inbox
                                              3. Outbox
                                              4. Picture messages
                                              5. Templates
                                              6. Smileys
                                              7. Message settings
                                              8. Info service 
                                              9. Voice mailbox number
                                             10. Service command editor
                                           """;
                               System.out.print(messages);
 

                  System.out.print("Enter number: ");
                  int numberTwo = input.nextInt();
                  
                switch(numberTwo){
                    case 1 -> System.out.println("Write messages");

                    case 2 -> System.out.println("Inbox");

                    case 3 -> System.out.println("Outbox");

                    case 4 -> System.out.println("Picture messages");

                    case 5 -> System.out.println("Templates");

                    case 6 -> System.out.println("Smileys");

                    case 7 -> {System.out.println("Messages settings");
                                            String settings = """
                                                            1.Set 1
                                                            2.Common
                                                          """;
                               System.out.print(settings);

                    System.out.print("Enter number: ");
                    int decisionOne = input.nextInt();

                switch(decisionOne){
                    case 1 -> {System.out.println("Set");
                                            String set = """
                                                        1. Message centre number
                                                        2. Message sent as
                                                        3. Message validity
                                                        """;
                                     System.out.print(set);

                    System.out.print("Enter number: ");
                    int decisionTwo = input.nextInt();

                switch(decisionTwo){
                     case 1 -> System.out.println("Message centre number");

                     case 2 -> System.out.println("Message sent as");

                     case 3 -> System.out.println("Message validity");

                     default -> System.out.println("Invalid");
                             }
                         }


                    case 2 -> {System.out.println("Common");
                                            String common = """
                                                            1. Delivery reports
                                                            2. Reply via same centre
                                                            3. Character support
                                                            """;
                                             System.out.print(common);

                        System.out.print("Enter number: ");
                        int decisionThree = input.nextInt();

                switch(decisionThree){
                    case 1 -> System.out.println("Delivery reports");

                    case 2 -> System.out.println("Reply via same centre");

                    case 3 -> System.out.println("Character support");

                    default -> System.out.println("Invalid");
                            }
                        }
                    default -> System.out.println("Invalid");
                    }
                }
                    case 8 -> System.out.println("Info service");

                    case 9 -> System.out.println("Voice mailbox number");

                    case 10 -> System.out.println("Service command editor");

                    default -> System.out.println("Invalid");
             }   
          }
 
                    case 3 -> System.out.println("Chat");               

                    case 4 -> {System.out.println("Call register");
                                                String register = """
                                                                 1. Missed calls
                                                                 2. Received calls
                                                                 3. Dialled numbers
                                                                 4. Erase recent call lists
                                                                 5. Show call duration
                                                                 6. Show call cost
                                                                 7. Call cost settings
                                                                 8. Prepaid credit
                                                                """;
                                                System.out.println(register);

                   System.out.println("Enter number: ");
                   int call = input.nextInt();

                switch(call){
                    case 1 -> System.out.println("Missed calls");

                    case 2 -> System.out.println("Received calls");

                    case 3 -> System.out.println("Dialled numbers");

                    case 4 -> System.out.println("Erase recent call lists");

                    case 5 -> {System.out.println("Show call duration");
                                                String show = """
                                                            1. Last call duration
                                                            2. All calls duration
                                                            3. Received calls duration
                                                            4. Dailled calls duration
                                                            5. Clears timers
                                                                """;
                                                System.out.println(show);

                    System.out.println("Enter number: ");
                    int duration = input.nextInt();

                switch(duration){
                    case 1 -> System.out.println("Last call duration");

                    case 2 -> System.out.println("All calls duration");

                    case 3 -> System.out.println("Received calls duration");

                    case 4 -> System.out.println(" Dailled calls duration");

                    case 5 -> System.out.println(" Clears timers");

                    default -> System.out.println("Invalid");
                         }
                    }

                    case 6 -> {System.out.println("Show call costs");
                                               String cost = """
                                                            1. Last call cost
                                                            2. All calls cost
                                                            3. Clear counters
                                                             """;
                                                System.out.println(cost);

                    System.out.println("Enter number: ");
                    int counters = input.nextInt();

                switch(counters){
                    case 1 -> System.out.println("Last call cost");

                    case 2 -> System.out.println("All calls cost");

                    case 3 -> System.out.println("Clear counters");

                    default -> System.out.println("Invalid");
                          }
                     }

                    case 7 -> {System.out.println("Call cost setting");
                                                String callCost = """
                                                            1. Call cost limit
                                                            2. Show costs in
                                                          """;
                                                 System.out.print(callCost);

                    System.out.print("Enter number: ");
                    int limit = input.nextInt();
  
                switch(limit){
                    case 1 -> System.out.println("Call cost limit");

                    case 2 -> System.out.println("Show costs in");

                    default -> System.out.println("Invalid");
                           }
                      }               
                 
                    case 8 -> System.out.println("Prepaid credit");

                    default -> System.out.println("Invalid");
                    }
             }

                    case 5 -> {System.out.println("Tones");
                                               String tone = """
                                                            1. Ringing tone
                                                            2. Ringing volume
                                                            3. Incoming call alert
                                                            4. Computer
                                                            5. Message alert tone
                                                            6. keypad tones
                                                            7. Warning and game tones
                                                            8. Vibrating alert
                                                            9. Screen saver
                                                            """;
                                                System.out.println(tone);

                        System.out.print("Enter number: ");
                        int alert = input.nextInt();

                switch(alert){
                    case 1 -> System.out.println("Ringing tone");

                    case 2 -> System.out.println("Ringing volume");

                    case 3 -> System.out.println("Incoming call alert");

                    case 4 -> System.out.println("Computer");

                    case 5 -> System.out.println("Message alert tone");

                    case 6 -> System.out.println("Keypad tones");

                    case 7 -> System.out.println("Warning and game tones");

                    case 8 -> System.out.println("Vibrating alert");

                    case 9 -> System.out.println("Screen saver");

                    default -> System.out.println("Invalid");
                }
             }   

                    case 6 -> {System.out.println("Settings");
                                                String security = """
                                                                 1. Call setings
                                                                 2. Phone settings
                                                                 3. Security settings
                                                                 4. Restore factory settings
                                                                    """;
                                                System.out.println(security);

                        System.out.println("Enter number: ");
                        int factory = input.nextInt();

                    switch(factory){
                    case 1 -> {System.out.println(" Call setings");                                    
                                                String redial = """
                                                                1. Automatic redial
                                                                2. Speed dialling
                                                                3. Call waiting options
                                                                4. Own number sending 
                                                                5. Phone line in use
                                                                6. Automatic answer
                                                                """;
                                                  System.out.println(redial);

                        System.out.println("Enter number: ");
                        int line = input.nextInt();

                switch(line){
                     case 1 -> System.out.println("Automatic redial");

                     case 2 -> System.out.println("Speed dialling");

                     case 3 -> System.out.println("Call waiting options");

                     case 4 -> System.out.println("Own number sending");
 
                     case 5 -> System.out.println("Phone line in use");

                     case 6 -> System.out.println("Automatic answer");

                     default -> System.out.println("Invalid");
                    }
                }
                    case 2 -> {System.out.println("Phone setting");
                                                String cell = """
                                                            1. Language
                                                            2. Cell info display
                                                            3. Welcome note
                                                            4. Network selection
                                                            5. Confirm SIM service action
                                                              """;
                                                System.out.println(cell);

                        System.out.println("Enter number: ");
                        int service = input.nextInt();

                  switch(service){
                     case 1 -> System.out.println(" Language");

                     case 2 -> System.out.println("Cell info display");

                     case 3 -> System.out.println("Welcome note");

                     case 4 -> System.out.println("Network selection");
 
                     case 5 -> System.out.println("Confirm SIM service action");

                     default -> System.out.println("Invalid");
                          }
                    }
                     case 3 -> {System.out.println("Security settings");        
                                                String fixed = """
                                                             1. PIN code request
                                                             2. Call barring service
                                                             3. Fixed dialling
                                                             4. Closed user group
                                                             5. Security level
                                                             6. Change access codes
                                                                """;
                                                 System.out.println(fixed);

                        System.out.println("Enter number: ");
                        int level = input.nextInt();  

                  switch(level){
                     case 1 -> System.out.println("PIN code request");

                     case 2 -> System.out.println("Call barring service");

                     case 3 -> System.out.println("Fixed dialling");

                     case 4 -> System.out.println("Closed user group");
 
                     case 5 -> System.out.println("Security level");

                     case 6 -> System.out.println("Change access codes");

                     default -> System.out.println("Invalid");

                          }
                    }

                      case 4 -> System.out.println("Restore factory settings");

                      default -> System.out.println("Invalid");
               }
            }
                     case 7 -> System.out.println("Call divert");

                     case 8 -> {System.out.println("Music");
                                                String sound = """
                                                              1. Music player
                                                              2. Radio
                                                              3. Recorder
                                                              4. Track list
                                                                """;
                                                System.out.println(sound);

                        System.out.println("Enter number: ");
                        int player = input.nextInt();    

                switch(player){
                    case 1 -> System.out.println("Music player");

                    case 2 -> System.out.println("Radio");

                    case 3 -> System.out.println("Recorder");

                    case 4 -> System.out.println("Track list");

                    default -> System.out.println("Invalid");
                }
            }

                    case 9 -> System.out.println("Game");

                    case 10 -> System.out.println("Calculator");

                    case 11 -> System.out.println("Reminders");

                    case 12 -> {System.out.println("Clock");
                                                String clock = """
                                                            1. Alarm clock
                                                            2. Clock settings
                                                            3. Date setting
                                                            4. Stopwatch
                                                            5. Countdown timer
                                                            6. Auto update of date and time
                                                              """;
                                                System.out.println(clock);

                        System.out.println("Enter number: ");
                        int watch = input.nextInt(); 

                  switch(watch){
                     case 1 -> System.out.println("Alarm clock");

                     case 2 -> System.out.println("Clock settings");

                     case 3 -> System.out.println("Date setting");

                     case 4 -> System.out.println("Stopwatch");
 
                     case 5 -> System.out.println("Countdown timer");

                     case 6 -> System.out.println("Auto update of date and time");

                     default -> System.out.println("Invalid");

                          }
                }

                    case 13 -> System.out.println("Profiles");

                    case 14 -> System.out.println("Services");

                    case 15 -> System.out.println("SIM services");

                    default -> System.out.println("Invalid");
         }
    }
}
