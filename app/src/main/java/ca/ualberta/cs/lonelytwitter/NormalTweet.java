package ca.ualberta.cs.lonelytwitter;

/**
<<<<<<< HEAD
 * Created by watts1 on 9/15/16.
 */
public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
=======
 * Created by watts1 on 9/13/16.
 */
public class NormalTweet extends Tweet implements Tweetable {

    public NormalTweet(String message){
>>>>>>> origin/f16Tuesday
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
