package com.example.asuspc.multiple_choice;

/**
 * Created by ASUSPC on 7/19/2017.
 */

public class QuestionLibrary {

    public static String[] questions = new String [] {
            "What card is this?",
            "In Friendly battle, how long does it runs when overtime ?",
            "In Normal battle, how long does it runs when overtime ?",
            "How many elixir cost for this card?",
            "What card is this?",
            "Which category in this card in?",
            "Which category in this card in?",
            "Which arena is this?",
            "Which cards can be unlocked in this arena?"

    };

    public static int[] images = new int [] {
            R.drawable.blabla, R.drawable.ccc, R.drawable.ccc, R.drawable.pc,
            R.drawable.sc, R.drawable.dc, R.drawable.gc, R.drawable.are,
            R.drawable.bb
    };

    public String mChoices [][] = {
            {"Wizard","Ice Spirit","Log","Archer"},
            {"2.00","4.00","1.50","3.00"},
            {"1.00","1.20","0.30","2.50"},
            {"2","4","1","7"},
            {"Sparky","Zap","Giant","Lava Hound"},
            {"Common","Rare","Epic","Legendary"},
            {"Epic","Legendary","Rare","Common"},
            {"3","2","6","4"},
            {"Graveyard","Minions","Cannon","Balloon"},



    };

    public String mCorrectAns[] ={"Log","3.00","1.00","7","Sparky","Rare","Epic","4","Cannon"};

    public String getQuestions(int x){
        String question = questions[x];
        return question;
    }

    public String getChoice1(int index, int num){
        String choice0 = mChoices[index][num-1];
        return choice0;
    }


    public String getCorrectAns (int x){
        String ans = mCorrectAns[x];
        return ans;
    }

}
