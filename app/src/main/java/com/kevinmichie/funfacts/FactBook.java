package com.kevinmichie.funfacts;


import java.util.Random;

public class FactBook {
    // Fields (Member Variables) - Properties about the object
    private String[] mFacts = {
            "I love you because you never give up, especially on me.",
            "I love you because you are so goofy.",
            "I love you because you know how to cheer me up when I’m down.",
            "I love you because you can bring me back down to earth when I feel lost.",
            "I love you because you show me new adventures I never thought possible.",
            "I love you because you taught me about family and making better connections.",
            "I love you because you can balance between play and being an adult.",
            "I love you because your smile lights up my heart.",
            "I love you because you care for others more than yourself.",
            "I love you because you are as stubborn as the day is long.",
            "I love you because you challenge me every day to be better than who I was before.",
            "I love you because you made be okay with camping, even if I bring an air mattress.",
            "I love you because you make amazing pancakes and you are okay with my Chipotle obsession.",
            "I love you because you still gave me a chance to be with you, after I didn’t realize I ruined the bacon while camping in Kentucky with you.",
            "I love you because you put up with my bad jokes and I now instigate with your friends with the bad jokes.",
            "I love you because you are so family orientated.",
            "I love you because happiness is the most important thing to you.",
            "I love you because you never afraid to be yourself around me.",
            "I love you because you tell me what’s best for me and not what I want to hear.",
            "I love you because you said ‘yes’ to me when I asked you to marry me.",
            "I love you because you want to start a family with me.",
            "I love you because you call me out when I don’t give my best.",
            "I love you because you support my crazy ideas and passions.",
            "I love you because I never would have been this happy without you.",
            "I love you because you give me a reason every day to be a better man and, one day, a better father."
    };

    // Methods - Actions the object can take


    public String getFact(){
        String fact = "";
        // Randomly select a fact

        // Update the screen with our dynamic fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
