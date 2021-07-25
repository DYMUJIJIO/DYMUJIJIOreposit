package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class RectangleTest {

  @Test
  public void testArea() {
    Rectangle r = new Rectangle(5, 6);
    assert r.area() == 30;
  }
}

