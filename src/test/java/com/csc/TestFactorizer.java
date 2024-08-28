package com.csc;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  @Test
  public void testTwo() {
    assertEquals(Arrays.asList(2), factorizer.primes(2));
  }

  @Test
  public void testSix() {
    assertEquals(Arrays.asList(2, 3), factorizer.primes(6));
  }

  @Test
  public void testTen() {
    assertEquals(Arrays.asList(2, 5), factorizer.primes(10));
  }

  @Test
  public void test35() {
    assertEquals(Arrays.asList(5, 7), factorizer.primes(35));
  }

  @Test
  public void test70() {
    assertEquals(Arrays.asList(2, 5, 7), factorizer.primes(70));
  }

  @Test
  public void testnull() {
    assertEquals(null, factorizer.primes(1));
  }
}
