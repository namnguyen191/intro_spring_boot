package dev.fullstacknam.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
  @Autowired
  private SortAlgorithm sortAlgorithm;

  // For mandatory dependencies, use constructor injection
  // public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
  // this.sortAlgorithm = sortAlgorithm;
  // }

  // For optional dependencies, use setter/getter injection (same as not providing
  // any setter/getter)
  // public SortAlgorithm getSortAlgorithm() {
  // return sortAlgorithm;
  // }

  // public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
  // this.sortAlgorithm = sortAlgorithm;
  // }

  public int binarySearch(int[] numbers, int target) {
    int[] sortedNum = sortAlgorithm.sort(numbers);
    System.out.println(sortAlgorithm);

    int resultIndex = -1;

    return resultIndex;
  }

}
