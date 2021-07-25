package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testDistance() {
    Point p = new Point(5, 6);
    assert p.distance(p) == 0;
  }

  @Test
  public void testDistance2() {
    Point p = new Point(4, 4);
    assert p.distance(p) == 0;
  }

  @Test
  public void testDistance3() {
    Point p = new Point(3, 8);
    assert p.distance(p) == 0;
  }

  @Test
  public void testDistance4() {
    Point p = new Point(5, 4);
    assert p.distance(p) == 0;
  }
}