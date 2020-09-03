package com.company;

public class Main
{
    public static class Sobaka
    {
        private double weight;
        private String name;

         Sobaka(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }
        public void toStringS()
        {

            System.out.println(name);
            System.out.println(weight);

        }
    }
    public static void main(String[] args)
    {
        Sobaka dog = new Sobaka("Bobik", 25.0);
        dog.toStringS();
    }
}