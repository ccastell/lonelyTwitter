package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by carlcastello on 16/09/16.
 */
public abstract class CurrentMood {

    private String mood;
    private Date date;

    public void CurrentMood(String tweet_mood, Date tweet_date){
        this.mood = "Fair";
        this.mood = tweet_mood;
        this.date = tweet_date;
    }

    public void CurrentMood(String tweet_mood){
        this.mood = "Fair";
        Date date = new Date();
        this.mood = tweet_mood;
        this.date = date;
    }

    public String get_mood(){
        return this.mood;
    }

    public abstract Date get_date();

}
