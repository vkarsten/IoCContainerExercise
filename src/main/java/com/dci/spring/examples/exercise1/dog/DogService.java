package com.dci.spring.examples.exercise1.dog;

import com.dci.spring.examples.exercise1.dog.factory.DogFactory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogService {

  private final DogFactory dogFactory;

  @Autowired
  public DogService(DogFactory dogFactory) {
    this.dogFactory = dogFactory;
  }

  public List<Dog> getDogs() {
    ArrayList<Dog> dogs = new ArrayList<>();

    dogs.add(dogFactory.create(1L, "Lala", Breed.BULLDOG));
    dogs.add(dogFactory.create(2L, "Amanda", Breed.GOLDEN_RETRIEVER));
    dogs.add(dogFactory.create(3L, "Waldi", Breed.GERMAN_SHEPHERD));

    return dogs;
  }
}
