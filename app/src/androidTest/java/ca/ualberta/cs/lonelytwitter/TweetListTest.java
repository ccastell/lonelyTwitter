package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import java.util.concurrent.TimeUnit;
/**
 *
 */

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList list = new TweetList();

        //assertTrue(false);

        Tweet tweet = new NormalTweet("Normal Tweet here reporting!");
        list.add(tweet);

        try {
            list.add(tweet);
            fail();
        }
        catch(IllegalArgumentException e){
            System.out.println("Tweet already added");
        }
        assertTrue(list.hasTweet(tweet));

    }


    public void testGetTweet() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("this is tweet a");
        Tweet b = new NormalTweet("this is tweet b");

        list.add(a);
        list.add(b);

        assertEquals(a, list.getTweet(0));
        assertEquals(b, list.getTweet(1));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Normal tweet here");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }



    public void testGetCount() {

        TweetList list = new TweetList();

        Tweet a = new NormalTweet("a!!");
        Tweet b = new NormalTweet("b!!");
        Tweet c = new NormalTweet("c!!");

        list.add(a);
        list.add(b);
        list.add(c);

        assertTrue(list.getCount() == 3);

    }

    public void testGetTweets() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("normalization");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Tweet b = new NormalTweet("just another noemal tweet");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Tweet c = new NormalTweet("nothing out of the ordinary");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        list.add(a);
        list.add(c);
        list.add(b);

        TweetList orderedList = new TweetList();

        orderedList = list.getTweets();

        assertTrue("Not the same", orderedList.getTweet(0) == a);
        assertTrue("Not the same", orderedList.getTweet(1) == b);
        assertTrue("Not the same", orderedList.getTweet(2) == c);
    }


}
