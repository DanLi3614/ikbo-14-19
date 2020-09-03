package com.company;

public class Main
{

    public static class book
    {
        private double years;
        private String author;
        private String color;



        book(double years, String author, String color)
        {
            this.years = years;
            this.author = author;
            this.color = color;
        }

        public void toStringS()
        {
            System.out.println(years);
            System.out.println(author);
            System.out.println(color);
        }
    }

    public static void main(String[] args)
    {
        book k = new book (5,"Puskin", "red" );
        k.toStringS();

    }
}