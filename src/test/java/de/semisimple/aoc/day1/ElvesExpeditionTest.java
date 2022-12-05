package de.semisimple.aoc.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.Test;

class ElvesExpeditionTest {

  Path path = Paths.get("./src/test/resources/day1/sample.txt");

  @Test
  void parse_sampleInput_shouldParseElves() throws IOException {
    final List<String> lines = Files.readAllLines(path);
    final ElvesExpedition elvesExpedition = ElvesExpedition.scan(lines);
    final var elves = elvesExpedition.getElves().size();

    assertEquals(5, elves);
  }

  @Test
  void findMaxCalories_sampleInput_shouldReturnMaxCalories() throws IOException {
    final List<String> lines = Files.readAllLines(path);
    final ElvesExpedition elvesExpedition = ElvesExpedition.scan(lines);
    long maxCalories = elvesExpedition.findMaxCaloriesCarried();

    assertEquals(24000L, maxCalories);
  }

  @Test
  void calculateTopThreeSum_sampleInput_shouldReturnTopThreeCalories() throws IOException {
    final List<String> lines = Files.readAllLines(path);
    final ElvesExpedition elvesExpedition = ElvesExpedition.scan(lines);
    long maxCalories = elvesExpedition.calculateTopThreeSum();

    assertEquals(45000L, maxCalories);
  }
}