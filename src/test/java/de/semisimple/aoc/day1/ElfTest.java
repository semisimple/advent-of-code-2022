package de.semisimple.aoc.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ElfTest {

  @Test
  void sumCalories_shouldReturnSumOfCalories() {
    final var elf = new Elf();
    elf.addItem(300L);
    elf.addItem(200L);
    elf.addItem(500L);
    long sum = elf.sumCalories();

    assertEquals(1000L, sum);


  }
}