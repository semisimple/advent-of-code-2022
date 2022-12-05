package de.semisimple.aoc.day1;

public class Elf {

  long calorieSum = 0;

  public long sumCalories() {
    return calorieSum;
  }

  public void addItem(long l) {
    calorieSum += l;
  }
}
