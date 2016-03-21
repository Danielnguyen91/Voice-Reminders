package com.mobile_app.danien.voicereminder;

/**
 * Created by Tamchau on 3/19/2016.
 */
public class ReminderItem {
    private String headLine;
    private Boolean isAlarm;
    private String date;

    public String getHeadLine()
    {
        return headLine;
    }

    public void setHeadLine(String line)
    {
        headLine =line;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public Boolean getAlarm()
    {
        return isAlarm;
    }


}
