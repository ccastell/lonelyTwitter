package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by carlcastello on 27/09/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweetArrayList;

    public void Tweet() {
        this.tweetArrayList = new ArrayList<Tweet>();
    }

    public boolean addTweet (Tweet newTweet) {
        if (this.hasTweet(newTweet)) {
            return false;
        }
        else {
            this.tweetArrayList.add(newTweet);
            return true;
        }
    }

    public void removeTweet (Tweet oldTweet) {
        this.tweetArrayList.remove(oldTweet);
    }

    public Tweet getTweet (int c) {
        return this.tweetArrayList.get(c);
    }

    public Boolean hasTweet(Tweet tweet){
        return this.tweetArrayList.contains(tweet);
    }

    public int countTweet() {
        return this.tweetArrayList.size();
    }

}
