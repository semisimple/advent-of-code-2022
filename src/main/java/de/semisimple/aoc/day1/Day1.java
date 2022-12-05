package de.semisimple.aoc.day1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Day1 {

  public static void main(String[] args) {
    Path path = Paths.get("./src/main/resources/day1/input.txt");

    try (Stream<String> lines = Files.lines(path)) {
      final ElvesExpedition expedition = ElvesExpedition.scan(lines.toList());
      final long maxCaloriesCarried = expedition.findMaxCaloriesCarried();
      final long topThreeSum = expedition.calculateTopThreeSum();

      System.out.println("Max calories: " + maxCaloriesCarried);
      System.out.println("Top Three calories summed: " + topThreeSum);
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
