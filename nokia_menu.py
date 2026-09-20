main_menu = """
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
                 """
print(main_menu)

main = int(input("Enter number: "))

match main:
    case 1:
        print("PhoneBook")
        phone_book = """ 
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
               """
        print(phone_book)

        choice_one = int(input("Enter number: "))


        match choice_one:
            case 1: 
                 print("Search")

            case 2: 
                 print("Services Nos")

            case 3:
                 print("Add name")
                       
            case 4: 
                 print("Erase")
                        
            case 5:
                 print("Edit")
                        
            case 6: 
                 print("Copy")
                        
            case 7: 
                 print("Assign tone")
                        
            case 8:
                 print("Send b card")
                                                            
            case 9: 
                 print("Options")

                 options = """
                            1. Memory in use
                            2. Type of view
                            3. Memory status
                        """ 
                 print(options)
                 
                 choice_one = ("Enter number: ")
                            
                                                            
                 match choice_one:
                        case 1: 
                             print("Memory in use")
                               
                        case 2: 
                             print("Type of veiw")
                                
                        case 3: 
                             print("Memory status")
                                
                        case _: 
                             print("Invalid")
                                                       

            case 10: 
                 print("Speed dials")
                        
            case 11: 
                 print("Voice tags")
                        
            case _: 
                print("Invalid")
                        
    case 2: 
        print("Messages")
            
        messages = """ 
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
               """
        print(messages)

        choice_three = int(input("Enter number: "))
                          
        match choice_three:
            case 1: 
                 print("Write messages")

            case 2:
                 print("Inbox")

            case 3: 
                 print("Outbox")

            case 4:
                 print("Picture messages")

            case 5:
                 print("Templates")

            case 6:
                 print("Smileys")

            case 7:
                 print("Messages settings")
                 settings = """
                            1.Set 1
                            2.Common
                          """
                 print(settings)      

                 decision_one = int(input("Enter number: "))
                        
                 match decision_one:
                    case 1: 
                        print("Set")
                        setting = """
                                    1. Message centre number
                                    2. Message sent as
                                    3. Message validity
                                    """
                        print(setting)

                        decision_two = int(input("Enter number: "))

                        match decision_two:
                             case 1: print("Message centre number")

                             case 2: print("Message sent as")

                             case 3: print("Message validity")

                             case _: print("Invalid")
                             
                    case 2: 
                        print("Common")
                        common = """
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
                                """
                        print(common)

                        decision_three = int(input("Enter number: "))

                        match decision_three:
                            case 1: print("Delivery reports")

                            case 2: print("Reply via same centre")

                            case 3: print("Character support")

                            case _: print("Invalid")
                                        
                                    
                    case _: print("Invalid")
                    
                
            case 8: print("Info service")

            case 9: print("Voice mailbox number")

            case 10: print("Service command editor")

            case _: print("Invalid")

    case 3: 
        print("Chat")               

    case 4:
         print("Call register")
         register = """
                     1. Missed calls
                     2. Received calls
                     3. Dialled numbers
                     4. Erase recent call lists
                     5. Show call duration
                     6. Show call cost
                     7. Call cost settings
                     8. Prepaid credit
                    """
         print(register)

         call = int(input("Enter number: "))

         match call:
                    case 1: 
                        print("Missed calls")

                    case 2: 
                        print("Received calls")

                    case 3: 
                        print("Dialled numbers")

                    case 4: 
                        print("Erase recent call lists");

                    case 5: 
                        print("Show call duration")
                        show = """
                                1. Last call duration
                                2. All calls duration
                                3. Received calls duration
                                4. Dailled calls duration
                                5. Clears timers
                                    """
                        print(show)


                        duration = int(input("Enter number: "))

                        match duration:
                            case 1: 
                                print("Last call duration")

                            case 2: 
                                print("All calls duration")

                            case 3: 
                                print("Received calls duration")

                            case 4: 
                                print(" Dailled calls duration")

                            case 5: 
                                print(" Clears timers")

                            case _: 
                                print("Invalid")
                        
                    case 6: 
                        print("Show call costs")
                        cost = """
                                    1. Last call cost
                                    2. All calls cost
                                    3. Clear counters
                                     """
                        print(cost)

                        counters = int(input("Enter number: "))

                        match counters:
                            case 1: 
                                print("Last call cost")

                            case 2: 
                                print("All calls cost")

                            case 3: 
                                print("Clear counters")

                            case _: 
                                print("Invalid")
                                  
                    case 7: 
                        print("Call cost setting")
                        call_cost = """
                                    1. Call cost limit
                                    2. Show costs in
                                  """
                        print(call_cost)

                        limit = int(input("Enter number: "))
  
                        match limit:
                            case 1:
                                print("Call cost limit")

                            case 2:
                                print("Show costs in")

                            case _:
                                print("Invalid")           
                         
                    case 8: 
                        print("Prepaid credit")

                    case _:
                        print("Invalid")  

    case 5: 
        print("Tones")
        tone = """
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Computer
                5. Message alert tone
                6. keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                """
        print(tone)

        alert = int(input("Enter number: "))

        match alert:
            case 1: 
                print("Ringing tone")

            case 2: 
                print("Ringing volume")

            case 3: 
                print("Incoming call alert")

            case 4: 
                print("Computer")

            case 5: 
                print("Message alert tone")

            case 6: 
                print("Keypad tones")

            case 7: 
                print("Warning and game tones")

            case 8: 
                print("Vibrating alert")

            case 9: 
                print("Screen saver")

            case _: 
                print("Invalid")

    case 6: 
        print("Settings")
        security = """
                         1. Call setings
                         2. Phone settings
                         3. Security settings
                         4. Restore factory settings
                            """
        print(security)

        factory = int(input("Enter number: "))
                       
        match factory:
            case 1: 
                print(" Call setings")                                    
                redial = """
                            1. Automatic redial
                            2. Speed dialling
                            3. Call waiting options
                            4. Own number sending 
                            5. Phone line in use
                            6. Automatic answer
                            """
                print(redial)

                line = int(input("Enter number: "))

                match line:
                     case 1: 
                        print("Automatic redial")

                     case 2: 
                        print("Speed dialling")

                     case 3:
                        print("Call waiting options")

                     case 4: 
                        print("Own number sending")

                     case 5: 
                        print("Phone line in use")

                     case 6: 
                        print("Automatic answer")

                     case _: 
                        print("Invalid")

            case 2: 
                print("Phone setting")
                cell = """
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Confirm SIM service action
                          """
                print(cell)

                service = int(input("Enter number: "))

                match service:
                     case 1: 
                        print(" Language")

                     case 2: 
                        print("Cell info display")

                     case 3: 
                        print("Welcome note")

                     case 4: 
                        print("Network selection")

                     case 5: 
                        print("Confirm SIM service action")

                     case 6: 
                        print("Invalid")
                              
            case 3: 
                print("Security settings")        
                fixed = """
                         1. PIN code request
                         2. Call barring service
                         3. Fixed dialling
                         4. Closed user group
                         5. Security level
                         6. Change access codes
                            """
                print(fixed)

                level = int(input("Enter number: "))

                match level:
                     case 1: 
                        print("PIN code request")

                     case 2: 
                        print("Call barring service")

                     case 3: 
                        print("Fixed dialling")

                     case 4: 
                        print("Closed user group")
 
                     case 5: 
                        print("Security level")

                     case 6:
                        print("Change access codes")

                     case _: 
                        print("Invalid")

            case 4: 
                print("Restore factory settings")

            case _: 
                print("Invalid")
       
    case 7: 
        print("Call divert")

    case 8: 
        print("Music")
        sound = """
                  1. Music player
                  2. Radio
                  3. Recorder
                  4. Track list
                    """
        print(sound)

        player = int(input("Enter number: "))   

        match player:
             case 1:
                 print("Music player")

             case 2:
                 print("Radio")

             case 3:
                 print("Recorder")

             case 4:
                 print("Track list")

             case _:
                 print("Invalid")
        
    case 9:
         print("Game")

    case 10:
         print("Calculator")

    case 11: 
         print("Reminders")

    case 12:
         print("Clock")

         clock = """
                    1. Alarm clock
                    2. Clock settings
                    3. Date setting
                    4. Stopwatch
                    5. Countdown timer
                    6. Auto update of date and time
                      """
         print(clock)

         watch = int(input("Enter number: "))

         match watch:
             case 1: 
                print("Alarm clock")

             case 2:
                print("Clock settings")

             case 3:
                print("Date setting")

             case 4:
                print("Stopwatch")

             case 5:
                print("Countdown timer")

             case 6:
                print("Auto update of date and time")

             case _:
                print("Invalid")


    case 13:
         print("Profiles")

    case 14:
         print("Services")

    case 15: 
         print("SIM services")

    case _:
         print("Invalid")

