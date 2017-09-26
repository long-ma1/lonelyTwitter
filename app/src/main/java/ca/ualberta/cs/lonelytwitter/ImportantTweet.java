/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by malon_000 on 2017-09-26.
 */

public class ImportantTweet extends tweet{

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}

