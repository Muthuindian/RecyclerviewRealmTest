package com.tech42.mari.recyclerviewtest;

import android.graphics.Bitmap;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by mari on 1/23/17.
 */

public class Information extends RealmObject {

    @PrimaryKey
    Bitmap imageid;

    @Required
    String text;

    public Bitmap getImageid()
    {
        return imageid;
    }

    public String getText()
    {
        return text;
    }

    public void setImageid(Bitmap imageid)
    {
        this.imageid=imageid;
    }
    public void setText(String text)
    {
        this.text=text;
    }

}
