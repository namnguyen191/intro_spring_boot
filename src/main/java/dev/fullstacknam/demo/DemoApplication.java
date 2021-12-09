package dev.fullstacknam.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

  private static ConfigurableApplicationContext applicationContext;

  public static void main(String[] args) {
    // BinarySearchImpl binarySearchImp = new BinarySearchImpl(new
    // QuickSortAlgorithm());

    applicationContext = SpringApplication.run(DemoApplication.class, args);

    BinarySearchImpl binarySearchBean = applicationContext.getBean(BinarySearchImpl.class);

    int foundIndex = binarySearchBean.binarySearch(new int[] { 12, 4, 6 }, 3);

    System.out.println(foundIndex);

  }

}
