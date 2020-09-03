package com.company;

public class Main {
    public static class ball
    {
        private double years;
        private double plays;
        private String color;

        ball(double years, double plays, String color)
        {
            this.years = years;
            this.plays = plays;
            this.color = color;
        }

        public void toStringS() {
            System.out.println(years);
            System.out.println(plays);
            System.out.println(color);
        }
    }

    public static void main(String[] args) {
        ball q = new ball(5, 200, "white");
        q.toStringS();
    }
}
