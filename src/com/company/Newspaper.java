package com.company;

import javax.swing.*;

public class Newspaper
{
    //methods
    public Newspaper (String name, int year, int month, int dayOfMonth, boolean isFinnish)
    {
        this.name = name;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
    }

    public String getName()
    {
        return name;
    }

    public void setDate (int year, int month, int dayOfMonth)
    {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDayOfMonth()
    {
        return dayOfMonth;
    }

    public boolean isFinnish()
    {
        return isFinnish;
    }

    public String toString()
    {
        String finnish;
        if (isFinnish)
            finnish = "Finnish newspaper";
        else
            finnish = "Not Finnish newspaper";
        return name + " " + dayOfMonth + "." + month + "." + year + " (" + finnish + ")";
    }

    //fields
    private String name;;
    private int year, month, dayOfMonth;
    private boolean isFinnish;
}
