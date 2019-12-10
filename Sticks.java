class Sticks {

    int startSticks = 1;

     //Player number followed by which hand
     int pOneRight = startSticks;
     int pOneLeft = startSticks;
     int pTwoRight = startSticks;
     int pTwoLeft = startSticks;

     boolean turn;

    Scanner hit = new Scanner(System.in);
    String firstMove = hit.nextLine();

   
    //Creates the new game
    
    public static void main(String[] args) {
        Sticks game = new Sticks();
        game.play();
    }

    // Game constructor
    public Sticks() {
        System.out.Println("Would you like to go first?(Y/N)");
    }

    // Setting up the game
    public void play(){
        while(!isWinner){
            if(firstMove.equals("Y") || firstMove.equals("y")){
                game.myTurn();
            }
            else if(firstMove.equals("N") || firstMove.equals("n")){
                game.computerTurn();
            }
        }
    }


    // Player Move
    public void myTurn(){
        while (startSticks > 0){
            final String makeMove = hit.nextLine();
            //initialize what move the player intends to make
            if (makeMove.equals("1R")){
                System.out.println("Where would you like to hit?");
                if(makeMove.equals("1R") || makeMove.equals("1L")){
                    System.out.println("Please choose a valid move");
                }
                else if(pTwoLeft == 0 || pTwoRight == 0){
                    System.out.println("You can't add to an empty hand. Choose a hand that has sticks.");
                }
                else if(makeMove.equals("2L")){
                    pTwoLeft = pOneRight + pTwoLeft;
                    if(pTwoLeft >= 5){
                        pTwoLeft = 0;
                    }                    
                }
                else if(make.Move.equals("2R")){
                    pTwoRight = pTwoRight + pOneRight;
                    if(pTwoRight >=5){
                        pTwoRight = 0;
                    }
                }
            }
            if(makeMove.equals("1L")){
                System.out.println("Where would you like to hit?");
                if(makeMove.equals("1R") || makeMove.equals("1L")){
                    System.out.println("Please choose a valid move");
                }
                else if(pTwoLeft == 0 || pTwoRight == 0){
                    System.out.println("You can't add to an empty hand. Choose a hand that has sticks.");
                }
                else if(makeMove.equals("2L")){
                    pTwoLeft = pOneLeft + pTwoLeft;
                    if(pTwoLeft >= 5){
                        pTwoLeft = 0;
                    }
                }
                else if(make.Move.equals("2R")){
                    pTwoRight = pTwoRight + pOneLeft;
                    if(pTwoRight >= 5){
                        pTwoRight = 0;
                    }                    
                }
            }
            if(makeMove.equals("2R")){
                System.out.println("Where would you like to hit?");
                if(makeMove.equals("2R") || makeMove.equals("2L")){
                    System.out.println("Please choose a valid move");
                }
                else if(pOneLeft == 0 || pOneRight == 0){
                    System.out.println("You can't add to an empty hand. Choose a hand that has sticks.");
                }
                else if(makeMove.equals("1L")){
                    pOneLeft = pOneLeft + pTworight;
                    if(pOneLeft >= 5){
                        pOneLeft = 0;
                    }                    
                }
                else if(make.Move.equals("1R")){
                    pOneRight = pTwoRight + pOneRight;
                    if(pOneRight >= 5){
                        pOneRight = 0;
                    }
                   
                }
            }
            if(makeMove.equals("2L")){
                System.out.println("Where would you like to hit?");
                if(makeMove.equals("2R") || makeMove.equals("2L")){
                    System.out.println("Please choose a valid move");
                }
                else if(pOneLeft == 0 || pOneRight == 0){
                    System.out.println("You can't add to an empty hand. Choose a hand that has sticks.");
                }
                else if(makeMove.equals("1L")){
                    pOneLeft = pOneLeft + pTwoLeft;
                }
                else if(make.Move.equals("1R")){
                    pOneRight = pTwoLeft + pOneRight;
                }
            }
            
                System.out.Println("Can't you follow directions, you idiot??");
        }
    }

    // AI Move
    public void computerTurn() {
        char currentPlayer;
    }

    // Is there a winner?
    public boolean isWinner(final String player){
        //if player one has no more sticks
        if(pOneright==0 && pOneLeft==0){
            return true;
        }
        //if player two has no more sticks
        else if(pTwoRight==0 && pTowLeft==0){
            return true;
        }
        return false;
    }


    //IF there is a winner, then return who the winner is.
    public String getWinner(){
        if(isWinner("Player 1")){
            return "Player 1";
        }
        else if(isWinner("Player 2")){
            return "Player 2";
        }
    }
}