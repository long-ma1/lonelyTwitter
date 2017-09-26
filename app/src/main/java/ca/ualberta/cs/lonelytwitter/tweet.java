/*
 *tweet
 * version 17
 * 2017-09-26
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Tweet class saveing the message in a String and the date it was created
 *
 * @author someone
 * @version 0.1
 * @see NormalTweet
 * @see ImportantTweet
 *
 */

public abstract class tweet {

    private String message;
    private Date date;
    public abstract Boolean isImportant();

    /**
     * creates a tweet
     * @param message
     */
    public tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * changes the tweet message
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

}
