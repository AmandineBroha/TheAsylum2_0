
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    protected final  Players player; 
    public final Item fairy = new Item("Fairy dust",1);
    public final Item item = new Item("key",1);
    public final Item note = new Item("note",1);
    public final Item bisous = new Item("magical kiss",1);
    public final Item translator = new Item("translator",1);
    public final Item poney = new Item("magical little poney",1);
    public final Item rainbow = new Item("Magical rainbow",1);
    public final Item potion = new Item("potion", 1);
    
    
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
//        player= new Players(currentRoom);
        player = Players.getCurrentPlayer();
        
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room garden, hall, refectory, logeGardien, RobertRoom, stairs, kitchen, laboratory;
        Room directorOffice,danslesvape, exit, chambreIRL, tulipefield, rainbowPlace,simbaPlace;
        Room caseDora, robotPlace;
      
        // create the rooms
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
                NewJDialog.addTextInConsole("");
            }
            
        };
        refectory = new Room("in the refectory","refectoire.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("");            }
            
        };
        logeGardien = new Room("in the guardian lounge","logegardien.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("");
            }
            
        };
        RobertRoom = new Room("in Robert's bedroom","robert.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("");
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
                NewJDialog.addTextInConsole("");
            }
            
        };
        laboratory = new Room("in the laboratory","laboratory.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("You are meeting a mad scientist. \n \"Hi my dear friend! \n I hope you enjoy your visit. \n Let me ask you a little question \n before you continue...\n Maybe it will help you gaining some health, \n we don't know what could\n happen to you in the future!\" ");
            }
            
        };
        directorOffice = new Room("in the Head's office","bureauBoss.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("\"Hello mister De Lu. \nI was waiting for you... \n I have a lot to explain to you,\n but it is not for free.\n So first, let's fight!\"");
            }
            
        };
         danslesvape = new Room("bou","/noir.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("Vous etes dans les vapes");
            }
            
        };
        chambreIRL = new Room("in your cell","roomIRL.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("You made a good job.\n You deserve the truth. \nActually, you are a patient in the asylum,\n still mad. \nYou imagined all this adventure \nbecause that is your disease. \nI let you the choice : \nif you take the blue pill, \nyou can stay in the real world\n and be stucked here, \nor you can pick the red pill,\n which will guide you to a magical world\n and help you forgetting your state.\n What is your choice?");
            }
            
        };
        tulipefield = new Room(" in the tulips field","tulips.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("Welcome to the new world.\n Your first task is to help the ninja turtles\n to pass the teletubbies to go on the bridge.\n But the teletubbies do not allow it.\n To solve this and help the ninja turtles \nyou have to answer an enigma...");
            }
            
        }; 
        rainbowPlace = new Room("in the rainbowplace","rainbowfield.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("You succeeded! You are now going to meet the Pony King. He has some troubles too...");
            }
            
        }; 
        simbaPlace = new Room("in the savane Papy Brossard","simba.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                //int j = 0;
                NewJDialog.addTextInConsole("\"I heard you wanted something from me!\n I will not give it to you so easily haha!\n If you realy want it... \nclap your hands. 10 times.\" ");
//                while (j < 100){
//                    System.out.println();
//                }
                NewJDialog.clapHands.setVisible(true);
                NewJDialog.Wait();
                NewJDialog.Wait();
                player.takeItem(translator);
                //NewJDialog.refreshItemList();            
            }
            
        };
        caseDora = new Room("in the Dora's  way","dora.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("\" Hi, I am Dora.\n To meet the evil robot you have to go\n through the bridge, the mountain \nand the beach. \nRepeat after me : the bridge, the mountain\n and the beach. \nAgain : the bridgte, the mountain\n and the beach. Well done! \"");
            }
            
        };
        robotPlace = new Room("in the evil dark  creepy volcano of the dark shadow","fight_robot.png")        {
            @Override
            public void onEnter() {
                super.onEnter();
                NewJDialog.addTextInConsole("\"Did you come to intimidate me? \nI am not afraid of you!\n Let's fight!\"");
            }
            
        };
        
        
        Item never = new Item("never ever EVER",999);
        
        //Create enigmas
        Enigma scientist1 = new Enigma("The Answer is really big ", "ANSWER","really big","Infinity","an elephant");
        Enigma scientist2 = new Enigma("HOW MANY HOLES IN A POLO", "1","2","3","4");
        Enigma scientist3 = new Enigma("HOW MANY LETTERS IN ROBERT'S ROOM ", "12","14","16","18");
        Enigma simbaE = new Enigma("quel est la taille de ", "1","2","3","45");
        Enigma kingE = new Enigma("quel est la taille de ", "1","2","3","45");
        Enigma turtlesE = new Enigma("What are the initial letter of the teletubbies", "L-L,T-D,P,S","K,C,D,Q","P,W,L,P","T-W,L-L,D,P");
        Enigma robotE1 = new Enigma("quel est la taille de ", "1","2","3","45");
        Enigma robotE2 = new Enigma("quel est la taille de ", "1","2","3","45");
        Enigma robotE3 = new Enigma("quel est la taille de ", "1","2","3","45");
        
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
        CharacterEnigma helpy = new CharacterEnigma("Helpy, the evil robot,", robotPlace, rainbow);
        
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
        directorOffice.addexits("north",new ExitRoom(danslesvape,directorOffice));
        danslesvape.addexits("north",new ExitRoom(tulipefield,danslesvape));
        tulipefield.addexits("north",new MagicalExit(rainbowPlace,tulipefield,bisous));
        rainbowPlace.addexits("north",new MagicalExit(caseDora,rainbowPlace,poney));
        rainbowPlace.addexits("south",new ExitRoom(tulipefield,rainbowPlace));
        rainbowPlace.addexits("west",new ExitRoom(simbaPlace,rainbowPlace));
        caseDora.addexits("north",new ExitRoom(robotPlace,caseDora));
        caseDora.addexits("south",new ExitRoom(rainbowPlace,caseDora));
        simbaPlace.addexits("east",new ExitRoom(rainbowPlace,simbaPlace));
        robotPlace.addexits("south",new MagicalExit(caseDora,robotPlace,rainbow));
        chambreIRL.addexits("west",new MagicalExit(directorOffice,chambreIRL,never));
        currentRoom = garden; //Start game in the Hall
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    public String printWelcome()
    {
        String s = "\nYou've arrived in front of the Asylum.\n"
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
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help"))
            printHelp();
        else if (commandWord.equals("go"))
            goRoom(command);
        else if (commandWord.equals("quit"))
            wantToQuit = true;

        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    public String printHelp() 
    {
        String s = "HELP: \nYou came here to find some clues\n"
                + "about unethical experiments\n"
                + "on the mentally ill.\n"
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
            else
            {
                for (Item i : player.getListItem())
                {
                    nextRoom = currentRoom.getNextRoom(direction,i);
                    if(nextRoom != currentRoom)break;
                }
            }
            if (nextRoom == null) {
                 NewJDialog.addTextInConsole("There is no door!\n");
                 System.out.println("no door");
            }
            else if(nextRoom == currentRoom)
            {
                 NewJDialog.addTextInConsole("The door is locked!\n");
                 System.out.println("door locked");
            }
        
            else
            {
                currentRoom = nextRoom;
                NewJDialog.setScene(getCurrentRoom().getImage());
                currentRoom.onEnter();
                //return "You are " + currentRoom.getDescription() + "\n";
                
            }
            
    }   

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    
    public Room getCurrentRoom()
    {
        return currentRoom;
    }
   public boolean getkeyItem(String nameItem)
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
