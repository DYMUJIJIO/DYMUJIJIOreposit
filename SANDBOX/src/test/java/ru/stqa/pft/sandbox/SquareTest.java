package ru.stqa.pft.sandbox;


import org.testng.annotations.Test;

public class SquareTest {

  @Test
  public void testArea() {
    Square s = new Square(5);
    assert s.area() == 25;
  }
}
