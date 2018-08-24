//name: Hitanshi Shroff
//date: 2014/10/31
//purpose: create an interactive game

public class game
{
    int point = 3;
    boolean riddlesDone = false;
    boolean unscrambleDone = false;
    boolean trueFalseDone = false;
    boolean whoAmIDone = false;
    boolean rpsDone = false;
    public static void main (String args[])
    {
	new game ();
    }


    public game ()
    {
	cauldron ();
	intro ();
    }


    public void printSlow (String s)
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    //sleep for a bit after printing a letter
	    try
	    {
		Thread.sleep (100);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	}
	System.out.println ();
    }


    public void intro ()
    {
	printSlow ("Welome to this Halloween game");
	happyhalloween ();
	printSlow ("You were out for Halloween with your friends");
	printSlow ("And suddenly you find yourself in a place ");
	printSlow ("you have never even seen before");
	printSlow ("Your job is to find your way back home");
	printSlow ("The witches and monsters will ask you questions");
	printSlow ("If you answer them correctly you get a point.");
	printSlow ("If you answer incorrectly you might lose a point.");
	printSlow ("In order to go home you need atleast 5 points, ");
	printSlow ("the game will end when you have 0 points left");
	printSlow ("lET'S BEGIN! ");

	char start = IBIO.inputChar ("\nDo you want to start the game? ");
	while (start != 'y' && start != 'Y')
	{
	    System.out.println ("Really? The game is fun. Don't you want to go home? ");
	    start = IBIO.inputChar ("Do you want to start the game? ");
	}
	printSlow ("\nAlright then, let's continue to the first house.");
	printSlow ("Its a Witch's House!");
	printSlow ("You have just knocked on the door");
	Hauntedhouse ();
	printSlow ("The witch comes out and says, you need to answer my question for a candy.");
	while (!gameover ())
	{
	    String ask = IBIO.inputString ("\nWhat do you want to play (r)iddles, (u)nscramble, (t)rue or flase, (w)ho am I, or (p)aper rock scissors? ");
	    if ((ask.equals ("riddles") || ask.equals ("r")) && !riddlesDone)
		riddles ();
	    else if ((ask.equals ("unscramble") || ask.equals ("u")) && !unscrambleDone)
		unscramble ();
	    else if ((ask.equals ("true or false") || ask.equals ("t")) && !trueFalseDone)
		truefalse ();
	    else if ((ask.equals ("who am I") || ask.equals ("w")) && !whoAmIDone)
		whoAmI ();
	    else if ((ask.equals ("Paper Rock Scissors") || ask.equals ("p")) && !rpsDone)
		rps ();
	}
	if (point >= 10)
	{
	    System.out.println ("YOU MADE IT HOME!");
	    home ();
	}
	else
	    System.out.println ("SORRY, YOU NEVER MADE IT HOME!");
    }


    public boolean gameover ()
    {
	if (point >= 10)
	    return true;
	else if (riddlesDone && unscrambleDone && trueFalseDone && whoAmIDone && rpsDone)
	    return true;
	else if (point < 0)
	    return true;
	else
	    return false;
    }


    //Who am I general knowledge questions
    public void whoAmI ()
    {
	System.out.println (" HAHAHA! I AM A GOBLIN MONSTER! I WILL ASK YOU CHALLENGING QUESTIONS!!");
	question ();
	String whoAmI1 = IBIO.inputString ("I am a current CEO and President of Yahoo. I was ranked 8th on the list of America's most powerful women 2013. ");
	if (whoAmI1.equalsIgnoreCase ("Marissa Mayer"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");

	}
	else
	    System.out.println ("You answered incorrectly.");
	String whoAmI2 = IBIO.inputString ("I was the co-founder and CEO of a very famous company, all you probably know. I died of a respiratory arrest on the 5th of October 2011. ");
	if (whoAmI2.equalsIgnoreCase ("Steve Jobs"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}
	else
	    System.out.println ("You answered incorrectly.");

	String answer = IBIO.inputString ("\nDo you want to answer her question? ");
	whoAmIDone = true;
    }


    // First part of the game, riddles
    public void riddles ()
    {
	String answer = IBIO.inputString ("\nDo you want to answer her question? ");
	while (!answer.equalsIgnoreCase (" yes") && !answer.equalsIgnoreCase ("y"))
	{
	    System.out.println ("Really? Don't you want CANDY?");
	    answer = IBIO.inputString ("Do you want to answer her question? ");
	}
	System.out.println ("\nIn order to get the candy you need to answer her riddle");
	System.out.println ("So here it goes... GOOD LUCK! ");
	String riddle1 = IBIO.inputString ("\nWhat does a panda ghost eat? ");
	if (riddle1.equalsIgnoreCase ("Bam-Boo") || riddle1.equalsIgnoreCase ("BamBoo") || riddle1.equalsIgnoreCase ("Bamboo") || riddle1.equalsIgnoreCase ("bamBoo") || riddle1.equalsIgnoreCase ("bamboo"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}
	else
	    System.out.println ("You answered incorrectly. It's okay! There are many more questions to go! ");
	String riddle2 = IBIO.inputString ("\nWhat position does a ghost play in soccer? ");
	if (riddle2.equalsIgnoreCase ("A Ghoulie") || riddle2.equalsIgnoreCase ("ghoulie") || riddle2.equalsIgnoreCase ("a ghoulie") || riddle2.equalsIgnoreCase ("goalie"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}
	else
	    System.out.println ("You answered incorrectly. It's okay! There are many more questions to go!");

	String riddle3 = IBIO.inputString ("\nWhat monster plays tricks on Halloween? ");
	if (riddle3.equalsIgnoreCase ("Prank-enstein") || riddle3.equalsIgnoreCase ("Prankenstein"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}
	else
	    System.out.println ("You answered incorrectly. It's okay! There are many more questions to go!");

	String riddle4 = IBIO.inputString ("\nWhat do ghosts use to clean their hair? ");
	if (riddle4.equalsIgnoreCase ("Sham-boo") || riddle4.equalsIgnoreCase ("Shamboo"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}
	else
	    System.out.println ("You answered incorrectly. It's okay! There are many more questions to go!");

	String riddle5 = IBIO.inputString ("\nWhat is a mummy's favorite kind of music? ");
	if (riddle5.equalsIgnoreCase ("Rap") || riddle5.equalsIgnoreCase ("rap"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}

	else

	    System.out.println ("You answered incorrectly. It's okay! There are many more questions to go!");
	String riddle6 = IBIO.inputString ("\nWhat key opens a Haunted House? ");
	if (riddle6.equalsIgnoreCase ("A spooKEY") || riddle6.equalsIgnoreCase ("spookey") || riddle6.equalsIgnoreCase ("SpooKey") || riddle4.equalsIgnoreCase ("spooKey"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}

	else
	    System.out.println ("You answered incorrectly. It's okay! There are many more questions to go!");
	String riddle7 = IBIO.inputString ("\nWhat animal is good at cricket? ");
	if (riddle7.equalsIgnoreCase ("a bat") || riddle7.equalsIgnoreCase ("bat") || riddle7.equalsIgnoreCase ("Bat") || riddle7.equalsIgnoreCase ("A Bat"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}

	else
	    System.out.println ("You answered incorrectly. It's okay! There are many more questions to go!");

	String riddle8 = IBIO.inputString ("\nWhat do you call a skeleton that lies on its grave? ");
	if (riddle8.equalsIgnoreCase ("Lazy bones") || riddle8.equalsIgnoreCase ("lazy bones"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}

	else
	    System.out.println ("You answered incorrectly. It's okay! There are many more questions to go!");

	String riddle9 = IBIO.inputString ("\nWhat is Dracula's favourite fruit? ");
	if (riddle9.equalsIgnoreCase ("A nectarine") || riddle9.equalsIgnoreCase ("nectarine"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}

	else
	    System.out.println ("You answered incorrectly. It's okay! There are many more questions to go!");
	String riddle10 = IBIO.inputString ("\nWhat do ghosts like for dessert? ");
	if (riddle10.equalsIgnoreCase ("I Scream") || riddle10.equalsIgnoreCase ("i scream") || riddle10.equalsIgnoreCase ("icecream") || riddle10.equalsIgnoreCase ("ice-cream"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}

	else
	    System.out.println ("You answered incorrectly. It's okay! We'll play other games! ");

	printSlow ("\nYou now have " + point + " points");
	System.out.println ("This witch was nice, she didn't take off points for incorrect answers.");
	riddlesDone = true;
    }


    //second part, unscrambles!
    public void unscramble ()
    {
	System.out.println (" NOW IT'S A MONSTER!");
	System.out.println (" Hi, My name is Mr.Monster! You BETTER answer my questions RIGHT!");
	String unscramble1 = IBIO.inputString ("\nkcitr ro raett ");
	if (unscramble1.equalsIgnoreCase ("trick or treat") || unscramble1.equalsIgnoreCase (" trick or treat"))
	{
	    point++;
	    System.out.println ("You get " + point + " points");
	}
	else
	{
	    point--;
	    System.out.println ("You answered incorrectly. It's okay! There are more questions! ");
	    System.out.println ("You get " + point + " points. You are doing well!");
	}

	String unscramble2 = IBIO.inputString ("\ntichwes ");
	if (unscramble2.equalsIgnoreCase ("Witches") || unscramble2.equalsIgnoreCase (" witches"))
	{
	    point++;
	    System.out.println ("You get " + point + " points. You are AWESOME!");
	}
	else
	{
	    point--;
	    System.out.println ("You answered incorrectly. It's okay! There are more questions! ");
	    System.out.println ("You get " + point + " points. You are doing well!");
	}

	String unscramble3 = IBIO.inputString ("\nrstsenmo ");
	if (unscramble3.equalsIgnoreCase ("Monsters") || unscramble3.equalsIgnoreCase (" monsters"))
	{
	    point++;
	    System.out.println ("You get " + point + " points. You are AWESOME!");
	}
	else
	{
	    point--;
	    System.out.println ("You answered incorrectly. It's okay! There are more questions! ");
	    System.out.println ("You get " + point + " points. You are doing well!");
	}

	String unscramble4 = IBIO.inputString ("\nigcma ");
	if (unscramble4.equalsIgnoreCase ("magic") || unscramble4.equalsIgnoreCase (" Magic"))
	{
	    point++;
	    System.out.println ("You get " + point + " points. You are AWESOME!");
	}
	else
	{
	    point--;
	    System.out.println ("You answered incorrectly. It's okay! There are more questions! ");
	    System.out.println ("You get " + point + " points. You are doing well!");
	    String unscramble5 = IBIO.inputString ("\ncoObtre ");
	    if (unscramble5.equalsIgnoreCase ("October") || unscramble5.equalsIgnoreCase ("october"))
	    {
		point++;
		System.out.println ("You get " + point + " points. You are AWESOME!");
	    }
	    else
	    {
		point--;
		System.out.println ("You answered incorrectly. It's okay! There are more questions! ");
		System.out.println ("You get " + point + " points. You are doing well!");
	    }
	    String unscramble6 = IBIO.inputString ("\n ssuemtoc ");
	    if (unscramble6.equalsIgnoreCase ("costumes") || unscramble6.equalsIgnoreCase ("Costumes"))
	    {
		point++;
		System.out.println ("You get " + point + " points. You are AWESOME!");
	    }
	    else
	    {
		point--;
		System.out.println ("You answered incorrectly. It's okay! There are more questions!");
		System.out.println ("You get " + point + " points. You are doing well!");
	    }
	}
	unscrambleDone = true;
    }


    public boolean istrue (String s)
    {
	if (s.equalsIgnoreCase ("True"))
	    return true;
	else if (s.equalsIgnoreCase ("T"))
	    return true;
	else if (s.equalsIgnoreCase ("Right"))
	    return true;
	else if (s.equalsIgnoreCase ("Correct"))
	    return true;
	else if (s.equalsIgnoreCase ("Yes"))
	    return true;
	else if (s.equalsIgnoreCase ("Y"))
	    return true;
	else
	    return false;
    }


    // Third true or false
    public void truefalse ()
    {
	System.out.println ("\nNow you are facing the BIGGEST MONSTER EVER!!!");
	System.out.println (" He wants to ask a few general questions, to check your knowledge!");
	System.out.println ("Come On Show Him Everything You can Do!");

	question ();
	String question1 = IBIO.inputString ("\n Is the colour orange named after the fruit? ");
	question ();
	if (istrue (question1))
	{
	    point++;
	    System.out.println ("You get " + point + " points. You are AMAZING!");
	}

	else
	{
	    point--;
	    System.out.println ("You answered incorrectly. It's okay! There are more questions!");
	    System.out.println ("You get " + point + " points. You are doing well!");
	}
	String question2 = IBIO.inputString ("\n Is there a planet that rains glass sideways ");
	if (istrue (question2))
	{
	    point++;
	    System.out.println ("You get " + point + " points. You are AMAZING!");
	}
	else
	{
	    point--;
	    System.out.println ("You answered incorrectly. It's okay! There are more questions!");
	    System.out.println ("You get " + point + " points. You are doing well!");
	}
	String question3 = IBIO.inputString ("\nIs the capital of Canada Ottawa? ");
	if (istrue (question3))
	{
	    point++;
	    System.out.println ("You get " + point + " points. You are AMAZING!");
	}
	else
	{
	    point--;
	    System.out.println ("You answered incorrectly. It's okay! There are more questions!");
	    System.out.println ("You get " + point + " points. You are doing well!");
	}

	trueFalseDone = true;
    }


    //Rock paper scissors
    public void rps ()
    {
	int cPoint = 0;
	int uPoint = 0;
	int game = 1;
	char playAgain = 'y';
	System.out.println ("-----Rock, Paper, Scissors------\n");
	while (playAgain == 'y')
	{
	    char user = userChoice ();
	    System.out.println ("You have selected " + user);
	    char comp = compChoice ();
	    System.out.println ("The witch has selected " + comp);
	    char win = winner (comp, user);
	    if (win == 'c')
	    {
		cPoint++;
		System.out.println ("\nThe witch wins!");
	    }
	    else if (win == 'u')
	    {
		uPoint++;
		System.out.println ("\nYou win!");
	    }
	    else
		System.out.println ("\nThere is a tie!");
	    System.out.println ("Points: You: " + uPoint + " Witch: " + cPoint);

	    playAgain = IBIO.inputChar ("\nPlay again? (y/n) ");
	    System.out.println ("");
	}
	System.out.println ("Goodbye!");
	point += uPoint;
    }


    public boolean isValid (String c)
    {
	/* All valid data:
	       Rock, ROCK, rock, r, R
	       Paper, PAPER, paper, p, P
	       Scissors, SCISSORS, scissors, s, S
	   return true if valid, false otherwise
	*/
	if (c.equals ("Rock") || c.equals ("ROCK") || c.equals ("rock") || c.equals ("R") || c.equals ("r"))
	    return true;
	else if (c.equals ("Paper") || c.equals ("PAPER") || c.equals ("paper") || c.equals ("P") || c.equals ("p"))
	    return true;
	if (c.equals ("Scissors") || c.equals ("SCISSORS") || c.equals ("scissors") || c.equals ("S") || c.equals ("s"))
	    return true;
	else
	    return false;
    }


    public char userChoice ()
    { //returns r, p or s, based on the user's choice
	//print options: rock, paper, scissors
	//ask for user's choice. will need to store in String
	//Loop: if invalid input, ask again
	//stopping condition is the isValid method!!
	//something like: while(!isValid(choice))
	//If: to standardize values
	//if you've got one of Rock, ROCK, rock, r, R, then return 'r'.
	//else if you've got one of Paper, PAPER, paper, p, P, then return 'p'.
	//else return 's';
	System.out.println ("You have three options: Rock, Paper, Scissors");
	String option = IBIO.inputString ("What do you choose? ");
	//System.out.println (option + "   "+ isValid(option));
	while (!isValid (option))
	{
	    option = IBIO.inputString ("error. What do you choose? ");
	}
	char toReturn = 's';
	//System.out.println ("a");
	if (option.equals ("Rock") || option.equals ("ROCK") || option.equals ("rock") || option.equals ("R") || option.equals ("r"))
	    toReturn = 'r';
	else if (option.equals ("Paper") || option.equals ("paper") || option.equals ("PAPER") || option.equals ("P") || option.equals ("p"))
	    toReturn = 'p';
	else if (option.equals ("Scissors") || option.equals ("scissors") || option.equals ("SCISSORS") || option.equals ("S") || option.equals ("s"))
	    toReturn = 's';
	return toReturn;
    }


    public char compChoice ()
    { //make a random number between 1 and 3
	//if the number is 1, return r; 2 return s; 3 return p
	char toReturn = 'p';
	int num = (int) (Math.random () * 2) + 1;
	if (num == 1)
	    toReturn = 'r';
	if (num == 2)
	    toReturn = 's';
	else
	    toReturn = 'p';
	return toReturn;

    }


    public char winner (char comp, char user)
    { //comp and user both hold one of r, s, p
	//returns c for computer, u for user and b for both
	char toReturn = 'p';
	if (comp == 'r')
	{
	    if (user == 'r')
		toReturn = 'b';
	    else if (user == 's')
		toReturn = 'c';
	    else if (user == 'p')
		toReturn = 'u';
	}
	else if (comp == 's')
	{
	    if (user == 'r')
		toReturn = 'u';
	    else if (user == 's')
		toReturn = 'b';
	    else if (user == 'p')
		toReturn = 'c';
	}
	else if (comp == 'p')
	{
	    if (user == 'r')
		toReturn = 'c';
	    else if (user == 's')
		toReturn = 'u';
	    else if (user == 'p')
		toReturn = 'b';
	}

	return toReturn;
    }




    public void cauldron ()
    {
	System.out.println ("              (");
	System.out.println ("               )  )");
	System.out.println ("           ______(____");
	System.out.println ("          (___________)");
	System.out.println ("           /         \\");
	System.out.println ("          /           \\");
	System.out.println ("         |             |");
	System.out.println ("     ____\\             /____");
	System.out.println ("    ()____'.__     __.'____()");
	System.out.println ("         .'` .'```'. `-.");
	System.out.println ("        ().'`       `'.()");
    }


    public void Hauntedhouse ()
    {
	System.out.println ("          |____________|`. >.\\   '-._.-'      .'|____________|    (");
	System.out.println ("           | _________.`. |                  | .'._________ |      `-.");
	System.out.println ("            |__.      |`.`               _._  '.'|      ._ |       .-'");
	System.out.println ("           /|  |--    | |         {) (}  >.\\   | |    --|  |\\    _._'-.");
	System.out.println ("         ,' .' -'--   | |         `|_|'        | |   --'-  | `.  >,\\");
	System.out.println ("      _.' . |   ___.. | |         /|[|\\        | | ..___   |   `.");
	System.out.println ("  _,-' _.'| |    _|_  ' |     _,-',|||,`-._    | '  _|_     | |. `.");
	System.out.println ("      .___|.'        '  |-,.-'_,.| ||||`-._`-,-|  '     |__ | | `._`-.");
	System.out.println ("  _________|  ____   |  |_|-'|| || ||||| | |'| | ||   ____   |'----'");
	System.out.println ("          | _/c  c\\_ | _| '''\"\"\"\"''\"]L\"'''''''''_|. _/c  c\\_ ''-------");
	System.out.println ("    ______| \\ _.-'`/ |  |-;---.---'|\"|''--.--;-'  | \\`'-._ /  |_______");
	System.out.println ("   _____ /  |/  _./| |-.' |: :| '| |;| '| || | | _| |\\._  \\|  | _______");
	System.out.println ("         |  |_/'   | |  |_|| || :| ||| :| :| |_|  | |   '\\_|  |");
	System.out.println ("        .|  / c  c \\ '  |=|| '| ;| ||| ;| '| |=|-.| / c  c \\  |");
	System.out.println ("        |   `\\____/`|   ' || :| || ||| || || | |  | `\\____/`  '");
	System.out.println ("        |..---      |   ' |; ;|.==.|||.==.|| | | _|------      '");
	System.out.println ("        |_|         |  .| || |||  |;|||  ||| | '   '... |  ___ ||");
	System.out.println ("       |   -- -'''  | ._| |' '||  ||[||  |'| | |_  |    ''''''  |");
	System.out.println ("       |      ...   |  |  || :||  ||]||  ||| | '   |      |.__  |");
	System.out.println ("      |      |     |  -.  || ||`=='|||`==''| | '-. | ----.__|___ |");
	System.out.println ("      '  __.-'-    | _| ; |: || ;| ||| '| :|'| |_.- |             |");
	System.out.println ("     |   __|.__    |    |_|| || || ||| :| ;| |_| |  |.            |");
	System.out.println ("    .|          _|_| _  |=|| ;| '| ||| ;| || |=| _' |          __ |");
	System.out.println ("    |          ''' '  |_| || || || '|| || '| | |    |---.|___   |__|");
	System.out.println ("    | |   || |     |  |.' |; '| || ||| || '| | .     | |__      \\\\||");
	System.out.println ("   .' //   ||/     || ||  || || || ;|| || :| |  | _| |___|_    |\\\\'|.");
	System.out.println ("   | ;/| ;;|/.  \\   ||||  |' || '| ||| ||  | '  |||  |       ; ||/\\|  |");
	System.out.println ("   -'  |/| \\|  mx\\\\ /| '|_;L_|| L;_'|:_'L_,|_;_ '\\|/\\|   |   |;|/.-`. |/ ");
    }


    public void happyhalloween ()
    {
	System.out.println (" ('-. .-.   ('-.      _ (`-.    _ (`-.              ");
	System.out.println ("( OO )  /  ( OO ).-. ( (OO  )  ( (OO  )             ");
	System.out.println (",--. ,--.  / . --. /_.`     \\ _.`     \\  ,--.   ,--.");
	System.out.println ("|  | |  |  | \\-.  \\(__...--''(__...--''   \\  `.'  / ");
	System.out.println ("|   .|  |.-'-'  |  ||  /  | | |  /  | | .-')     /  ");
	System.out.println ("|       | \\| |_.'  ||  |_.' | |  |_.' |(OO  \\   /   ");
	System.out.println ("|  .-.  |  |  .-.  ||  .___.' |  .___.' |   /  /\\_  ");
	System.out.println ("|  | |  |  |  | |  ||  |      |  |      `-./  /.__) ");
	System.out.println ("`--' `--'  `--' `--'`--'      `--'        `--'      ");
	System.out.println (" ('-. .-.   ('-.                                       (`\\ .-') /`   ('-.     ('-.       .-') _       ");
	System.out.println ("( OO )  /  ( OO ).-.                                    `.( OO ),' _(  OO)  _(  OO)     ( OO ) )      ");
	System.out.println (",--. ,--.  / . --. / ,--.      ,--.      .-'),-----. ,--./  .--.  (,------.(,------.,--./ ,--,'       ");
	System.out.println ("|  | |  |  | \\-.  \\  |  |.-')  |  |.-') ( OO'  .-.  '|      |  |   |  .---' |  .---'|   \\ |  |\\       ");
	System.out.println ("|   .|  |.-'-'  |  | |  | OO ) |  | OO )/   |  | |  ||  |   |  |,  |  |     |  |    |    \\|  | )      ");
	System.out.println ("|       | \\| |_.'  | |  |`-' | |  |`-' |\\_) |  |\\|  ||  |.'.|  |_)(|  '--. (|  '--. |  .     |/       ");
	System.out.println ("|  .-.  |  |  .-.  |(|  '---.'(|  '---.'  \\ |  | |  ||         |   |  .--'  |  .--' |  |\\    |        ");
	System.out.println ("|  | |  |  |  | |  | |      |  |      |    `'  '-'  '|   ,'.   |   |  `---. |  `---.|  | \\   |        ");
	System.out.println ("`--' `--'  `--' `--' `------'  `------'      `-----' '--'   '--'   `------' `------'`--'  `--'   ");
	System.out.println ("");
    }


    public void home ()
    {
	System.out.println ("                                        _____");
	System.out.println ("                                   _.-\"\"     \"\"-._");
	System.out.println ("                                 .'               '.");
	System.out.println ("                    . . . . .  .'                   '.");
	System.out.println ("                    !-!-!-!-! /   .-..                \\");
	System.out.println ("                    !_!,!_!_!/    |__H _    .-\\_)`-.   \\");
	System.out.println ("                  ,/`,/'_`\\,`\\,  [____|_]  /.-. .-,_\\   ;");
	System.out.println ("                ,/',/'/_|_\\`\\,`\\,|=   |=|      \\(       ;");
	System.out.println ("              ,/' |/ ||\"\"\"|| \\| `\\, = | |       `       |");
	System.out.println ("              |   #| ||___|| | #  |=  | |               |");
	System.out.println ("            ,/' #  | [_____] |   #`\\, |=|               ;");
	System.out.println ("          ,/',-----'      =  '-----,`\\--'---,/\\,--,    /");
	System.out.println ("         `\"\"|   .;;;,=      ,;;;,   |#  # ,//  \\\\,'\\, /");
	System.out.println ("            | =//___\\\\ =   //___\\\\ =| # ,//',;;,'\\\\,#\\,");
	System.out.println ("            |  ||   ||     ||   ||  |#,//' //||\\\\ '\\\\,`\\,");
	System.out.println ("            |  ||   ||     ||   ||  |-|/| ||_||_|| |\\|_ _|");
	System.out.println ("            |  ||   ||   = ||   ||  |=  | |.----.|=|___]");
	System.out.println ("            |= ||___|| =   ||___|| =|  =| ||    || | ||");
	System.out.println ("            | [_______]   [_______] |--.| ||____|| | ||");
	System.out.println ("            ;_______=______=_____ __;   |[________]| ||");
	System.out.println ("          ,/'#    #   #      #       #  '----------''\\|");
	System.out.println ("        ,/'    #        #       #         #     #   # '\\,");
	System.out.println ("      ,/'___#____#__#_____#___#_______#_______#____#___#'\\,");
	System.out.println ("      `\"\"[____________________________________________]|\"\"`");
	System.out.println ("         _[_|   .-----.  =-       ___________    ||_]_||");
	System.out.println ("        |  _| .\",-\"|\"-,',   () = |.--..-..--.| = |_  |||");
	System.out.println ("        |_/ |/ /_\\_|_/_\\ \\ /__\\  ||__||_||__||   | \\_|\\\\");
	System.out.println ("        (_) || .-------. | |  |  |.--..-..--.|  =| (_) ||");
	System.out.println ("        / \\ || |       | | |()|  ||__||_||__||   | / \\ ||");
	System.out.println ("        \\_/ || '-------' |  )(   |___________|   | \\_/ ||");
	System.out.println ("        (_) ||.---------.|  \\/   |.---------.|=  | (_) ||");
	System.out.println ("        / \\ |||   ___   ||    =  ||         ||   | / \\ ||");
	System.out.println ("        \\_/ |||  {___}  ||       ||         ||   | \\_/ ||");
	System.out.println ("        (_) |||  ((_))  || -=   =||_________|| = |_(_)_//");
	System.out.println ("        / \\ |||   '-'   ||   _ .-'-----------'-. | / \\__\\");
	System.out.println ("        \\_/_|||       ()||  [_]\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"[_]\\_/\\\\\\\\");
	System.out.println ("       [ __ ]||         || =| |==.==.==.==.==.==| |__]|||||");
	System.out.println ("       j|  ||||         ||  | |  |  |  |  |  |  | |  |====|");
	System.out.println ("       g|__|||;).       ||--|_|=='=='=='=='=='==|_|  ||||||");
	System.out.println ("      _s____/`---`\\ ____||_.____._____._____.____.|__|////");
	System.out.println ("     |     |  9.9  |=====' |    |    /  \\    \\   |    |-'");
	System.out.println ("     '------\\ www /---'----'----'---'----'---'---'----'");
	System.out.println ("             `---'");
    }


    public void question ()
    {
	System.out.println ("  _.--,-```-.    ");
	System.out.println (" /    /      '.  ");
	System.out.println ("/  ../         ; ");
	System.out.println ("\\  ``\\  .``-    '");
	System.out.println (" \\ ___\\/    \\   :");
	System.out.println ("       \\    :   |");
	System.out.println ("       |    ;  . ");
	System.out.println ("      ;   ;   :  ");
	System.out.println ("     /   :   :   ");
	System.out.println ("     `---'.  |   ");
	System.out.println ("      `--..`;    ");
	System.out.println ("    .--,_        ");
	System.out.println ("    |    |`.     ");
	System.out.println ("    `-- -`, ;    ");
	System.out.println ("      '---`\"     ");
	System.out.println ("                    ");
    }
}

