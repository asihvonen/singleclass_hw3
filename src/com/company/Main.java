package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Newspaper[] newspapers = new Newspaper[2];
        newspapers[0] = new Newspaper ("Helsingin Sanomat", 2021, 11, 24, true);
        newspapers[1] = new Newspaper ("The Wall Street Journal", 2007, 7, 14, false);
        for (Newspaper n : newspapers)
            System.out.println (n);
    }
}
