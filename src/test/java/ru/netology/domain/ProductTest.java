package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductTest {

    @Test
    public void shouldMatchName() {
        Product book = new Book(1, "Книга 'Бессонница'", 1000, "Стивен Кинг");
        String search = "Бессонница";
        assertTrue(book.matches(search));

    }

    @Test
    public void shouldMatchAuthor() {
        Product book = new Book(1, "Книга 'Бессонница'", 1000, "Стивен Кинг");
        String search = "Кинг";
        assertTrue(book.matches(search));
    }

    @Test
    public void shouldMatchProducer() {
        Product smartphone = new Smartphone(3, "Смартфон Galaxy A50", 30000, "Samsung");
        String search = "Samsung";
        assertTrue(smartphone.matches(search));
    }

    @Test
    public void shouldNoMatches() {
        Product smartphone = new Smartphone(3, "Смартфон Galaxy A50", 30000, "Samsung");
        String search = "Книга";
        assertFalse(smartphone.matches(search));
    }

}