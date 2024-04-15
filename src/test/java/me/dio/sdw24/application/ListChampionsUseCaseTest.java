package me.dio.sdw24.application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import me.dio.sdw24.domain.model.Champions;

@SpringBootTest
public class ListChampionsUseCaseTest {
   
    @Autowired
    private ListChampionsUseCase listChampionsUseCase;

    public void testListChampions(){
        List<Champions> champions = listChampionsUseCase.findAll();
    
        Assertions.assertEquals(12, champions.size());
    }
}
