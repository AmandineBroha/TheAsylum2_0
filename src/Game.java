

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  
 * 
 * 
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    protected final  Players player; 
    //declarations of items using in the game
     public final Item fairy = new Item("Fairy dust",1);
     public final Item item = new Item("key",1);
     public final Item note = new Item("note",1);
     public final Item bisous = new Item("magical kiss",1);
     public final Item translator = new Item("translator",1);
     public final Item poney = new Item("magical little poney",1);
     public final Item rainbow = new Item("Magical rainbow",1);
     public final Item potion = new Item("potion", 1);
     public final Item never = new Item("never ever EVER",1); 
    
    boolean enterHall = false;
    
    
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
        player = Players.getCurrentPlayer();
        
    }

    /**
     * Create all the rooms and link their exits together.
     */
   
    private void createRooms()
    {
        Room garden, hall, refectory, logeGardien, RobertRoom, stairs, kitchen, laboratory;
        Room directorOffice,Blackout, exit, chambreIRL, tulipefield, rainbowPlace,simbaPlace;
        Room caseDora, robotPlace;
      
        // create the rooms with a description of the room and a link for its  picture
        garden = new Room("in the garden","garden.png")
        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("");
            }
            
        };
        
//        garden = new Room("in the garden","/garden.png");
        hall = new Room("in the entry hall","hall.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                if (enterHall){
                    NewJDialog.addTextInConsole("");
                }
                else {
                    enterHall = true;
                    NewJDialog.addTextInConsole("You just entered the Asylum... \nnow let's discover the truth! \nVisit the building.\n");
                }
            }
            
        };
        refectory = new Room("in the refectory","refectoire.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("There does not seem to have a clue... \nContinue\n");            }
            
        };
        logeGardien = new Room("in the guardian lounge","logegardien.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("Press 'Choices' to fight!");
            }
            
        };
        RobertRoom = new Room("in Robert's bedroom","robert.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("You should find something interesting \nhere...\n"
                        + "You see a note on the floor : \n"
                        + "''I'm mad, I don't know if I ever going\n"
                        + " to get out of this Asylum. All I know is\n"
                        + "that I must find the director's office.''\n\n"
                        + "That's strange, It looks like my hand writing.\n"
                );
            }
            
        };
        stairs = new Room("in the stairs","stairs.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("");
            }
            
        };
        kitchen = new Room("in the kitchen","kitchen.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("There does not seem to have a clue... \nContinue\n");
            }
            
        };
        laboratory = new Room("in the laboratory","laboratory.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("You are meeting a mad scientist. \n \"Hi my dear friend! \n I hope you enjoy your visit. \n Let me ask you a little question \n before you continue...\n Maybe it will help you gaining some \nhealth, we don't know what could\n happen to you in the future!\" \nPress 'Choices' to get the health points!\n ");
            }
            
        };
        directorOffice = new Room("in the Head's office","bureauBoss.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("\"Hello Mr. Smith."
                        + "\nI was waiting for you...\n"
                        + "I will answer ALL\n"
                        + "of your questions...ONCE WE BATTLE!\n"
                        + "I'm not as weak as my henchmen!\n\n"
                        + "Press 'Choices' to fight!");
            }
            
        };
         Blackout = new Room("in the dark","noir.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("You lose against the Boss.\nYou knew that something was wrong\nwith this place.\nBefore you passed out\nyou felt that he has injected\nsomething to you.\nWhen you wake up, you see nothing\nexcept your own body.\n\nTry to move in every direction to\nfind a way out.");
            }
            
        };
        chambreIRL = new Room("in your cell","roomIRL.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("You've made a good job.\n"
                        + "You deserve the truth, Robert.\n"
                        + "You are not a journalist\n"
                        + "but one of the patients of\n"
                        + "this asylum.\n"
                        + "Every now and then, we all\n"
                        + "play along with your delusions.\n"
                        + "You have a severe case of\n"
                        + "dementia\n"
                        + "At the end of each adventure\n"
                        + "your head creates, I\n"
                        + "offer you a choice:\n"
                        + "If you take the blue pill,\n"
                        + "you can stay in the real world\n"
                        + "and be stuck here.\n"
                        + "Till your dementia strikes again\n"
                        + "If you take the red pill,\n"
                        + "you will go live in a magical world\n"
                        + "and forget about your...\n"
                        + "condition.\n\n"
                        + "What is your choice?");
            }
            
        };
        tulipefield = new Room(" in the tulips field","tulips.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                if (!playerHasItem("magical kiss")){
                    NewJDialog.addTextInConsole("Hey there!\n"
                        +"We're the Ninja Turtles!\n"
                        +"You've arrived to Pony World\n"
                        +"Our King will be pleased\n"
                        +"to welcome you."
                        +"But the Teletubbies are\nblocking "
                        +"the way!.\n"
                        +"Would you remind us their initials\n"
                        +"so that we can call them?\n"
                        +"Press 'Choices' to answer!\n");
                }
                else{
                    CharacterEnigma turtles = (CharacterEnigma)this.getCharacter();
                    turtles.playerHasReward();
                }
            }
            
        }; 
        rainbowPlace = new Room("in the rainbowplace","rainbowfield.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                if (playerHasItem("translator") && !playerHasItem("magical little poney")){
                    NewJDialog.addTextInConsole("\nGreetings stranger!\n"
                    +"Please be welcome into my Kingdom,\n"
                    +"the wonderful land of Pony World!\n"
                    +"Oh, but our land is in\ndanger, "
                    + "Dear Mister...\n"
                    + "An evil robot has emerged from the\n"
                    + "darkness of the lands of the "
                    + "Volcanoes.\n"
                    + "He has stolen the Magical "
                    + "Rainbow that holds our entire"
                    + "Universe together!\n"
                    + "It is predicted that our savior\n"
                    + "holds the answers to all of the "
                    + "wolrd's enigmas.\n"
                    + "May I verify that you, Sir, are\n"
                    + "the savior of our world?\n"
                    + "Click on 'Choice' to answer\n"
                    + "the Prophecy's Enigma and save\n"
                    +"our world!\n"
                    +"Press 'Choices'!\n");
                }
                
                else if (playerHasItem("magical little poney")){
                    CharacterEnigma king;
                    king = (CharacterEnigma)this.getCharacter();
                    king.playerHasReward();
                }
                
                else {
                    NewJDialog.addTextInConsole("Yhihihihihihi!\n"
                    + "Yihi hihi hithihiyii kihihihre\n"
                    + "iiekkiere yihihgihihieieihie!\n");
                }
                
            }
            
        }; 
        simbaPlace = new Room("in the savane Papy Brossard","simba.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                if (!playerHasItem("translator")){
                    NewJDialog.addTextInConsole("\nSo you don't understand"
                            +"\nwhat Pony King has to say?"
                            +"\nI can give you a translator..."
                            +"\nbut it won't be so easy! Haha!"
                            +"\nIf you really want it... "
                            +"\nclap your hands."
                            +"\nTen times, please.");
                    NewJDialog.clapHands.setVisible(true);
                    player.takeItem(translator);     
                }
                else {
                    CharacterEnigma simba =(CharacterEnigma)this.getCharacter();
                    simba.playerHasReward();
                }
                
                //NewJDialog.refreshItemList();            
            }
            
        };
        caseDora = new Room("in the Dora's way","dora.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("\" Hi, I am Dora!\n"
                        + "To find the evil robot you\n"
                        + "have to go through the bridge,\n"
                        + "the mountain, and the beach.\n\n");                
                NewJDialog.addTextInConsole("Repeat after me: the bridge,\n"
                        + "the mountain, and the beach.\n\n");                
                NewJDialog.addTextInConsole("Again: the bridge,\n"
                        + "the mountain, and the beach!\n");
            }
            
        };
        robotPlace = new Room("in the evil dark\ncreepy volcano of\nthe dark shadow","fight_robot.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("Did you come to intimidate me?"
                        + "\nI am not afraid of you!\n Let's fight!\n"
                        + "\nPress 'Choices' to Start the fight!");
            }
            
        };
        
        
        
        
        //Create enigmas
        Enigma scientist1 = new Enigma("The Answer is really big ", "ANSWER","really big","Infinity","an elephant");
        Enigma scientist2 = new Enigma("HOW MANY HOLES IN A POLO", "1","2","3","4");
        Enigma scientist3 = new Enigma("HOW MANY LETTERS IN ROBERT'S ROOM ", "12","14","16","18");
        Enigma kingE = new Enigma("What is the best ingredient of my Royal Deluxe ? ", "Goat cheese","Bacon","Salad","Mustard");
        Enigma turtlesE = new Enigma("What are the initial letter of the teletubbies", "L-L,T-D,P,S","K,C,D,Q","P,W,L,P","T-W,L-L,D,P");
        Enigma robotE1 = new Enigma("Which fabulous attack would you use ? ", "Kiisssss","Updago","Rust","Splash");
        Enigma robotE2 = new Enigma("Which marvelous attack would you use ? ", "Little cute puppy","DRRUUGGSSS","Wall-E","Mighty Kiss");
        Enigma robotE3 = new Enigma("Which powerful attack would you use ?  ", "What i'm doing here ? ","This game is great but a little WTF","LLICCOORRNN","It's not good to be bad");
        
        //Initialise characters
        Character zombieGuardian = new Character("A zombie",logeGardien, 2, true);
        Character boss = new Character("Dr. Zombie", directorOffice, 3, true);
        CharacterEnigma scientist = new CharacterEnigma("Dr. Zeus", laboratory, potion){
            @Override
            public void playerHasReward(){
                NewJDialog.addTextInConsole("I hope the potion\ncomes in handy!");
            }
        };
        CharacterEnigma ninjaTurtles = new CharacterEnigma("The Ninja Turtles", tulipefield, bisous){
            @Override
            public void playerHasReward(){
                NewJDialog.addTextInConsole("Come on!\nGo see the Pony King!");
            }
        };
        CharacterEnigma simba = new CharacterEnigma("Simba", simbaPlace, translator){
            @Override
            public void playerHasReward(){
                NewJDialog.addTextInConsole("With that translator\nyou will understand what\n"
                + "Pony King has to say");
            }
        };
        CharacterEnigma poneyKing = new CharacterEnigma("Pony King", rainbowPlace, poney){
                public void playerHasReward(){
                NewJDialog.addTextInConsole("Ride the poney, find Helpy,\nAND SAVE PONY WORLD!");
                }
        };
        CharacterEnigma helpy = new CharacterEnigma("Helpy, the evil robot,", robotPlace, rainbow){
            @Override
            public void playerHasReward(){
                NewJDialog.addTextInConsole("You already made me sad ! ");
            }
        };
        
        //Add the enigmas to the corresponding characters
        
        scientist.addEnigma(scientist1);
        scientist.addEnigma(scientist2);
        scientist.addEnigma(scientist3);
        ninjaTurtles.addEnigma(turtlesE);
        poneyKing.addEnigma(kingE);
        helpy.addEnigma(robotE1);
        helpy.addEnigma(robotE2);
        helpy.addEnigma(robotE3);
        
        //Place the characters in their respective rooms
        logeGardien.addCharacter(zombieGuardian);
        directorOffice.addCharacter(boss);
        laboratory.addCharacter(scientist);
        rainbowPlace.addCharacter(poneyKing);
        simbaPlace.addCharacter(simba);
        tulipefield.addCharacter(ninjaTurtles);
        robotPlace.addCharacter(helpy);
        
        
        // initialise room exits
        garden.addexits("north", new ExitRoom(hall,garden));
        hall.addexits("north", new MagicalExit(stairs,hall,item));
        hall.addexits("east", new MagicalExit(kitchen,hall,item));
        hall.addexits("south",new MagicalExit(garden,hall,never));
        hall.addexits("west",new MagicalExit(refectory,hall,fairy));
        refectory.addexits("north",new ExitRoom(logeGardien,refectory));
        refectory.addexits("west",new ExitRoom(RobertRoom,refectory));
        refectory.addexits("east",new ExitRoom(hall,refectory));
        logeGardien.addexits("south",new ExitRoom(refectory,logeGardien));
        RobertRoom.addexits("east",new ExitRoom(refectory,RobertRoom));
        stairs.addexits("south",new ExitRoom(hall,stairs));
        kitchen.addexits("north",new ExitRoom(directorOffice,kitchen));
        kitchen.addexits("east",new ExitRoom(laboratory,kitchen));
        kitchen.addexits("west",new ExitRoom(hall,kitchen));
        laboratory.addexits("west",new ExitRoom(kitchen,laboratory));
        directorOffice.addexits("east",new ExitRoom(chambreIRL,directorOffice));
        directorOffice.addexits("north",new ExitRoom(Blackout,directorOffice));
        Blackout.addexits("north",new ExitRoom(tulipefield,Blackout));
        tulipefield.addexits("north",new MagicalExit(rainbowPlace,tulipefield,bisous));
        rainbowPlace.addexits("north",new MagicalExit(caseDora,rainbowPlace,poney));
        rainbowPlace.addexits("south",new ExitRoom(tulipefield,rainbowPlace));
        rainbowPlace.addexits("west",new ExitRoom(simbaPlace,rainbowPlace));
        caseDora.addexits("north",new ExitRoom(robotPlace,caseDora));
        caseDora.addexits("south",new ExitRoom(rainbowPlace,caseDora));
        simbaPlace.addexits("east",new ExitRoom(rainbowPlace,simbaPlace));
        robotPlace.addexits("south",new MagicalExit(caseDora,robotPlace,rainbow));
        chambreIRL.addexits("north",new MagicalExit(tulipefield,chambreIRL,never));
        currentRoom = garden; //Start game in the Hall
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    
    // When the player die this function make appear a pop up to retry or to quit
    public void retry()
    {
        player.heal(4);
        createRooms();
        player.rebootList();
    }

    /**
     * Print out the opening message for the player.
     */
    public String printWelcome()
    {
        String s = "THE ASYLUM:\n"
                + "You are a journalist who\n"
                + "came here to find some clues\n"
                + "on unethical experiments\n"
                + "performed on the mentally ill.\n"
                + "Are you ready to get some clues?\n"
                + "Press the 'Help' button if you ever feel lost\n"
                + "You are " + currentRoom.getDescription() + "\n";
        return s;
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("go"))
        {
            goRoom(command);
    }
        return true;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    public String printHelp() 
    {
        String s = "HELP: \nYou came here to find\n"
                + "some clues on unethical experiments\n"
                + "performed on the mentally ill.\n"
                + "Click on the arrows to\n"
                + "head to different rooms.\n";
        return s;
    }

    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    public void goRoom(Command command) 
    {
        String direction = command.getSecondWord();
        // Try to leave current room.
        Room nextRoom = null;
        Item item = null;
        
        
        if (player.getListItem().isEmpty() && (currentRoom.isMagical(direction)))
            {
                nextRoom=currentRoom;
            }
        
        else if (player.getListItem().isEmpty() && !(currentRoom.isMagical(direction)))
            {
            
                nextRoom = currentRoom.getNextRoom(direction,item);
            }
        //the door is a magical door but the players have the items to unlock it
        else
            {
                for (Item i : player.getListItem())
                {
                    nextRoom = currentRoom.getNextRoom(direction,i);
                    if(nextRoom != currentRoom)break;
                }
            }
        //If there is no doors in the direction
        if (nextRoom == null) {
                 NewJDialog.addTextInConsole("There is no door!\n");
            }
        // if the doors is locked 
        else if(nextRoom == currentRoom)
            {
                 NewJDialog.addTextInConsole("The door is locked!\n");
            }
        //The players can access to the next room    
        else
            {
                currentRoom = nextRoom;
                NewJDialog.setScene(getCurrentRoom().getImage());
                currentRoom.onEnter();                                
            }
            
    }   

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    // return the current room
    public Room getCurrentRoom()
    {
        return currentRoom;
    }
    // check if the players have an items with the name of this one 
   public boolean playerHasItem(String nameItem)
{
    for(Item i : player.getListItem())
    {
        if (i.getDescription()==nameItem)
        {
            return true;
        }
    }
    return false;
}
   
}
