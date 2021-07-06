package ru.stqa.pft.sandbox;

import com.sun.org.apache.xpath.internal.objects.XString;

public class MyFirstProgram {
    public static void main(String[] args) {
    Point b = new Point(4.5,4.5);
      System.out.println("расстояние между двумя точками X и Y = " + b.distance(b));

    }
}