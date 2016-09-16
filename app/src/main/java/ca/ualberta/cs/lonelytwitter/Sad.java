package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by carlcastello on 16/09/16.
 */
public class Sad extends CurrentMood {
    private String mood;
    private Date date;

    public void Happy(Date date){
        this.mood = "Sad";
        super(this.mood, date);
    }

    public void Happy(){
        this.date = new Date();
        this.mood = "Sad";
        super(this.mood, this.date);
    }

    @Override
    public String get_mood(){
        return this.mood;
    }

    public Date get_date(){
        return this.date;

    }
}
