package de.semisimple.aoc.day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ElvesExpedition {

  private final ArrayList<Elf> elves;

  private ElvesExpedition(ArrayList<Elf> elves) {
    this.elves = elves;
  }

  public static ElvesExpedition scan(List<String> lines) {
    final ArrayList<Elf> elves = parseElves(lines);

    return new ElvesExpedition(elves);
  }

  private static ArrayList<Elf> parseElves(List<String> lines) {
    final var elves = new ArrayList<Elf>();
    var elf = new Elf();
    elves.add(elf);

    for (var line : lines) {
      if (line.isEmpty()) {
        elf = new Elf();
        elves.add(elf);
      } else {
        elf.addItem(Long.parseLong(line));
      }
    }

    return elves;
  }

  public ArrayList<Elf> getElves() {
    return elves;
  }

  public long findMaxCaloriesCarried() {
    return elves.parallelStream()
        .mapToLong(Elf::sumCalories)
        .max()
        .orElse(0);
  }

  public long calculateTopThreeSum() {
    return findTopThree().stream()
        .mapToLong(Elf::sumCalories)
        .sum();
  }

  private List<Elf> findTopThree() {
    return elves.parallelStream()
        .sorted(Comparator.comparing(Elf::sumCalories).reversed())
        .limit(3)
        .toList();
  }


}
