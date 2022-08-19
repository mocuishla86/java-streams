package com.amigoscode.examples;


import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreams {

    @Test
    public void range() throws Exception {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        IntStream intStream = IntStream.range(0, 10);
        System.out.println("inStream exclusive");
        intStream.forEach(System.out::println);

        IntStream intStreamInclusive = IntStream.rangeClosed(0, 10);
        System.out.println("inStream inclusive");
        intStreamInclusive.forEach(System.out::println);
    }

    @Test
    public void rangeIteratingLists() throws Exception {
        List<Person> people = MockData.getPeople();
        IntStream.range(0, people.size()).forEach(index -> {
            System.out.println(people.get(index));
        });
    }

    @Test
    public void intStreamIterate() {
        IntStream.iterate(0, value -> value + 1).limit(11).forEach(System.out::println);
    }
}
