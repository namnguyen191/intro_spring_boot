package dev.fullstacknam.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
  public int[] sort(int[] numbers) {

    return numbers;
  }
}
