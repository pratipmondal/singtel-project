package com.singtel.assignment.behaviours;

import java.util.Locale;
import java.util.ResourceBundle;

@FunctionalInterface
public interface Singable {

    void sing();

    default ResourceBundle getBundle(){
        Locale locale= Locale.getDefault();

        if(locale==null){
            locale= Locale.ENGLISH;
        }

        ResourceBundle bundleFR = ResourceBundle.getBundle("ApplicationMessages", locale);
        return bundleFR;
    }


    default String getSound(String livingthing){
      StringBuffer sound= new StringBuffer(livingthing).append(".sound");
      return    getBundle().getString(sound.toString());
    }

}
